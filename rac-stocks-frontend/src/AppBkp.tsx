import StockTable from './components/StockTable';
import axios from 'axios';
import {useEffect} from 'react';
import { useState } from "react";
import IStock from './interfaces/IStock';
import React from 'react';

function AppBkp() {

const [stocks, setStocks] = useState<IStock>();

const stocksMock = [
    {
      rank: '1',
      name: 'ITSA4',
      currentPrice: 'R$ 9,00',
      dividendYield: '8%',
      valorization12Month: '20%',
      upsideValue: 'R$ 11,20',
      upsidePercentage: '60%' ,
      status: 'Buy'
    }, {
      rank: '2',
      name: 'WEGE3',
      currentPrice: 'R$ 26,00',
      dividendYield: '2%',
      valorization12Month: '15%',
      upsideValue: 'R$ 28,70',
      upsidePercentage: '33%' ,
      status: 'Buy'
    }, {
      rank: '3',
      name: 'BBSA3',
      currentPrice: 'R$ 26,00',
      dividendYield: '2%',
      valorization12Month: '15%',
      upsideValue: 'R$ 28,70',
      upsidePercentage: '10%' ,
      status: 'Buy'
   }, {
      rank: '4',
      name: 'BBSE3',
      currentPrice: 'R$ 26,00',
      dividendYield: '2%',
      valorization12Month: '15%',
      upsideValue: 'R$ 28,70',
      upsidePercentage: '56%' ,
      status: 'Buy'
   }, {
      rank: '5',
      name: 'EZTC3',
      currentPrice: 'R$ 26,00',
      dividendYield: '2%',
      valorization12Month: '15%',
      upsideValue: 'R$ 28,70',
      upsidePercentage: '40%' ,
      status: 'Buy'
    }
]

useEffect(() => {
    axios.get('http://localhost:8002/stocks/suno/dividends')
    //.headers: {"Access-Control-Allow-Origin": "*"}
    .then(response => {
        console.log(response)
        setStocks(response.data.results)
    })
    .catch(error => {
        console.log(error)
    })
 }, [])

  return (
    <div className="AppBkp">
         <StockTable stocks={stocks}/>
    </div>
  );
}

export default AppBkp;
