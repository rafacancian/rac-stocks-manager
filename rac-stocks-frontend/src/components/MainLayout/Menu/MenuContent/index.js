import Navigation from '../Navigation';
import SimpleBar from '../../../new/third-party/SimpleBar';

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
