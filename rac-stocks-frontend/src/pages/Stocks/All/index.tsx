import { useEffect, useState } from "react";
import StockTable from "../../../components/StockTable";
import IStock from "../../../interfaces/IStock";
import { http } from "../../../api/axios/http";

function StocksAll() {

    const [stocks, setStocks] = useState<IStock[]>();
    const [stocksBazin, setStocksBazin] = useState<IStock[]>();
    const [stocksGraham, setStocksGraham] = useState<IStock[]>();
    const [stocksWacc, setStocksWacc] = useState<IStock[]>();

    useEffect(() => {
        http.get('/stocks')
            .then(response => {
                setStocks(response.data)
                getBazinStocks();
            })
            .catch(error => {
                console.log(error)
            })
    }, [])

    function getBazinStocks() {
        http.get('/stocks/bazin/tops')
            .then(response => {
                setStocksBazin(response.data)
                getStocksGraham();
            })
            .catch(error => {
                console.log(error)
            })
    }

    function getStocksGraham() {
        http.get('/stocks/graham/tops')
            .then(response => {
                setStocksGraham(response.data)
                getStocksWacc();
            })
            .catch(error => {
                console.log(error)
            })
    }

    function getStocksWacc() {
        http.get('/stocks/wacc/tops')
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

