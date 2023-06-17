import Navigation from './Navigation';
import SimpleBar from '../../../../components/new/third-party/SimpleBar';

const DrawerContent = () => (
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

export default DrawerContent;
