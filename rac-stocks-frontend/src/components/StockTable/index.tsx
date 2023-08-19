import { useState } from 'react';

import './StockTable.css'
import IStock from '../../interfaces/IStock';
import FiberManualRecordIcon from '@mui/icons-material/FiberManualRecord';
import Tooltip from '@mui/material/Tooltip';
import DraggableDialog from '../Dialog';

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

  const [openDialog, setOpenDialog] = useState(false);

  const handleOpenDialog = () => {
    setOpenDialog(true);
    debugger
  };

  const handleCloseDialog = () => {
    setOpenDialog(false);
    debugger
  };


  return (


    <div className="stock-table">

      {openDialog && <DraggableDialog isOpen={openDialog} handleClose={handleCloseDialog} />}


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
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">Code</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">Ativo</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Atual</th>
                        {item != null && item.stocks != null && item.stocks[0].upside != null &&
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">Upsite</th>
                        }
                        {item != null && item.stocks != null && item.stocks[0].maximumPrice != null &&
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Preço Teto</th>
                        }
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Dividend Yield</th>
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Valorização 12M</th>
                        
                        {item != null && item.stocks != null && item.stocks[0].earningYield != null &&
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">Earning Yeild</th>
                        }
                        {item != null && item.stocks != null && item.stocks[0].roe != null &&
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">ROE</th>
                        }

                        {item != null && item.stocks != null && item.stocks[0].score != null &&
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder text-center opacity-7 ps-2">Score</th>
                        }
                        {item != null && item.stocks != null && item.stocks[0].status != null &&
                          <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Status</th>
                        }
                         {item != null && item.stocks != null && item.stocks[0].showErrors != false &&
                        <th className="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">Details</th>
                         }
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
                              <p className="text-sm font-weight-bold mb-0 ms-2">{stock.code}</p>
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

                            {stock.upside != null &&
                              <td className="align-middle">
                                <div className="d-flex align-items-center justify-content-center">
                                  <span className="me-2 text-xs font-weight-bold">{stock.upsideFormatted}</span>
                                  <div>
                                    <div className="progress">
                                      {stock.upside < 0 &&
                                        <div className="progress-bar bg-gradient-warning" role="progressbar" aria-valuemin={-100} aria-valuemax={0}
                                          style={{ width: Math.abs(stock.upside) }}
                                        ></div>
                                      }
                                      {stock.upside >= 0 &&
                                        <div className="progress-bar bg-gradient-success" role="progressbar" aria-valuemin={0} aria-valuemax={100}
                                          style={{ width: stock.upside }}
                                        ></div>
                                      }
                                    </div>
                                  </div>
                                </div>
                              </td>
                            }
                            {stock.maximumPrice != null &&
                              <td>
                                <p className="text-sm font-weight-bold mb-0 ms-2">{stock.maximumPrice}</p>
                              </td>
                            }
                            <td>
                              <p className="text-sm font-weight-bold mb-0 ms-4">{stock.dividendYield}</p>
                            </td>
                            <td>
                              <p className="text-sm font-weight-bold mb-0 ms-4">{stock.valorization12M}</p>
                            </td>
                            {stock.earningYield != null &&
                              <td>
                                <p className="text-sm font-weight-bold mb-0 ms-2">{stock.earningYield}</p>
                              </td>
                            }
                            {stock.roe != null &&
                              <td>
                                <p className="text-sm font-weight-bold mb-0 ms-2">{stock.roe}</p>
                              </td>
                            }


                            {stock.score != null &&
                              <td>
                                <p className="text-sm font-weight-bold mb-0 ms-2">{stock.score}</p>
                              </td>
                            }
                            {stock.status != null &&
                              <td>
                                {stock.status == "Buy" && <div>
                                  <FiberManualRecordIcon color='success' fontSize='small' />
                                  <span className="text-xs font-weight-bold">{stock.status}</span>

                                </div>
                                }
                                {stock.status == "Wait" &&
                                  <div>
                                    <FiberManualRecordIcon color='warning' fontSize='small' />
                                    <span className="text-xs font-weight-bold">{stock.status}</span>

                                  </div>
                                }
                              </td>
                            }
                            <td>
                              {stock.errors != null && stock.errors.length > 0 && stock.showErrors != false &&
                                <div style={{ display: "flex" }} >
                                  <Tooltip title={
                                    <>
                                      {stock.errors.length == 1 &&
                                        <>
                                          <div>{stock.errors[0].title}</div>
                                          <div>{stock.errors[0].description}</div>
                                          {stock.errors[0].more != null && <br />}
                                          <div>{stock.errors[0].more}</div>
                                        </>}
                                      {stock.errors.length > 1 && stock.errors.map((error) =>
                                        <>
                                          <br />
                                          <div>{error.title}</div>
                                          <div>{error.description}</div>
                                          {error.more != null && <br />}
                                          <div>{error.more}</div>
                                          <br />
                                        </>
                                      )}
                                    </>}>
                                    <p className="text-sm font-weight-bold mb-0" >{stock.errors[0].title}</p>
                                  </Tooltip>
                                  {/* <Button onClick={handleOpenDialog} style={{ margin: "0px", padding: "0px" }}>
                                    <SmsSharpIcon color="secondary" fontSize='small' />
                                      </Button> */}
                                </div>
                              }
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