
// material-ui
import {
  Box,
  Grid,
  List,
  ListItemButton,
  ListItemText,
  Typography
} from '@mui/material';

import TrendingUpIcon from '@mui/icons-material/TrendingUp';

import TrendingDownIcon from '@mui/icons-material/TrendingDown';
import ArrowDownwardIcon from '@mui/icons-material/ArrowDownward';
import ArrowUpwardIcon from '@mui/icons-material/ArrowUpward';


// project import
import MainCard from '../../components/new/MainCard';
import AnalyticEcommerce from '../../components/new/cards/statistics/AnalyticEcommerce';

function Home() {
  return (
    <>
      {/* row 1 */}
      <Grid container rowSpacing={4.5} columnSpacing={2.75}>
        {/*<Grid item xs={12} sx={{ mb: -2.25 }}>
          <Typography variant="h5">Dashboard</Typography>
        </Grid>*/}
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
        <Grid item xs={12} sm={6} md={4} lg={6}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Grid item xs={12} md={7} lg={12}>
              <Typography variant="h5" align={"center"} padding={"15px"}>
                Stocks
              </Typography>
            </Grid>
            <Grid container rowSpacing={2} columnSpacing={2} >
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                      <ArrowUpwardIcon color="success" />
                      Biggest highs
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="PTBR4 (Petrobras)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="WEGE3 (Weg)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="BBAS3 (Banco do Brasil)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="GMAT3 (Grupo mateus)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="ITSA4 (Itausa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>

              </Grid>
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                      <ArrowDownwardIcon color='error' />
                      Biggest casualies
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="OIBR4 (Oi)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$3,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="AMAR3 (Lojas Marisa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CGNA4 (Cogna Educacional)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="IRBR4 (IRB Seguros)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 21,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CVCB3 (CVC Viagens)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 5,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>
              </Grid>
            </Grid>
          </MainCard>
        </Grid>

        {/* FIIs */}
        <Grid item xs={12} sm={6} md={4} lg={6}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Grid item xs={12} md={7} lg={12}>
              <Typography variant="h5" align={"center"} padding={"15px"}>
                FIIs
              </Typography>
            </Grid>
            <Grid container rowSpacing={2} columnSpacing={2} >
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                    <ArrowUpwardIcon color="success" />
                      Biggest highs
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="PTBR4 (Petrobras)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="WEGE3 (Weg)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="BBAS3 (Banco do Brasil)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="GMAT3 (Grupo mateus)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="ITSA4 (Itausa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>

              </Grid>
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                    <ArrowDownwardIcon color='error' />
                      Biggest casualies
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="OIBR4 (Oi)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$3,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="AMAR3 (Lojas Marisa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CGNA4 (Cogna Educacional)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="IRBR4 (IRB Seguros)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 21,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CVCB3 (CVC Viagens)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 5,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>
              </Grid>
            </Grid>
          </MainCard>
        </Grid>

        {/* BDRs */}
        <Grid item xs={12} sm={6} md={4} lg={6}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Grid item xs={12} md={7} lg={12}>
              <Typography variant="h5" align={"center"} padding={"15px"}>
                BDRs
              </Typography>
            </Grid>
            <Grid container rowSpacing={2} columnSpacing={2} >
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                    <ArrowUpwardIcon color="success" />
                      Biggest highs
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="PTBR4 (Petrobras)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="WEGE3 (Weg)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="BBAS3 (Banco do Brasil)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="GMAT3 (Grupo mateus)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="ITSA4 (Itausa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>

              </Grid>
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                    <ArrowDownwardIcon color='error' />
                      Biggest casualies
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="OIBR4 (Oi)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$3,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="AMAR3 (Lojas Marisa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CGNA4 (Cogna Educacional)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="IRBR4 (IRB Seguros)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 21,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CVCB3 (CVC Viagens)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 5,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>
              </Grid>
            </Grid>
          </MainCard>
        </Grid>

        {/* ETFs */}
        <Grid item xs={12} sm={6} md={4} lg={6}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Grid item xs={12} md={7} lg={12}>
              <Typography variant="h5" align={"center"} padding={"15px"}>
                ETFs
              </Typography>
            </Grid>
            <Grid container rowSpacing={2} columnSpacing={2} >
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                    <ArrowUpwardIcon color="success" />
                      Biggest highs
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="PTBR4 (Petrobras)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="WEGE3 (Weg)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="BBAS3 (Banco do Brasil)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="GMAT3 (Grupo mateus)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="ITSA4 (Itausa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>

              </Grid>
              <Grid item xs={12} md={7} lg={6}>
                <Box sx={{ p: 1, pb: 1 }} >
                  <Typography variant="h5">
                    <Box sx={{ p: 2, pb: 1 }} >
                    <ArrowDownwardIcon color='error' />
                      Biggest casualies
                    </Box>
                  </Typography>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 1 } }}>
                    <ListItemButton divider>
                      <ListItemText primary="OIBR4 (Oi)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$3,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="AMAR3 (Lojas Marisa)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CGNA4 (Cogna Educacional)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="IRBR4 (IRB Seguros)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 21,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <ListItemText primary="CVCB3 (CVC Viagens)" style={{ width: "160px" }} />
                      <Typography variant="h6">R$ 5,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </Box>
              </Grid>
            </Grid>
          </MainCard>
        </Grid>

      </Grid>

    </>
  );
}

export default Home;
