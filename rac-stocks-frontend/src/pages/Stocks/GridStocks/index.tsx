import { FormControl, Grid, InputLabel, MenuItem, Select } from "@mui/material";
import MainCard from "../../../components/MainCard";
import * as React from 'react';
import { getStockBySector, getStockBySegment, getStocks } from "../../../api/axios/hooks";
import IStockSimple from "../../../interfaces/IStockSimple";
import { useEffect, useState } from "react";
import Loader from "../../../components/Loader";
import BoxItem from "../../../components/BoxItem";
import { SelectChangeEvent } from '@mui/material/Select';

const names = [
    'All',
    'Consumo Ciclico',
    'Consumo não Ciclico',
    'Utilidade Pública',
    'Bens Industriais',
    'Materiais Básicos',
    'Financeiro e Outros',
    'Tecnologia da informação',
    'Saúde',
    'Petróleo. Gás e Biocombustiveis',
    'Comunicações'
];

function GridStocks() {

    const [stocks, setStocks] = useState<IStockSimple[]>();
    const [segmentSelected, setSegmentSelected] = React.useState<string>();

    const handleChange = (event: SelectChangeEvent) => {
        const code = event.target.value as string;
        setSegmentSelected(code);
        getStockBySector(code).then(response => {
            console.log("new stock selected: " + code);
            if(response.status === 200){
                setStocks(response.data)
            }
        });
    };

    useEffect(() => {
        getStocks().then(response => {
            setStocks(response)
        })
    }, [])

    if (stocks == null) {
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
                                <InputLabel id="demo-simple-select-label">Select the segment</InputLabel>
                                <Select
                                    labelId="demo-simple-select-label"
                                    id="demo-simple-select"
                                    value={segmentSelected}
                                    label="Segment"
                                    onChange={handleChange}
                                >
                                    {names?.map((item) => (
                                        <MenuItem
                                            key={item}
                                            value={item}
                                        >
                                            {item}
                                        </MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </Grid>

                        <Grid container padding={5}>
                            {stocks === null && 
                                <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <h1>No stock found for this sector. Try again using a different</h1>
                            </Grid>
                            }
                            {stocks !== null && stocks?.map((item) => 
                                <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                    <BoxItem item={item} key={item.code}/>
                                </Grid>
                            )}
                        </Grid>
                    </MainCard>
                </Grid>
            </Grid>
        </>
    );
}

export default GridStocks;