import PropTypes from 'prop-types';

import { useTheme } from '@mui/material/styles';
import { Card, CardContent, CardHeader, Typography } from '@mui/material';

const headerSX = {
  p: 2.5,
  '& .MuiCardHeader-action': { m: '0px auto', alignSelf: 'center' }
};

const MainCard = (props) => {

  const theme = useTheme();
  const boxShadowResult = theme.palette.mode === 'dark' ? props.boxShadow || true : props.boxShadow;

  return (
    <Card
      elevation={props.elevation || 10}
      ref={props.ref}
      {...props.others}
      sx={{
        border: props.border ? '1px solid' : 'none',
        borderRadius: 2,
        borderColor: theme.palette.mode === 'dark' ? theme.palette.divider : theme.palette.grey.A800,
        boxShadow: boxShadowResult && (!props.border || theme.palette.mode === 'dark') ? props.shadow || theme.customShadows.z1 : 'inherit',
        ':hover': {
          boxShadow: boxShadowResult ? props.shadow || theme.customShadows.z1 : 'inherit'
        },
        '& pre': {
          m: 0,
          p: '16px !important',
          fontFamily: theme.typography.fontFamily,
          fontSize: '0.75rem'
        },
        ...props.sx
      }}
    >
      {/* card header and action */}
      {!props.darkTitle && props.title && (
        <CardHeader sx={headerSX} titleTypographyProps={{ variant: 'subtitle1' }} title={props.title} action={props.secondary} />
      )}
      {props.darkTitle && props.title && <CardHeader sx={headerSX} title={<Typography variant="h3">{props.title}</Typography>} action={props.secondary} />}

      {/* card content */}
      {props.content && <CardContent sx={headerSX}>{props.children}</CardContent>}
      {!props.content && props.children}

    </Card>
  )
}

MainCard.propTypes = {
  border: PropTypes.bool,
  boxShadow: PropTypes.bool,
  contentSX: PropTypes.object,
  darkTitle: PropTypes.bool,
  divider: PropTypes.bool,
  elevation: PropTypes.number,
  secondary: PropTypes.node,
  shadow: PropTypes.string,
  sx: PropTypes.object,
  title: PropTypes.oneOfType([PropTypes.string, PropTypes.node]),
  content: PropTypes.bool,
  children: PropTypes.node
};

export default MainCard;