
import MainLayout from '../layout/MainLayout';
import About from '../pages/About';
import Home from '../pages/Home';
import StocksBazin from '../pages/Stocks/Bazin';
import StocksGraham from '../pages/Stocks/Graham';
import StocksWacc from '../pages/Stocks/Wacc';


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
      path: '/stocks/Bazin',
      element: <StocksBazin />
    },
    {
      path: '/stocks/Graham',
      element: <StocksGraham />
    },
    {
      path: '/stocks/Wacc',
      element: <StocksWacc />
    },
    {
      path: '/about',
      element: <About />
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
