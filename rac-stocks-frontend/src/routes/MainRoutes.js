
import MainLayout from '../layout/MainLayout';
import Home from '../paginas/Home';


// ==============================|| MAIN ROUTING ||============================== //

const MainRoutes = {
  path: '/',
  element: <MainLayout />,
  children: [
    {
      path: '/',
      element: <Home />
    },
    {
      path: 'dashboard',
      children: [
        {
          path: 'default',
          element: <Home />
        }
      ]
    }
  ]
};

export default MainRoutes;
