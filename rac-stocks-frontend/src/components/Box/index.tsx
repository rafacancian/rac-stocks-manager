import PropTypes from 'prop-types';

import { Grid, Stack, Typography } from '@mui/material';
import MainCard from '../MainCard';

const Box = ({ shadow }: any) => {
  return (
    <MainCard border={false} sx={{ boxShadow: shadow }}>
      <Stack justifyContent="center" alignItems="center">
        <Grid padding={2}>
        <img src={`/images/small-logos/bbas3.png`} alt="image" width={"180px"}></img>
        </Grid>
        <Typography variant="h6">Banco do Brasil</Typography>
        <Typography variant="subtitle1">BBAS3</Typography>
      </Stack>
     
    </MainCard>
  );
}

Box.propTypes = {
  shadow: PropTypes.string.isRequired
};

export default Box;