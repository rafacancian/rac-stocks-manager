
import {
  Box,
  Typography,
  Grid
} from '@mui/material';


const AuthLayout = () => {

    return (

        <Grid
        xs={12}
        lg={6}
        sx={{
          alignItems: 'center',
          background: 'radial-gradient(50% 50% at 50% 50%, #122647 0%, #090E23 100%)',
          color: 'white',
          display: 'flex',
          justifyContent: 'center',
          '& img': {
            maxWidth: '100%'
          }
        }}
      >
        <Box sx={{ p: 3 }}>
          <Typography
            align="center"
            color="inherit"
            sx={{
              fontSize: '24px',
              lineHeight: '32px',
              mb: 1
            }}
            variant="h1"
          >
            Welcome to{' '}
            <Box
              component="a"
              sx={{ color: "#8f9cf6" }}
              target="_blank"
            >
              RAC Investments
            </Box>
          </Typography>
          <Typography
            align="center"
            sx={{ mb: 3, color: "#FFF"}}
            variant="subtitle1"
          >
            Upgrade your investment portfolio with the best choices
          </Typography>
          <img
            alt=""
            //src="/images/auth/auth_logo.png"
            src="https://i.makeagif.com/media/8-27-2022/4ofl_j.gif"
          />
        </Box>
      </Grid>

    );

}

export default AuthLayout;