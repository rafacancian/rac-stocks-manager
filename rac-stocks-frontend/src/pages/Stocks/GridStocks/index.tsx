import { FormControl, Grid, InputLabel, MenuItem, OutlinedInput, Select, useTheme } from "@mui/material";
import MainCard from "../../../components/MainCard";
import Box from "../../../components/Box";
import * as React from 'react';
import { Theme } from '@mui/material/styles';
import { SelectChangeEvent } from '@mui/material/Select';

const ITEM_HEIGHT = 48;
const ITEM_PADDING_TOP = 8;
const MenuProps = {
    PaperProps: {
        style: {
            maxHeight: ITEM_HEIGHT * 4.5 + ITEM_PADDING_TOP,
            width: 250,
        },
    },
};

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

function getStyles(name: string, personName: string[], theme: Theme) {
    return {
        fontWeight:
            personName.indexOf(name) === -1
                ? theme.typography.fontWeightRegular
                : theme.typography.fontWeightMedium,
    };
}

function GridStocks() {

    const theme = useTheme();
    const [personName, setPersonName] = React.useState<string[]>([]);

    const handleChange = (event: SelectChangeEvent<typeof personName>) => {
        const {
            target: { value },
        } = event;
        setPersonName(
            typeof value === 'string' ? value.split(',') : value,
        );
    };


    return (
        <>
            <Grid container spacing={1}>
                <Grid item xs={12}>
                    <MainCard>
                        <Grid textAlign={"center"} marginTop={5}>
                            <FormControl sx={{ m: 1, width: 300 }}>
                                <InputLabel id="demo-multiple-name-label">Sectors</InputLabel>
                                <Select
                                    labelId="demo-multiple-name-label"
                                    id="demo-multiple-name"
                                    multiple
                                    value={personName}
                                    onChange={handleChange}
                                    input={<OutlinedInput label="Name" />}
                                    MenuProps={MenuProps}
                                >
                                    {names.map((name) => (
                                        <MenuItem
                                            key={name}
                                            value={name}
                                            style={getStyles(name, personName, theme)}
                                        >
                                            {name}
                                        </MenuItem>
                                    ))}
                                </Select>
                            </FormControl>
                        </Grid>

                        <Grid container padding={5}>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                            <Grid item xs={6} sm={4} md={3} lg={1.7} margin={2}>
                                <Box shadow="1" />
                            </Grid>
                        </Grid>
                    </MainCard>
                </Grid>
            </Grid>
        </>
    );
}

export default GridStocks;