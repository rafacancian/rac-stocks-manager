import { Box, Typography } from "@mui/material";
import MainCard from "../MainCard";
import AreaChart from "../AreaChart";

const MonthlyAreaChart = () => {
    return (
        <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 0 }}>
                <Typography variant="h6" color="textSecondary">
                    Desempenho em comparação com a ibovespa
                </Typography>
               {/*<Typography variant="h3">Total ultimos 12 meses R$1,50 por ação</Typography>*/} 
            </Box>
            <AreaChart /> 
        </MainCard>

    )
}
export default MonthlyAreaChart
