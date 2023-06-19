// material-ui
import { Box, IconButton, Link, useMediaQuery } from '@mui/material';
import { GithubOutlined } from '@ant-design/icons';

// project import
import Profile from './Profile';
import Notification from './Notification';

// ==============================|| HEADER - CONTENT ||============================== //

const HeaderContent = () => {
  const matchesXs = useMediaQuery((theme) => theme.breakpoints.down('md'));

  return (
    <>
      {matchesXs && <Box sx={{ width: '100%', ml: 1 }} />}

      <Box sx={{ width: '100%', ml: { xs: 0, md: 1 } }}>
      Menu
      </Box>

      <IconButton
        component={Link}
        href="https://github.com/rafacancian"
        target="_blank"
        disableRipple
        color="secondary"
        title="Github"
        sx={{ color: 'text.primary', bgcolor: 'grey.100' }}
      >
        <GithubOutlined />
      </IconButton>
      <Notification/>
      <Profile />
    </>
  );
};

export default HeaderContent;
