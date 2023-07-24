import { useEffect, useState } from "react";
import StockTable from "../../../components/StockTable";
import IStock from "../../../interfaces/IStock";
import { http } from "../../../api/axios/http";
import Loader from "../../../components/Loader";

function StocksBarsi() {

    const [stocks, setStocks] = useState<IStock[]>();

    useEffect(() => {
        http.get('/stocks/barsi/tops')
            .then(response => {
                setStocks(response.data)
            })
            .catch(error => {
                console.log(error)
            })
    }, [])

    if (stocks == null) {
        return (<>
            <Loader />
        </>)
    }

    return (
        <>
            <div className="StockPage">
                <StockTable stocks={stocks} method="Barsi" />
            </div>
        </>
    );
}

export default StocksBarsi;

