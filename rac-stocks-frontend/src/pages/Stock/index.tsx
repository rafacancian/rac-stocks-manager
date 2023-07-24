import { useEffect, useState } from "react";
import { getStockByCode, getStocks } from "../../api/axios/hooks";
import { FormControl, Grid, InputLabel, MenuItem, Select, Typography } from "@mui/material";
import AnalyticCard from "../../components/AnalyticCard";
import Loader from "../../components/Loader";
import StockTableSingle from "../../components/StockTableSingle";
import Box from "../../components/Box";
import MainCard from "../../components/MainCard";
import * as React from 'react';
import { SelectChangeEvent } from '@mui/material/Select';
import IStockSimple from "../../interfaces/IStockSimple";
import IStockMethods from "../../interfaces/IStockMethods";
import MonthlyBarChart from "../../components/MonthlyBarChart";
import AreaChart from "../../components/AreaChart";
import MonthlyAreaChart from "../../components/MonthlyAreaChart";

function Stock() {

    const [stock, setStock] = useState<IStockMethods>();
    const [stocks, setStocks] = useState<IStockSimple[]>();
    const [stockSelected, setStockSelected] = React.useState('');
    const [loading, setLoading] = useState(true);

    const handleChange = (event: SelectChangeEvent) => {
        setLoading(true);
        fetchData(event.target.value);
    };

    const fetchData = (code: string) => {
        setStockSelected(code);
        getStockByCode(code).then(response => {
            setLoading(false)
            if (response !== null && response !== undefined) {
                console.log("new stock selected: " + response);
                setStock(response!)
            }
        });
    }

    useEffect(() => {
        getStocks().then(response => {
            setStocks(response)
            debugger
        });
        setLoading(false)
    }, [stock, stockSelected]);

    if (loading) {
        return (<>
            <Loader />
        </>)
    }

    return (
        <>
            <Grid container spacing={1}>
                <Grid item xs={12}>
                    <MainCard>
                        <Grid textAlign={"center"} marginTop={5}>

                            <FormControl sx={{ m: 1, width: 300 }}>
                                <InputLabel id="demo-simple-select-label">Select the stock</InputLabel>
                                <Select
                                    labelId="demo-simple-select-label"
                                    id="demo-simple-select"
                                    value={stockSelected}
                                    label="Stock"
                                    onChange={handleChange}
                                >
                                    {stocks?.map((stock) => (
                                        <MenuItem
                                            key={stock.code}
                                            value={stock.code}
                                        >
                                            {stock.code} - {stock.name}
                                        </MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </Grid>

                        {stock != null && <div>
                            <Grid container padding={5}>
                                <Grid container rowSpacing={4.5} columnSpacing={2.75}>
                                    <Grid item xs={6} sm={4} md={3} lg={2} margin={2}>
                                        <Box shadow="1" name={stock.name} code={stock.code} key={stock.code} />
                                    </Grid>
                                    <Grid item xs={12} sm={6} md={4} lg={1.5}>
                                        <AnalyticCard title="Valor atual" count={stock.currentValue} percentage={null} color="success" />
                                    </Grid>
                                    <Grid item xs={12} sm={6} md={4} lg={1.5}>
                                        <AnalyticCard title={"Min. 52 semanas"} count={"R$ 22,45"} percentage={null} color="success" />
                                    </Grid>
                                    <Grid item xs={12} sm={6} md={4} lg={1.5}>
                                        <AnalyticCard title={"Max. 52 semanas"} count={"R$ 30,24"} percentage={null} color="success" />
                                    </Grid>
                                    <Grid item xs={12} sm={6} md={4} lg={1.5}>
                                        <AnalyticCard title={"Dividend Yield"} count={"5,45%"} percentage={null} color="success" />
                                    </Grid>
                                    <Grid item xs={12} sm={6} md={4} lg={1.5}>
                                        <AnalyticCard title={"Valorização no ano"} count={"18,70%"} percentage={null} color="success" />
                                    </Grid>

                                    <Grid item xs={12} sm={6} md={4} lg={8}>
                                        <MonthlyAreaChart />
                                    </Grid>
                                    <Grid item xs={12} sm={6} md={4} lg={4}>
                                        <MonthlyBarChart />
                                    </Grid>
                                </Grid>
                            </Grid>

                            <Grid container >
                                <Grid item xs={6} sm={4} md={3} lg={6}>
                                    <StockTableSingle stock={stock} key={stock.code} method="Graham" />
                                </Grid>
                                <Grid item xs={12} sm={6} md={3} lg={6}>
                                    <StockTableSingle stock={stock} key={stock.code} method="Bazin" />
                                </Grid>
                                <Grid item xs={12} sm={6} md={3} lg={6}>
                                    <StockTableSingle stock={stock} key={stock.code} method="Wacc" />
                                </Grid>
                                <Grid item xs={12} sm={6} md={3} lg={6}>
                                    <StockTableSingle stock={stock} key={stock.code} method="Barsi" />
                                </Grid>
                            </Grid>
                        </div>
                        }

                        {stock == null &&
                            <div>
                                <Grid container padding={5}>
                                    <Grid container rowSpacing={4.5} columnSpacing={2.75}>
                                        <Typography variant="h5" align={"center"} padding={"2px"}>
                                            select a stock
                                        </Typography>
                                    </Grid>
                                </Grid>
                            </div>
                        }
                    </MainCard>
                </Grid>
            </Grid>
        </>
    );
}

export default Stock;

