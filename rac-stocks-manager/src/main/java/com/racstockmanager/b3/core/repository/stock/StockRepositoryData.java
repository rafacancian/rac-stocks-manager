package com.racstockmanager.b3.core.repository.stock;

import com.racstockmanager.b3.core.model.stock.Sector;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.repository.stock.sectors.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import static com.racstockmanager.b3.core.repository.stock.sectors.BasicMaterials.*;
import static com.racstockmanager.b3.core.repository.stock.sectors.FinancialAndOthers.*;
import static com.racstockmanager.b3.core.repository.stock.sectors.Health.BLAU3;
import static com.racstockmanager.b3.core.repository.stock.sectors.Health.PNVL3;
import static com.racstockmanager.b3.core.repository.stock.sectors.NoCyclicConsumption.*;
import static com.racstockmanager.b3.core.repository.stock.sectors.OilGasFuels.PETR4;
import static com.racstockmanager.b3.core.repository.stock.sectors.PublicUtility.*;

@Service
public class StockRepositoryData {

    private StockRepositoryData() {
    }

    public static Set<Stock> getBySector(Sector sector) {
        return switch (sector) {
            case BENS_INDUSTRIAIS -> IndustrialGoods.getAll();
            case COMUNICACOES -> Comunications.getAll();
            case CONSUMO_CICLICO -> CyclicConsumption.getAll();
            case CONSUMO_NAO_CICLICO -> NoCyclicConsumption.getAll();
            case FINANCEIRO_E_OUTROS -> FinancialAndOthers.getAll();
            case MATERIAIS_BASICOS -> BasicMaterials.getAll();
            case PETROLEO_GAS_BIOCOMBUSTIVEIS -> OilGasFuels.getAll();
            case SAUDE -> Health.getAll();
            case TECNOLOGIA_DA_INFORMACAO -> Technologies.getAll();
            case UTILIDADE_PUBLICA -> PublicUtility.getAll();
        };
    }

    public static Set<Stock> getAll() {
        Set<Stock> stocks = new HashSet<>();
        stocks.addAll(IndustrialGoods.getAll());
        stocks.addAll(Comunications.getAll());
        stocks.addAll(CyclicConsumption.getAll());
        stocks.addAll(NoCyclicConsumption.getAll());
        stocks.addAll(FinancialAndOthers.getAll());
        stocks.addAll(BasicMaterials.getAll());
        stocks.addAll(OilGasFuels.getAll());
        stocks.addAll(Health.getAll());
        stocks.addAll(Technologies.getAll());
        stocks.addAll(PublicUtility.getAll());

        return stocks;
    }

    public static Set<Stock> getRelevents() {
        Set<Stock> stocks = new HashSet<>();
        stocks.addAll(IndustrialGoods.getRelevents());
        stocks.addAll(Comunications.getRelevents());
        stocks.addAll(CyclicConsumption.getRelevents());
        stocks.addAll(NoCyclicConsumption.getRelevents());
        stocks.addAll(FinancialAndOthers.getRelevents());
        stocks.addAll(BasicMaterials.getRelevents());
        stocks.addAll(OilGasFuels.getRelevents());
        stocks.addAll(Health.getRelevents());
        stocks.addAll(Technologies.getRelevents());
        stocks.addAll(PublicUtility.getRelevents());

        return stocks;
    }

    public static Set<Stock> getTopsSunoValues() {
        return Set.of(IndustrialGoods.getStockByCode("VAMO3"),
                IndustrialGoods.getStockByCode("RAIL3"),
                IndustrialGoods.getStockByCode("CCRO3"),
                Comunications.getStockByCode("TIMS3"),
                CyclicConsumption.getStockByCode("EZTC3"),
                CyclicConsumption.getStockByCode("MOVI3"),
                CyclicConsumption.getStockByCode("MYPK3"),
                CyclicConsumption.getStockByCode("TFCO4"),
                CyclicConsumption.getStockByCode("CVCB3"),
                CyclicConsumption.getStockByCode("VIVA3"),
                BLAU3, PNVL3, TTEN3, BRBI11, SULA11, GMAT3, IGTI11, KLBN11, NEOE3, BRKM5);
    }

    public static Set<Stock> getTopsSunoDividends() {
        return Set.of(IndustrialGoods.getStockByCode("TUPY3"),
                Comunications.getStockByCode("VIVT3"),
                CyclicConsumption.getStockByCode("LEVE3"),
                CyclicConsumption.getStockByCode("MRVE3"),
                CyclicConsumption.getStockByCode("GRND3"),
                EGIE3, VALE3, ELET3, BBAS3, PETR4, BBSE3, AGRO3, ENBR3, ALUP11, B3SA3, CPLE6, WIZC3, UNIP6);
    }
}
