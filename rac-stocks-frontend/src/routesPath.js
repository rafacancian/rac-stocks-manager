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
