import { Grid, Typography } from "@mui/material";
import MainCard from "../../components/MainCard";

function About() {
    return (
        <>
            <Grid container rowSpacing={2} columnSpacing={2}>
                <Grid item xs={12} sm={6} md={4} lg={12}>
                    <MainCard sx={{ mt: 2 }} content={false}>
                        <Grid item xs={12} md={7} lg={12} height={"500px"}>
                            <Typography variant="h5" align={"center"} padding={"15px"}>
                                Single page
                            </Typography>
                        </Grid>
                    </MainCard>
                </Grid>
            </Grid>
        </>
    );
}

export default About;