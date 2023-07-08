import PropTypes from 'prop-types';

import { Grid, Stack, Typography } from '@mui/material';
import MainCard from '../MainCard';
import IStockSimple from '../../interfaces/IStockSimple';

interface BoxItemProps {
  item : IStockSimple
}

const BoxItem = ( {item} : BoxItemProps) => {
  return (
    <MainCard border={false} sx={{ boxShadow: 1 }}>
      <Stack justifyContent="center" alignItems="center">
        <Grid padding={2}>
        <img src={`/images/small-logos/`+item.code+".png"} alt={item.name + " logo"} height={"120px"} width={"180px"}></img>
        </Grid>
        <Typography variant="h6">B{item.name}</Typography>
        <Typography variant="subtitle1">{item.code}</Typography>
      </Stack>
     
    </MainCard>
  );
}

export default BoxItem;