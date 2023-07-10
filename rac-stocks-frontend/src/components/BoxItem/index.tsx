import PropTypes from 'prop-types';

import { Grid, Stack, Typography } from '@mui/material';
import MainCard from '../MainCard';
import IStockSimple from '../../interfaces/IStockSimple';
import { useEffect, useState } from 'react';

interface BoxItemProps {
  item: IStockSimple
}

const BoxItem = ({ item }: BoxItemProps) => {


  const [image, setImage] = useState("/images/small-logos/" + item.code + ".png");

  const handleImageError = () => {
    setImage("/images/small-logos/notfound.png");
  }

  return (
    <MainCard border={false} sx={{ boxShadow: 1 }}>
      <Stack justifyContent="center" alignItems="center">
        <Grid padding={2}>
          <img src={image} onError={handleImageError} alt={item.name + " logo"} height={"120px"} width={"180px"} id={item.code} key={item.code}></img>
        </Grid>
        <Typography variant="h6">{item.name}</Typography>
        <Typography variant="subtitle1">{item.code}</Typography>
      </Stack>
    </MainCard>
  );
}

export default BoxItem;