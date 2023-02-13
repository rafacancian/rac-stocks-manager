import axios from "axios";
import { useEffect, useState } from "react";
import StockTable from "../../../components/StockTable";
import IStock from "../../../interfaces/IStock";

function StocksGraham() {

    const [stocks, setStocks] = useState<IStock[]>();

    useEffect(() => {
        axios.get('http://localhost:8002/stocks/graham/tops')
            //.headers: {"Access-Control-Allow-Origin": "*"}
            .then(response => {
                console.log(response)
                setStocks(response.data)
            })
            .catch(error => {
                console.log(error)
            })
    }, [])

    return (
        <>
            <div className="StockPage">
                <h1>Stocks - Graham Paga</h1>
                <StockTable stocks={stocks} />
            </div>
        </>
    );
}

export default StocksGraham;

