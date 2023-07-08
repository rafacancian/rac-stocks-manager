import { useEffect, useState } from 'react'
import IStockMethods from '../../interfaces/IStockMethods'
import './StockTable.css'
import IMethod from '../../interfaces/IMethod'
import Loader from '../Loader'

interface StockTableProps {
  stock: IStockMethods,
  method: String
}

const StockTableSingle = (item: StockTableProps) => {

  const [stock, setStock] = useState<IStockMethods>();
  const [stockMethod, setStockMethod] = useState<IMethod>();
  
  useEffect(() => {
    debugger
    setStock(item.stock)
    updateStockValues();
  }, [stock])

  if (stock == null || stockMethod == null) {
    return (<>
      <Loader />
    </>)
  }

  function updateStockValues(){
    if (item.method.toLowerCase() === "graham") {
      setStockMethod(item.stock.graham);
    } else if (item.method.toLowerCase() === "bazin") {
      setStockMethod(item.stock.bazin);
    } else if (item.method.toLowerCase() === "wacc") {
      setStockMethod(item.stock.wacc);
    }
  }

  return (
    <div className="stock-table" id={stock.code}>
      <div className="container-fluid py-4">
        <div className="row">
          <div className="col-12">
            <div className="card mb-4">
              <div className="card-header pb-0">
                <h6>{item.method}</h6>
              </div>
              <div className="card-body px-0 pt-0 pb-2">
                <div className="table-responsive p-0">
                  <table className="table align-items-center justify-content-center mb-0">
                    <thead>
                      <tr>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Teto</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">Upsite</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Status</th>
                        <th></th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr key={stock.code}>
                        <td>
                          <p className="text-sm font-weight-bold mb-0">{stockMethod?.maximumPrice}</p>
                        </td>
                        <td className="align-middle text-center">
                          <div className="d-flex align-items-center justify-content-center">
                            <span className="me-2 text-xs font-weight-bold">{stockMethod?.upside}</span>
                            <div>
                              <div className="progress">
                                <div className="progress-bar bg-gradient-success" role="progressbar"
                                  aria-valuenow={60} aria-valuemin={0} aria-valuemax={100}
                                  style={{ width: stockMethod?.upside }}
                                ></div>
                              </div>
                            </div>
                          </div>
                        </td>
                        <td>
                          <span className="text-xs font-weight-bold">{stockMethod?.description}</span>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}

export default StockTableSingle