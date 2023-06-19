import {
    Grid,
    Typography
} from '@mui/material';

import MainCard from '../new/MainCard';
import AnalyticTable from '../AnalyticTable';

const AnalyticGrid = (props) => {
    return (
        <Grid item xs={12} sm={6} md={4} lg={6}>
            <MainCard sx={{ mt: 2 }} content={false}>
                <Grid item xs={12} md={7} lg={12}>
                    <Typography variant="h5" align={"center"} padding={"15px"}>
                        {props.title}
                    </Typography>
                </Grid>
                <Grid container rowSpacing={2} columnSpacing={2} >
                    <AnalyticTable title="Biggest highs" type="up" data={props.data[0]} />
                    <AnalyticTable title="Biggest casualies" type="down" data={props.data[1]} />
                </Grid>
            </MainCard>
        </Grid>
    )
}

export default AnalyticGrid