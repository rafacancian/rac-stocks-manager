
import MainLayout from '../components/MainLayout';
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
      path: '/about',
      element: <About />
    }
  ]
};

export default MainRoutes;
