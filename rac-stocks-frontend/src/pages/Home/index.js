
// material-ui
import {
  Box,
  Grid,
  List,
  ListItemButton,
  ListItemText,
  Stack,
  Typography
} from '@mui/material';

// project import
import MainCard from '../../components/new/MainCard';
import AnalyticEcommerce from '../../components/new/cards/statistics/AnalyticEcommerce';
import StocksAll from '../Stocks/All';


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


      <Grid container rowSpacing={0} columnSpacing={2}>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="green">
                  <img src={`/images/stocks/stocks_up.png`} className="avatar-sm me-2" alt="stocks up logo"></img>
                  Top Stocks
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="green">
                  <img src={`/images/stocks/stocks_up.png`} className="avatar-sm me-2" alt="stocks up logo"></img>
                  Top FIIs
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="green">
                  <img src={`/images/stocks/stocks_up.png`} className="avatar-sm me-2" alt="stocks up logo"></img>
                  Top BDRs
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="green">
                  <img src={`/images/stocks/stocks_up.png`} className="avatar-sm me-2" alt="stocks up logo"></img>
                  Top ETFs</Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        {/* ------------ Down ------------*/}
        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="red">
                  <img src={`/images/stocks/stocks_down.png`} className="avatar-sm me-2" alt="stocks down logo"></img>
                  Down Stocks
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/oibr4.png`} className="avatar-sm me-2" alt="Oi telefonia"></img>
                      <ListItemText primary="Oi" style={{ width: "140px" }} />
                      <Typography variant="h6">R$3,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/amar3.png`} className="avatar-sm me-2" alt="Marisa"></img>
                      <ListItemText primary="Marisa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">-3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/cogn3.png`} className="avatar-sm me-2" alt="Cogna"></img>
                      <ListItemText primary="Cogna" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/irbr3.png`} className="avatar-sm me-2" alt="IRB Seguros"></img>
                      <ListItemText primary="IRB Seguros" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 21,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/cvcb3.png`} className="avatar-sm me-2" alt="CVC viagens"></img>
                      <ListItemText primary="CVC" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 5,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">- 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="red">
                  <img src={`/images/stocks/stocks_down.png`} className="avatar-sm me-2" alt="stocks down logo"></img>
                  Down FIIs
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="red">
                  <img src={`/images/stocks/stocks_down.png`} className="avatar-sm me-2" alt="stocks down logo"></img>
                  Down BDRs
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

        <Grid item xs={12} md={7} lg={3}>
          <MainCard sx={{ mt: 2 }} content={false}>
            <Box sx={{ p: 3, pb: 3 }} >
              <Stack spacing={2}>
                <Typography variant="h5" color="red">
                  <img src={`/images/stocks/stocks_down.png`} className="avatar-sm me-" alt="stocks down logo"></img>
                  Down ETFs
                </Typography>
                <MainCard sx={{ mt: 2 }} content={false}>
                  <List sx={{ p: 0, '& .MuiListItemButton-root': { py: 2 } }}>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/petr4.png`} className="avatar-sm me-2" alt="Petrobras"></img>
                      <ListItemText primary="Petrobras" style={{ width: "140px" }} />
                      <Typography variant="h6">R$24,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+2,15%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/wege3.png`} className="avatar-sm me-2" alt="Weg"></img>
                      <ListItemText primary="Weg" style={{ width: "140px" }} />
                      <Typography variant="h6">R$39,50 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+3,23%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/bbsa3.png`} className="avatar-sm me-2" alt="Banco do Brasil"></img>
                      <ListItemText primary="Banco do Brasil" style={{ width: "140px" }} />
                      <Typography variant="h6">R$42,22 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,40%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/gmat3.png`} className="avatar-sm me-2" alt="Grupo Mateus"></img>
                      <ListItemText primary="Grupo mateus" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 7,11 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,43%</Typography>
                    </ListItemButton>
                    <ListItemButton divider>
                      <img src={`/images/small-logos/itsa4.png`} className="avatar-sm me-2" alt="Itausa"></img>
                      <ListItemText primary="Itausa" style={{ width: "140px" }} />
                      <Typography variant="h6">R$ 9,37 </Typography>
                      <ListItemText />
                      <Typography variant="h6">+ 3,64%</Typography>
                    </ListItemButton>
                  </List>
                </MainCard>
              </Stack>
            </Box>
          </MainCard>
        </Grid>

      </Grid>


      {/* row 3 */}
      <Grid container rowSpacing={4.5} columnSpacing={2.75}>
        <Grid item xs={12} md={7} lg={12}>
          <Grid container alignItems="center" justifyContent="space-between">
            <MainCard sx={{ mt: 2 }} content={false}>
              <Box sx={{ p: 3, pb: 0 }}>
                <Stack spacing={2}>
                  <Typography variant="h6" color="textSecondary"> Recomendations</Typography>
                </Stack>
              </Box>
              <StocksAll />
            </MainCard>
          </Grid>
        </Grid>
      </Grid>
    </>
  );
}

export default Home;
