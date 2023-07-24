package com.racstockmanager.b3.core.methods.cheaper;

import com.racstockmanager.b3.core.methods.bazin.ValidateError;
import com.racstockmanager.b3.core.model.stock.*;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CheaperCalculation extends CalculatorUtils {

    public StockMethod execute(Stock stock, IndicatorsValuations indicatorsValuations,
                               IndicatorsEfficiency indicatorsEfficiency,
                               IndicatorsProfitability indicatorsProfitability,
                               IndicatorsGrowth indicatorsGrowth,
                               Boolean isJudicialRecovery) {
        /*
        Filtros
            - Ações com mais de 1 milhão de liquidez por dia
            - Lucro operacional positivo (EV/EBITDA)
            - Bancos e seguradoras não tem EV/EBITDA
            - Empresas em recuperação judicial

        Calculos
            Earning Yield = Lucro operacional / Total enterprise value
            Total enterprise value = Divida liquida(divida - dinheiro em caixa) + Valor de mercado

        Margem bit
            (EBIT / Receita líquida) x 100
            https://investidorsardinha.r7.com/aprender/margem-ebit/
            Se zerado é sinal de ser banco ou seguradora e com valores negativos são empresas que não geram lucros nem das suas operações
            EV/EBIT quanto menor melhor
        */


        //final Double maximumPrice = valuations.dividendYield12Month() / 0.06;
        //final String maximumPriceFormatted = CurrencyUtils.convertDoubleToBRL(maximumPrice);
        //double upside = calculateUpside(valuations.currentValue(), maximumPrice);
        final List<ValidateError> validationErrors = validation(stock, indicatorsValuations, indicatorsEfficiency, indicatorsProfitability, indicatorsGrowth, isJudicialRecovery);

        return StockMethod.builder()
                .isValid(validationErrors.isEmpty())
                .maximumPrice(null)
                .upsideFormatted(null)
                .upside(null)
                .description("Deprecated")
                .errors(validationErrors)
                .build();

    }

    private List<ValidateError> validation(Stock stock, IndicatorsValuations indicatorsValuations, IndicatorsEfficiency indicatorsEfficiency,
                                           IndicatorsProfitability indicatorsProfitability, IndicatorsGrowth indicatorsGrowth, Boolean isJudicialRecovery) {
        List<ValidateError> errors = new ArrayList<>();
        validateJuricalRecovery(errors, isJudicialRecovery);
        validateDailyLiquidity(errors, indicatorsValuations.dailyLiquidity());
        validateEvEbit(errors, indicatorsValuations.evEbit());
        validateCagr(errors, indicatorsValuations, indicatorsGrowth);
        validateNetMargin(errors, stock, indicatorsValuations, indicatorsEfficiency);
        return errors;
    }

    private void validateJuricalRecovery(List<ValidateError> errors, Boolean isJudicialRecovery) {
        if (isJudicialRecovery) {
            errors.add(new ValidateError(
                    "Stock in judicial recovery",
                    "it is not recommended to invest in stocks with judicial recovery",
                    "A recuperação judicial é um processo legal utilizado por empresas que estão enfrentando dificuldades financeiras e buscam reorganizar suas atividades para superar a crise e evitar a falência. Durante o período de recuperação judicial, a empresa deve cumprir algumas obrigações e seguir um plano de reestruturação aprovado pelo juiz responsável pelo caso."));
        }
    }

    private void validateDailyLiquidity(List<ValidateError> errors, Double dailyLiquidity) {
        if (dailyLiquidity < 1000000) {
            errors.add(new ValidateError(
                    "stock with little daily liquidity. Average Liquidity daily: " + dailyLiquidity,
                    "it is not recommended to invest in stock with daily liquidity less than 1 million per day",
                    "A liquidez diária de uma ação refere-se à facilidade com que ela pode ser comprada ou vendida no mercado em um determinado dia de negociação. É um indicador da quantidade de negócios realizados com essa ação e da disponibilidade de compradores e vendedores dispostos a negociá-la."));
        }
    }

    private void validateEvEbit(List<ValidateError> errors, Double evEbit) {
        if (evEbit <= 0) {
            errors.add(new ValidateError(
                    "Ev Ebitda must be positive. Ev Ebitda: " + evEbit,
                    "it is not recommended to invest in stock with little daily liquidity",
                    ""));
        }
    }

    private void validateCagr(List<ValidateError> errors, IndicatorsValuations indicatorsValuations, IndicatorsGrowth indicatorsGrowth) {
        if (indicatorsGrowth.cagrReceita() < 8 && indicatorsValuations.pl() > 3) {
            errors.add(new ValidateError("CAGR net revenue less than 10",
                    "CAGR Net revenue: " + indicatorsGrowth.cagrReceita() + " PL: " + indicatorsValuations.pl(),
                    "more details"));
        }
        if (indicatorsGrowth.cagrLucros() < 8 && indicatorsValuations.pl() > 3) {
            errors.add(new ValidateError("CAGR profit less than 10",
                    "CAGR Profit: " + indicatorsGrowth.cagrLucros() + " PL: " + indicatorsValuations.pl(),
                    "more details"));
        }
    }

    private void validateNetMargin(List<ValidateError> errors, Stock stock, IndicatorsValuations indicatorsValuations, IndicatorsEfficiency indicatorsEfficiency) {
        if ("VAREJO".equalsIgnoreCase(stock.getSegment()) && indicatorsEfficiency.margemLiquida() < 3) {
            errors.add(new ValidateError("Margem liquida para varejo precisa ser maior que 3",
                    "Margem liquida: " + indicatorsEfficiency.margemLiquida() + " PL: " + indicatorsValuations.pl(),
                    "more details"));
        } else if (indicatorsEfficiency.margemLiquida() < 10) {
            errors.add(new ValidateError("Margem liquida deve ser maior que 10",
                    "Margem liquida: " + indicatorsEfficiency.margemLiquida(),
                    "more details"));
        }
    }
}
