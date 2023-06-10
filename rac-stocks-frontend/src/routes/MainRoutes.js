
import MainLayout from '../layout/MainLayout';
import About from '../paginas/About';
import Home from '../paginas/Home';
import StocksBazin from '../paginas/Stocks/Bazin';
import StocksGraham from '../paginas/Stocks/Graham';
import StocksWacc from '../paginas/Stocks/Wacc';


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
