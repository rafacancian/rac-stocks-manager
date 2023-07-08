import { useState } from 'react';

import './StockTable.css'
import IStock from '../../interfaces/IStock';

interface StockProps {
  stocks: IStock[] | undefined,
  method: String
}

const StockTable = (item: StockProps) => {

  const getValidImageUrl = (code: String) => {
    const imageUrl = `/images/small-logos/${code}.png`;
    const img = new Image();
    img.src = imageUrl;

    if (img.complete || img.height > 0) {
      // Imagem válida
      return imageUrl;
    } else {
      // Imagem não encontrada, usar imagem padrão
      return "/images/small-logos/notfound.png";
    }
  };

  return (
    <div className="stock-table">
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
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7">Rank</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">Ativo</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Atual</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Teto</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">Upsite</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Dividend Yield</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Valorização 12M</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Status</th>
                        <th></th>
                      </tr>
                    </thead>
                    <tbody>
                      {item.stocks !== undefined && 
                      
                       item.stocks.map((stock, index) => 
                        <tr key={index + 1}>
                          <td>
                            <p className="text-ms text-center font-weight-bold mb-0">{index + 1}</p>
                          </td>
                          <td>
                            <div className="d-flex px-2">
                              <div>
                                <img src={getValidImageUrl(stock.code)} className="avatar-sm me-2" alt={stock.code}></img>
                              </div>
                              <div className="my-auto">
                                <h6 className="mb-0 text-sm">{stock.name}</h6>
                              </div>
                            </div>
                          </td>
                          <td>
                            <p className="text-sm font-weight-bold mb-0">{stock.currentPrice}</p>
                          </td>
                        
                          <td>
                            <p className="text-sm font-weight-bold mb-0">{stock.maximumPrice}</p>
                          </td>
                          <td className="align-middle text-center">
                            <div className="d-flex align-items-center justify-content-center">
                              <span className="me-2 text-xs font-weight-bold">{stock.upside}</span>
                              <div>
                                <div className="progress">
                                  <div className="progress-bar bg-gradient-success" role="progressbar" aria-valuenow={60} aria-valuemin={0} aria-valuemax={100}
                                    style={{ width: stock.upside }}
                                  ></div>
                                </div>
                              </div>
                            </div>
                          </td>
                          <td>
                            <p className="text-sm font-weight-bold mb-0">{stock.dividendYield}</p>
                          </td>
                          <td>
                            <p className="text-sm font-weight-bold mb-0">{stock.valorization12M}</p>
                          </td>
                          <td>
                            <span className="text-xs font-weight-bold">{stock.status}</span>
                          </td>
                        </tr>
                      )}
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

export default StockTable