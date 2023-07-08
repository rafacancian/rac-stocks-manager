import PropTypes from 'prop-types';

import { Grid, Stack, Typography } from '@mui/material';
import MainCard from '../MainCard';
import { useEffect, useState } from 'react';


const Box = ({ shadow, name, code }: any) => {

  const [image, setImage] = useState("/images/small-logos/" + code + ".png");

  const handleImageError = () => {
    setImage("/images/small-logos/notfound.png");
  }

  return (
    <MainCard border={false} sx={{ boxShadow: shadow }}>
      <Stack justifyContent="center" alignItems="center">
        <Grid padding={2}>
          <img src={image} alt="image" width={"180px"} onError={handleImageError}></img>
        </Grid>
        <Typography variant="h6">{name}</Typography>
        <Typography variant="subtitle1">{code}</Typography>
      </Stack>

    </MainCard>
  );
}

Box.propTypes = {
  shadow: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  code: PropTypes.string.isRequired
};

export default Box;