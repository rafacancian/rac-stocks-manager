import { Box, Typography } from '@mui/material';

import NavGroup from './NavGroup';
import menuItem from '../../../../menu-items';

const Navigation = () => {
  const navGroups = menuItem.items.map((item) => {
        return <NavGroup key={item.id} item={item} />;
  });

  return <Box sx={{ pt: 2 }}>{navGroups}</Box>;
};

export default Navigation;
