import axios from "axios";
import { useEffect, useState } from "react";
import StockTable from "../../../components/StockTable";
import IStock from "../../../interfaces/IStock";

function StocksAll() {

    const [stocks, setStocks] = useState<IStock[]>();
    const [stocksBazin, setStocksBazin] = useState<IStock[]>();
    const [stocksGraham, setStocksGraham] = useState<IStock[]>();
    const [stocksWacc, setStocksWacc] = useState<IStock[]>();

    useEffect(() => {
        axios.get('http://localhost:8002/stocks')
            .then(response => {
                setStocks(response.data)
                getBazinStocks();
            })
            .catch(error => {
                console.log(error)
            })
    }, [])

    function getBazinStocks() {
        axios.get('http://localhost:8002/stocks/bazin/tops')
            .then(response => {
                setStocksBazin(response.data)
                getStocksGraham();
            })
            .catch(error => {
                console.log(error)
            })
    }

    function getStocksGraham() {
        axios.get('http://localhost:8002/stocks/graham/tops')
            .then(response => {
                setStocksGraham(response.data)
                getStocksWacc();
            })
            .catch(error => {
                console.log(error)
            })
    }

    function getStocksWacc() {
        axios.get('http://localhost:8002/stocks/wacc/tops')
            .then(response => {
                setStocksWacc(response.data)
            })
            .catch(error => {
                console.log(error)
            })
    }

    return (
        <>
            <div className="StockPage">
                <StockTable stocks={stocksBazin} method="Bazin" />
                <StockTable stocks={stocksGraham} method="Graham" />
                <StockTable stocks={stocksWacc} method="Wacc" />
            </div>
        </>
    );
}

export default StocksAll;

