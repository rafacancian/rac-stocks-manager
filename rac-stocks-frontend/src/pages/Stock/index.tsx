import { useEffect, useState } from "react";
import { getStockByCode } from "../../api/axios/hooks";
import { Grid } from "@mui/material";
import AnalyticCard from "../../components/AnalyticCard";
import IStock from "../../interfaces/IStock";
import Loader from "../../components/Loader";
import StockTableSingle from "../../components/StockTableSingle";
import Box from "../../components/Box";

function Stock() {

    const [stock, setStock] = useState<IStock>();

    useEffect(() => {
        getStockByCode().then(response => {
            setStock(response)
        });
    }, [])

    if (stock == null) {
        return (<>
            <Loader />
        </>)
    }

    return (
        <>
            <div className="StockPage">
                <Grid container rowSpacing={4.5} columnSpacing={2.75}>
                    <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                        <Box shadow="1" />
                    </Grid>

                    <Grid item xs={12} sm={6} md={4} lg={2}>
                        <AnalyticCard title={"BBAS3"} count={"R$49,70"} percentage={63.09} color="success" extra={"Banco do Brasil"} />
                    </Grid>
                    <Grid item xs={12} sm={6} md={4} lg={2}>
                        <AnalyticCard title={"BBAS3"} count={"R$49,70"} percentage={63.09} color="success" extra={"Banco do Brasil"} />
                    </Grid>
                </Grid>

                <div className="StockPage">
                    <StockTableSingle stock={stock} method="Bazin" />
                    <StockTableSingle stock={stock} method="graham" />
                    <StockTableSingle stock={stock} method="wacc" />
                </div>
            </div>
        </>
    );
}

export default Stock;

