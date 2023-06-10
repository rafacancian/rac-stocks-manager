// material-ui
import { Box, IconButton, Link, useMediaQuery } from '@mui/material';
import { GithubOutlined } from '@ant-design/icons';

// project import

import Profile from './Profile';

// ==============================|| HEADER - CONTENT ||============================== //

const HeaderContent = () => {
  const matchesXs = useMediaQuery((theme) => theme.breakpoints.down('md'));

  return (
    <>
      {matchesXs && <Box sx={{ width: '100%', ml: 1 }} />}

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
      <Profile />
    </>
  );
};

export default HeaderContent;
