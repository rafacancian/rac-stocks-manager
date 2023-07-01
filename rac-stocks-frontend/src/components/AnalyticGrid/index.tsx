import {
    Grid,
    Typography
} from '@mui/material';

import MainCard from '../MainCard';
import AnalyticTable from '../AnalyticTable';
import IHighlight from '../../interfaces/IHighlight';
import React from 'react';

interface HighlightsProps {
    type?: string,
    title?: string,
    items?: IHighlight[]
}

const AnalyticGrid = ({title, items} : HighlightsProps) => {

    return (
        <Grid item xs={12} sm={6} md={4} lg={6}>
            <MainCard sx={{ mt: 2 }} content={true} border={true} boxShadow={true}>
                <Grid item xs={12} md={7} lg={12}>
                    <Typography variant="h5" align={"center"} padding={"2px"}>
                        {title}
                    </Typography>
                </Grid>
                <Grid container rowSpacing={0} columnSpacing={0} >
                    <AnalyticTable title="Biggest highs" type="up" items={items} />
                    <AnalyticTable title="Biggest casualies" type="down" items={items} />
                </Grid>
            </MainCard>
        </Grid>
    )
}

export default AnalyticGrid