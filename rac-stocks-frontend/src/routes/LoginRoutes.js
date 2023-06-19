
import AuthLogin from '../pages/Authentication/auth-forms/AuthLogin';
import AuthRegister from '../pages/Authentication/auth-forms/AuthRegister';
import MainLayout from '../components/MainLayout';
import { Outlet } from 'react-router-dom';

const LoginRoutes = {
  path: '/auth',
  element: <Outlet />,
  children: [
    {
      path: 'login',
      element: <AuthLogin />
    },
    {
      path: 'register',
      element: <AuthRegister />
    }
  ]
};

export default LoginRoutes;
