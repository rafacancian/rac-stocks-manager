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
import IHighlight from '../../interfaces/IHighlight';
import { Padding } from '@mui/icons-material';

interface HighlightsProps {
    type?: string,
    title?: string,
    items?: IHighlight[]
}

const AnalyticTable = ({type, title, items } : HighlightsProps) => {

    debugger

    function getTruncatName(name : string){
        const truncatedStr = name.length > 15 ? name.slice(0, 15) : name;
        return truncatedStr;
    }
   
    return (
        <Grid item xs={12} md={7} lg={6}>
            <Box sx={{ p: 1, pb: 1 }} >
                <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                        {type === "up" && <ArrowUpwardIcon color="success" />}
                        {type === "down" && <ArrowDownwardIcon color="error" />}
                        {title}
                    </Box>
                </Typography>
                <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 0.5 } }}>

                    {type === "up" && items?.slice(items.length-10, items.length).map(item =>
                        
                        <ListItemButton divider>
                            <ListItemText primary={getTruncatName(item.companyName)} style={{ width: "120px" , marginRight: "5px"}} />
                            <Typography variant="h6" margin-right={"25px"} >{item.code}</Typography>
                            <ListItemText />
                            <Typography variant="h6">+{item.resultPercentageValue}%</Typography>
                        </ListItemButton>
                    ).reverse()}

                    {type === "down" && items?.slice(0, 10).map(item =>
                        <ListItemButton divider>
                            <ListItemText primary={getTruncatName(item.companyName)} style={{ width: "120px" , marginRight: "5px" }} />
                            <Typography variant="h6" margin-right={"15px"} >{item.code}</Typography>
                            <ListItemText />
                            <Typography variant="h6" marginLeft={"10px"}>{item.resultPercentageValue}%</Typography>
                        </ListItemButton>
                    )}
                </List>
            </Box>
        </Grid>
    )
}

export default AnalyticTable;