import {
    Box,
    Grid,
    List,
    ListItemButton,
    ListItemText,
    Typography
} from '@mui/material';

import ArrowDownwardIcon from '@mui/icons-material/ArrowDownward';
import ArrowUpwardIcon from '@mui/icons-material/ArrowUpward';

const AnalyticTable = (props) => {
    const items = props.data.items;
    return (
        <Grid item xs={12} md={7} lg={6}>
            <Box sx={{ p: 1, pb: 1 }} >
                <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                        {props.type === "up" && <ArrowUpwardIcon color="success" />}
                        {props.type === "down" && <ArrowDownwardIcon color="error" />}
                        {props.title}
                    </Box>
                </Typography>
                <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    {items.map(item =>
                        <ListItemButton divider>
                            <ListItemText primary={item.name} style={{ width: "160px" }} />
                            <Typography variant="h6">{item.value}</Typography>
                            <ListItemText />
                            <Typography variant="h6">{item.percentage}</Typography>
                        </ListItemButton>
                    )}
                </List>
            </Box>
        </Grid>
    )
}

export default AnalyticTable;