import { useState } from 'react';
import { useNavigate } from "react-router-dom"
import { useFormik } from 'formik';
import * as Yup from 'yup';
import {
  Alert,
  Box,
  Button,
  Link,
  Stack,
  TextField,
  Typography,
  Grid
} from '@mui/material';

import FirebaseSocial from './FirebaseSocial';
import AuthLayout from './AuthLayout';
import { http } from '../../../api/axios/http';

const AuthLogin = () => {

  const navigate = useNavigate();
  const [token, setToken] = useState(sessionStorage.getItem("token"));
  const [alertMessage, setAlertMessage] = useState("Default access: email: rafael@gmail.com / password: password123");
  const [userLogged, setUserLogged] = useState(token != null && token != undefined)

  const formik = useFormik({
    initialValues: {
      email: 'rafael@gmail.com',
      password: 'Password123!',
      submit: null
    },
    validationSchema: Yup.object({
      email: Yup
        .string()
        .email('Must be a valid email')
        .max(255)
        .required('Email is required'),
      password: Yup
        .string()
        .max(255)
        .required('Password is required')
    }),
    onSubmit: async (values, helpers) => {
      try {

        const user = {
          email: values.email,
          password: values.password
        }
        console.log("[AuthLogin] onSubmit: " + user);
        http.get("/auth/login", user)
          .then(response => {
            if (response.data == null || response.data.token == null) {
              setUserLogged(false)
              setAlertMessage("Login failed, try again")
            } else {
              setToken(response.data.token);
              sessionStorage.setItem("token", token)
              setUserLogged(true)
              navigate("/dashboard")
            }

          })

      } catch (err) {
        helpers.setStatus({ success: false });
        helpers.setErrors({ submit: err.message });
        helpers.setSubmitting(false);
      }
    }
  });

  return (
    <>
      <Box component="main" sx={{ display: 'flex', flex: '1 1 auto' }}>
        <Grid container sx={{ flex: '1 1 auto', position: "absolute", height: "100%" }}>
          <Grid xs={12} lg={6}
            sx={{
              backgroundColor: 'background.paper',
              display: 'flex',
              flexDirection: 'column',
              position: 'relative'
            }}
          >
            <Box
              component="header"
              sx={{
                left: 0,
                p: 3,
                position: 'fixed',
                top: 0,
                width: '100%'
              }}
            >
              <Box
                href="/"
                sx={{
                  display: 'inline-flex',
                  height: 32,
                  width: 32
                }}
              >
              </Box>
            </Box>
            <Box
              sx={{
                backgroundColor: 'background.paper',
                flex: '1 1 auto',
                alignItems: 'center',
                display: 'flex',
                justifyContent: 'center'
              }}
            >
              <Box
                sx={{
                  maxWidth: 550,
                  px: 3,
                  py: '100px',
                  width: '100%'
                }}
              >
                <div>
                  <Stack
                    spacing={1}
                    sx={{ mb: 3 }}
                  >
                    <Typography variant="h4">
                      Login
                    </Typography>

                  </Stack>
                  <form
                    noValidate
                    onSubmit={formik.handleSubmit}
                  >
                    <Stack spacing={3}>
                      <TextField
                        error={!!(formik.touched.email && formik.errors.email)}
                        fullWidth
                        helperText={formik.touched.email && formik.errors.email}
                        label="Email Address"
                        name="email"
                        onBlur={formik.handleBlur}
                        onChange={formik.handleChange}
                        type="email"
                        value={formik.values.email}
                      />
                      <TextField
                        error={!!(formik.touched.password && formik.errors.password)}
                        fullWidth
                        helperText={formik.touched.password && formik.errors.password}
                        label="Password"
                        name="password"
                        onBlur={formik.handleBlur}
                        onChange={formik.handleChange}
                        type="password"
                        value={formik.values.password}
                      />
                    </Stack>
                    <Typography
                      color="text.secondary"
                      variant="body2"
                    >
                      Don&apos;t have an account?
                      &nbsp;
                      <Link
                        href="/auth/register"
                        underline="hover"
                        variant="subtitle2"
                      >
                        Register
                      </Link>
                    </Typography>


                    {formik.errors.submit && (
                      <Typography
                        color="error"
                        sx={{ mt: 3 }}
                        variant="body2"
                      >
                        {formik.errors.submit}
                      </Typography>
                    )}
                    <Button
                      fullWidth
                      size="large"
                      sx={{ mt: 3 }}
                      type="submit"
                      variant="contained"
                    >
                      Continue
                    </Button>
                    <Box sx={{ p: 2, pb: 0 }} >
                      <FirebaseSocial />
                    </Box>

                    <Alert
                      color="primary"
                      severity="info"
                      sx={{ mt: 3 }}
                    >
                      <div>
                        {alertMessage}
                      </div>
                    </Alert>
                  </form>
                </div>
              </Box>
            </Box>
          </Grid>
          <AuthLayout />
        </Grid>
      </Box>
    </>
  );
};

export default AuthLogin;

