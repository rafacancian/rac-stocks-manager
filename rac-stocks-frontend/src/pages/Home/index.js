import {
  Grid,
} from '@mui/material';

import AnalyticEcommerce from '../../components/new/cards/statistics/AnalyticEcommerce';
import UserForbidden from '../../components/Auth/UserForbidden';
import AnalyticGrid from '../../components/AnalyticGrid';

function Home() {

  const userLogged = sessionStorage.getItem("token")

  const mockDataStocks = [
    {
      items: [
        {
          name: "PETR4 (Petrobras)",
          value: "R$24,30",
          percentage: "2,34%"
        }, {
          name: "WEGE3 (Weg)",
          value: "R$39,10",
          percentage: "1,22%"
        }, {
          name: "BBAS3 (Banco do Brasil)",
          value: "R$48,90",
          percentage: "4,01%"
        }, {
          name: "GMAT3 (Grupo mateus)",
          value: "R$8,52",
          percentage: "1,11%"
        }, {
          name: "ITSA4 (Itausa)",
          value: "R$9,30",
          percentage: "2,04%"
        }
      ]
    },
    {
      items: [
        {
          name: "OIBR4 (Oi)",
          value: "R$4,30",
          percentage: "-1,34%"
        }, {
          name: "AMAR3 (Lojas Marisa)",
          value: "R$0,89",
          percentage: "-2,25%"
        }, {
          name: "CGNA4 (Cogna Educacional)",
          value: "R$4,90",
          percentage: "-4,01%"
        }, {
          name: "IRBR4 (IRB Seguros)",
          value: "R$38,52",
          percentage: "-1,56%"
        }, {
          name: "CVCB3 (CVC Viagens)",
          value: "R$9,30",
          percentage: "-2,04%"
        }
      ]
    }
  ]

  return (

    <>
      {!userLogged && (<>
        <UserForbidden />
      </>)}

      {userLogged && (<>

        {/* Mainly topics 1 */}
        <Grid container rowSpacing={4.5} columnSpacing={2.75}>
          <Grid item xs={12} sm={6} md={4} lg={2}>
            <AnalyticEcommerce title="Ibovespa" count="117.019 pts" percentage={1.5} color="success" extra="119.900 pts, max of 52 weeks" />
          </Grid>
          <Grid item xs={12} sm={6} md={4} lg={2}>
            <AnalyticEcommerce title="IVVB11" count="78,250" percentage={70.5} color="success" extra="8,900" />
          </Grid>
          <Grid item xs={12} sm={6} md={4} lg={2}>
            <AnalyticEcommerce title="Bitcoin" count="18,800" percentage={27.4} isLoss color="error" extra="1,943" />
          </Grid>
          <Grid item xs={12} sm={6} md={4} lg={2}>
            <AnalyticEcommerce title="CDI" count="13,48%" percentage={1.4} extra="referent for the last 12 months" />
          </Grid>
          <Grid item xs={12} sm={6} md={4} lg={2}>
            <AnalyticEcommerce title="IPCA" count="$35,078" percentage={27.4} extra="$20,395" />
          </Grid>
          <Grid item xs={12} sm={6} md={4} lg={2}>
            <AnalyticEcommerce title="IFIX" count="$35,078" percentage={27.4} extra="$20,395" />
          </Grid>
        </Grid>

        <Grid container rowSpacing={1} columnSpacing={2.75}>

          {/* STOCKS */}
          <AnalyticGrid title="Stocks" data={mockDataStocks} />

          {/* FIIs */}
          <AnalyticGrid title="Stocks" data={mockDataStocks} />

          {/* BDRs */}
          <AnalyticGrid title="Stocks" data={mockDataStocks} />

          {/* ETFs */}
          <AnalyticGrid title="Stocks" data={mockDataStocks} />

        </Grid>
      </>)}

    </>
  );
}

export default Home;
