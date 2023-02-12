import React from 'react';
import { Routes, Route } from 'react-router-dom';
import About from './paginas/About';
import Home from './paginas/Home';
import Stocks from './paginas/Stocks';

function App() {

  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/stocks" element={<Stocks />} />
      <Route path="/about" element={<About />} />
    </Routes>
  );
}

export default App;
