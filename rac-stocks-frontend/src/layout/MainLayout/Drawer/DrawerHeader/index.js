import PropTypes from 'prop-types';
import { useTheme } from '@mui/material/styles';
import { Stack } from '@mui/material';

import DrawerHeaderStyled from './DrawerHeaderStyled';

import logo from "../../../../assets/logo/logo_test.png"

const DrawerHeader = ({ open }) => {
  const theme = useTheme();

  return (
    <DrawerHeaderStyled theme={theme} open={open}>
      <Stack direction="row" spacing={5} alignItems="center">
       <img src={logo} style={{height: "100%", width: "100%", alignContent: "center"}}></img>
      </Stack>
    </DrawerHeaderStyled>
  );
};

DrawerHeader.propTypes = {
  open: PropTypes.bool
};

export default DrawerHeader;
