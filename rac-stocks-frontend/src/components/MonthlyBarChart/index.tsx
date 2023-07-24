import { Box, Typography } from "@mui/material";
import { Stack } from "react-bootstrap";
import MainCard from "../MainCard";
import BarChart from "../BarChart";

const MonthlyBarChart = () => {
    return (
        <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 0 }}>
                <Typography variant="h6" color="textSecondary">
                    Ultimos Dividendos
                </Typography>
               {/*<Typography variant="h3">Total ultimos 12 meses R$1,50 por ação</Typography>*/} 
            </Box>
            <BarChart />
        </MainCard>

    )
}
export default MonthlyBarChart
