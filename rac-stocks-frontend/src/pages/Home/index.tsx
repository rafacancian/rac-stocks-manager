import {
  Grid,
} from '@mui/material';

import AnalyticCard from '../../components/AnalyticCard';
import UserForbidden from '../../components/Auth/UserForbidden';
import AnalyticGrid from '../../components/AnalyticGrid';
import { http } from '../../api/axios/http';
import { useState, useEffect } from 'react';
import IHighlight from '../../interfaces/IHighlight';
import { getBDRsHighlights, getCriptosHighlights, getFIIsHighlights, getStocksHighlights, getTopicsHighlights } from '../../api/axios/hooks';
import Loader from '../../components/Loader';
import ITopicHighlight from '../../interfaces/ITopicHighlight';

const Home = () => {

  const [userLogged, setUserLogged] = useState("FGGBBFGDFDFSDFSDF"); //sessionStorage?.getItem("token")
  const [topics, setTopics] = useState<ITopicHighlight[]>();
  const [stocks, setStocks] = useState<IHighlight[]>();
  const [fiis, setFIIs] = useState<IHighlight[]>();
  const [bdrs, setBDRs] = useState<IHighlight[]>();
  const [criptos, setCriptos] = useState<IHighlight[]>();

  useEffect(() => {

    getTopicsHighlights().then(response => {
      console.log(response);
      setTopics(response)
    });

    getStocksHighlights().then(response => {
      setStocks(response)
    });

    getFIIsHighlights().then(response => {
      setFIIs(response)
    });

    getBDRsHighlights().then(response => {
      setBDRs(response)
    });

    getCriptosHighlights().then(response => {
      setCriptos(response)
    });
  }, [])

  /*function getstocks () {
      http.get<IHighlight[]>("/stocks/highlights")
        .then(response => {
          setStocks(response.data)
          console.log(stocks);
        })
        .catch(error => {
          console.log(error)
        })
  }*/



  if (stocks == null || topics == null) {
    return (<>
      <Loader />
    </>)
  }

  return (

    <>
      {!userLogged && (<>
        <UserForbidden />
      </>)}

      {userLogged && (<>

        {/* Mainly topics 1 */}
        <Grid container rowSpacing={4.5} columnSpacing={2.75}>
          {topics?.map(item =>
            <Grid item xs={12} sm={6} md={4} lg={2}>
              <AnalyticCard title={item.name} count={item.value} percentage={item.upside} color="success" extra={item.description} />
            </Grid>
          )}
        </Grid>

        <Grid container rowSpacing={1} columnSpacing={2.75}>

          {/* STOCKS  */}
          <AnalyticGrid title="Stocks" items={stocks} />

          {/* FIIs */}
          <AnalyticGrid title="FIIs" items={fiis} />

          {/*   BDRs */}
          <AnalyticGrid title="BDRs" items={bdrs} />

          {/*  ETFs */}
          <AnalyticGrid title="Criptomoedas" items={criptos} />
         

        </Grid>
      </>)}

    </>
  );
}

export default Home;
function useQuery(arg0: any[], arg1: () => any): { data: any; isLoading: any; error: any; } {
  throw new Error('Function not implemented.');
}

function getCategoryBySlud(arg0: any) {
  throw new Error('Function not implemented.');
}

