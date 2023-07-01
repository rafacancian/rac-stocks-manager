
import MainLayout from '../components/MainLayout';
import About from '../pages/About';
import Home from '../pages/Home';
import Stock from '../pages/Stock';
import StocksBazin from '../pages/Stocks/Bazin';
import StocksGraham from '../pages/Stocks/Graham';
import GridStocks from '../pages/Stocks/GridStocks';
import StocksWacc from '../pages/Stocks/Wacc';


// ==============================|| MAIN ROUTING ||============================== //

const MainRoutes = {
  path: '/',
  element: <MainLayout />,
  children: [
    {
      path: '/dashboard',
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
      path: '/stock/select',
      element: <Stock />
    },
    {
      path: '/stocks/grid',
      element: <GridStocks />
    }
  ]
};

export default MainRoutes;
