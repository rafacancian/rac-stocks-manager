import './StockTable.css'

const StockTable = (props) => {
    return (
        <div className="stock-table">
        <div className="container-fluid py-4">
          <div className="row">
            <div className="col-12">
              <div className="card mb-4">
                <div className="card-header pb-0">
                  <h6>Projects table</h6>
                </div>
                <div className="card-body px-0 pt-0 pb-2">
                  <div className="table-responsive p-0">
                    <table className="table align-items-center justify-content-center mb-0">
                      <thead>
                        <tr>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7">Rank</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">Ativo</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Atual</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Dividend Yeld</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Valorização 12M</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Teto</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">Upsite</th>
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Status</th>
                          <th></th>
                        </tr>
                      </thead>

                        <tbody>
                       {props.stocks.map(stock =>

                        <tr>
                          <td>
                            <p className="text-ms text-center font-weight-bold mb-0">{stock.rank}</p>
                          </td>
                          <td>
                            <div className="d-flex px-2">
                              <div>
                                <img src={`/images/small-logos/${stock.name}.png`} className="avatar-sm me-2" alt={stock.name}></img>
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
                            <p className="text-sm font-weight-bold mb-0">{stock.dividendYeld}</p>
                          </td>
                          <td>
                            <p className="text-sm font-weight-bold mb-0">{stock.valorization12Month}</p>
                          </td>
                          <td>
                            <p className="text-sm font-weight-bold mb-0">{stock.upsiteValue}</p>
                          </td>
                          <td className="align-middle text-center">
                            <div className="d-flex align-items-center justify-content-center">
                              <span className="me-2 text-xs font-weight-bold">{stock.upsitePercentage}</span>
                              <div>
                                <div className="progress">
                                  <div className="progress-bar bg-gradient-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                                  style={{width: stock.upsitePercentage}}
                                   ></div>
                                </div>
                              </div>
                            </div>
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