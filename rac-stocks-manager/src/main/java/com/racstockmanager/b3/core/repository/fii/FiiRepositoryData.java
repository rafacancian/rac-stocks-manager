package com.racstockmanager.b3.core.repository.fii;

import com.racstockmanager.b3.core.model.fii.Fii;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FiiRepositoryData {

    public static Fii BCFF11 = new Fii("BTG FUNDO DE FUNDOS", "BCFF11", "", "");
    public static Fii BTLG11 = new Fii("BTG PACTUAL LOGISTICA FDO INV IMOB - FII", "BTLG11", "", "");
    public static Fii HFOF11 = new Fii("HEDGE TOP FOFII 3", "HFOF11", "", "");
    public static Fii HSML11 = new Fii("HSI MALL FDO INV IMOB", "HSML11", "", "");
    public static Fii IRDM11 = new Fii("IRIDIUM RECEBÍVEIS IMOBILIÁRIOS", "IRDM11", "", "");
    public static Fii MCCI11 = new Fii("FDO INV. MAUA CAPITAL RECEBIVEIS IMOB. - FII", "MCCI11", "", "");
    public static Fii MXRF11 = new Fii("MAXI RENDA", "MXRF11", "", "");
    public static Fii PVBI11 = new Fii("FDO. INV. IMOB. VBI PRIME PROPERTIES", "PVBI11", "", "");
    public static Fii RBRP11 = new Fii("RBR PROPERTIES", "RBRP11", "", "");
    public static Fii RECR11 = new Fii("FII REC RECEBÍVEIS IMOBILIÁRIOS", "RECR11", "", "");
    public static Fii SDIL11 = new Fii("SDI LOGÍSTICA RIO", "SDIL11", "", "");
    public static Fii SNFF11 = new Fii("SUNO FUNDO DE FUNDOS", "SNFF11", "", "");
    public static Fii VGIP11 = new Fii("VALORA CRI ÍNDICE DE PREÇO", "VGIP11", "", "");
    public static Fii VILG11 = new Fii("VINCI LOGÍSTICA FDO INV IMOB", "VILG11", "", "");
    public static Fii VISC11 = new Fii("VINCI SHOPPING CENTERS", "VISC11", "", "");

    public static Set<Fii> getAll() {
        return Set.of(BCFF11, BTLG11, HFOF11, HSML11, IRDM11, MCCI11, MXRF11, PVBI11, RBRP11, RECR11,
                SDIL11, SNFF11, VGIP11, VILG11, VISC11);
    }

    public static Set<Fii> getSunoFIIs() {
        return Set.of(BCFF11, BTLG11, HFOF11, HSML11, IRDM11, MCCI11, MXRF11, PVBI11, RBRP11, RECR11,
                SDIL11, SNFF11, VGIP11, VILG11, VISC11);
    }
}
