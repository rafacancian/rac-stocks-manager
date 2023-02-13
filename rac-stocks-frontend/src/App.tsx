import React from 'react';
import { Routes, Route } from 'react-router-dom';
import About from './paginas/About';
import Home from './paginas/Home';
import StocksBazin from './paginas/Stocks/Bazin';
import StocksGraham from './paginas/Stocks/Graham';
import StocksWacc from './paginas/Stocks/Wacc';

function App() {

  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/stocks/bazin" element={<StocksBazin />} />
      <Route path="/stocks/graham" element={<StocksGraham />} />
      <Route path="/stocks/wacc" element={<StocksWacc />} />
      <Route path="/about" element={<About />} />
    </Routes>
  );
}

export default App;
