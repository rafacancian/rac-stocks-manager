import {
    Button,
    Grid,
    Typography
} from '@mui/material';

import { useNavigate } from "react-router-dom"

const UserForbidden = () => {

    const navigate = useNavigate();

    const redirectToLogin = () => {
        navigate("/auth/login")
    }

    return (
        <form>
            <Grid item xs={12} sm={6} md={4} lg={12}>
                <Grid item xs={12} md={7} lg={12} textAlign={'center'}>
                    <img alt="user not logged image" width={"20%"}
                        src="/images/auth/forbidden_user.png" />
                    <Typography variant="h2" align={"center"} padding={"15px"}>
                        User not logged
                    </Typography>
                    <Button variant="contained" onClick={redirectToLogin}>
                        Go to login page
                    </Button>
                </Grid>
            </Grid>
        </form>
    )
}

export default UserForbidden;