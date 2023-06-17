import axios from "axios";
import { useEffect, useState } from "react";
import StockTable from "../../../components/StockTable";
import IStock from "../../../interfaces/IStock";

function StocksBazin() {

    const [stocks, setStocks] = useState<IStock[]>();

    useEffect(() => {
        axios.get('http://localhost:8002/stocks/bazin/tops')
            .then(response => {
                setStocks(response.data)
            })
            .catch(error => {
                console.log(error)
            })
    }, [])

    return (
        <>
            <div className="StockPage">
                <StockTable stocks={stocks} method="Bazin" />
            </div>
        </>
    );
}

export default StocksBazin;

