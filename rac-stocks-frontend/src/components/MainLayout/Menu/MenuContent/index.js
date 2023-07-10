import SimpleBar from 'simplebar-react';
import Navigation from '../Navigation';

const MenuContent = () => (
  <SimpleBar
    sx={{
      '& .simplebar-content': {
        display: 'flex',
        flexDirection: 'column'
      }
    }}
  >
    <Navigation />
  </SimpleBar>
);

export default MenuContent;
