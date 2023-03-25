import React, { useEffect, useState } from 'react';
import { Routes, Route } from 'react-router-dom';
import About from './paginas/About';
import Home from './paginas/Home';
import StocksBazin from './paginas/Stocks/Bazin';
import StocksGraham from './paginas/Stocks/Graham';
import StocksWacc from './paginas/Stocks/Wacc';
import StocksAll from './paginas/Stocks/All';

function App() {

  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/about" element={<About />} />
      <Route path="/stocks/all" element={<StocksAll />} />
      <Route path="/stocks/bazin" element={<StocksBazin />} />
      <Route path="/stocks/graham" element={<StocksGraham />} />
      <Route path="/stocks/wacc" element={<StocksWacc />} />

    </Routes>
  );
}

export default App;
