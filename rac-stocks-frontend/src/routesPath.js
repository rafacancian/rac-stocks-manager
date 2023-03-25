/*!

=========================================================
* Light Bootstrap Dashboard React - v2.0.1
=========================================================

* Product Page: https://www.creative-tim.com/product/light-bootstrap-dashboard-react
* Copyright 2022 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/light-bootstrap-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/

import Dashboard from "./components/views/Dashboard";

const dashboardRoutes = [
  /*{
    upgrade: true,
    path: "/",
    name: "Upgrade to PRO",
    icon: "nc-icon nc-alien-33",
    component: Dashboard,
    layout: "/admin"
  },*/
  {
    path: "/",
    name: "Cheap Stocks",
    icon: "nc-icon nc-circle-09",
    component: Dashboard,
    layout: ""
  },
  {
    path: "/",
    name: "Cheap FIIs",
    icon: "nc-icon nc-circle-09",
    component: Dashboard,
    layout: "/admin"
  }
];

export default dashboardRoutes;
