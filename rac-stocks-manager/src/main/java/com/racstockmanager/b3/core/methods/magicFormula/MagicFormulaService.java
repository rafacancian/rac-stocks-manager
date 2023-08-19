package com.racstockmanager.b3.core.methods.magicFormula;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.core.methods.general.stock.StockService;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.Stocks;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MagicFormulaService {

    @Autowired
    private StockService stockService;

    public Set<StockShortDto> getTops() {

        Stocks stocks = stockService.getAllRelevantFull();

        LinkedHashSet<Stock> stocksFiltered = stocks.getStocks().stream()
                .filter(this::filterEvEbitNegativeOrZero)
                .filter(this::filterMargemLiquidaDestorcida)
                .filter(this::filterROEDestorcido)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        List<Stock> stocksSortedByRoe = stocksFiltered.stream()
                .sorted(Comparator.comparing(MagicFormulaService::sortedByROE).reversed())
                .collect(Collectors.toList());

        Set<Stock> stocksWithRoeRanking = IntStream.range(0, stocksSortedByRoe.size())
                .mapToObj(i -> {
                    Stock stock = stocksSortedByRoe.get(i);
                    setRoeRanking(stock, i + 1);
                    return stock;
                })
                .collect(Collectors.toCollection(LinkedHashSet::new));

/*        LinkedHashSet<Stock> stocksWithRoeRanking = stocksSortedByRoe.stream()
                .map(stock -> setRoeRanking(stock, stocks.indexOf(stock)))
                .collect(Collectors.toCollection(LinkedHashSet::new));*/

        List<Stock> stocksSortedByEarningYield = stocksWithRoeRanking.stream()
                .sorted(Comparator.comparing(MagicFormulaService::sortedByYearningYield).reversed())
                .collect(Collectors.toList());

        Set<Stock> stocksWithEarningYieldRanking = IntStream.range(0, stocksSortedByRoe.size())
                .mapToObj(i -> {
                    Stock stock = stocksSortedByEarningYield.get(i);
                    setEarningYieldRanking(stock, i + 1);
                    return stock;
                })
                .collect(Collectors.toCollection(LinkedHashSet::new));

        /*LinkedHashSet<Stock> stocksWithEarningYieldRanking = stocksSortedByEarningYield.stream()
                .map(stock -> setEarningYieldRanking(stock, stocks.indexOf(stock)))
                .collect(Collectors.toCollection(LinkedHashSet::new));*/

        LinkedHashSet<Stock> stocksWithMagicFormulaRanking = stocksWithEarningYieldRanking.stream()
                .map(this::setMagicFormulaRanking)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        return stocksWithMagicFormulaRanking.stream()
                .sorted(Comparator.comparingInt(MagicFormulaService::sortedByMagicFormula))
                .map(this::stockShortCheaperBuild)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        /*
        stocks.stream()
                .filter(this::filterEvEbitNegativeOrZero)
                .filter(this::filterMargemLiquidaDestorcida)
                .sorted(Comparator.comparing(MagicFormulaService::sortedByROE).reversed())
                .map(stock -> setRoeRanking(stock, stocks.indexOf(stock)))
                .sorted(Comparator.comparing(MagicFormulaService::sortedByYearningYield).reversed())
                .map(stock -> setEarningYieldRanking(stock, stocks.indexOf(stock)))
                .map(this::setMagicFormulaRanking)
                .sorted(Comparator.comparingInt(MagicFormulaService::sortedByMagicFormula))
                .map(this::stockShortCheaperBuild)
                .collect(Collectors.toCollection(LinkedHashSet::new));
         */
    }

    private static int sortedByMagicFormula(Stock stock) {
        return stock.getRanking().getMagicFormula();
    }


    private Stock setMagicFormulaRanking(Stock stock) {
        stock.getRanking().setMagicFormula(stock.getRanking().getRoe() + stock.getRanking().getEarningYield());
        return stock;
    }

    private Stock setEarningYieldRanking(Stock stock, int index) {
        stock.getRanking().setEarningYield(index);
        return stock;
    }

    private Stock setRoeRanking(Stock stock, int index) {
        stock.getRanking().setRoe(index);
        return stock;
    }

    private static Double sortedByROE(Stock stock) {
        return stock.getIndicators().getIndicatorsProfitability().roe();
    }


    private static Double sortedByYearningYield(Stock stock) {
        return stock.getIndicators().getIndicatorsValuations().earningYield();
    }

    private boolean filterMargemLiquidaDestorcida(Stock stock) {
        if (stock.getIndicators().getIndicatorsEfficiency().margemLiquida() > 150) {
            return false;
        }
        return true;
    }

    private boolean filterEvEbitNegativeOrZero(Stock stock) {
        if (stock.getIndicators().getIndicatorsValuations().evEbit() <= 0) {
            return false;
        }
        return true;
    }

    private boolean filterROEDestorcido(Stock stock) {
        if (stock.getIndicators().getIndicatorsProfitability().roe() > 200) {
            return false;
        }
        return true;
    }

    private StockShortDto stockShortCheaperBuild(Stock stock) {
        return StockShortDto.builder()
                .code(stock.getCode())
                .name(stock.getName())
                .currentPrice(CurrencyUtils.convertDoubleToBRL(stock.getIndicators().getIndicatorsValuations().currentValue()))
                .dividendYield(CalculatorUtils.convertDoubleToPercentage(stock.getIndicators().getIndicatorsValuations().dividendYield()))
                .valorization12M(stock.getIndicators().getIndicatorsValuations().valorization12Month())
                .earningYield(CalculatorUtils.convertDoubleToPercentage(stock.getIndicators().getIndicatorsValuations().earningYield()))
                .roe(CalculatorUtils.convertDoubleToPercentage(stock.getIndicators().getIndicatorsProfitability().roe()))
                .ranking(stock.getRanking())
                .showErrors(false)
                .build();
    }
}
