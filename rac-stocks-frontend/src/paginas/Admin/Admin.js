import React, { Component } from "react";
import { useLocation, Route, Router } from "react-router-dom";

import Footer from "../../components/Footer/Footer";
import Sidebar from "../../components/Sidebar/Sidebar";

import routesPath from "../../routesPath.js";

import sidebarImage from "../../assets/img/sidebar-stocks.jpeg";
import Header from "../../components/Navbars/AdminNavbar";
import Dashboard from "../../components/views/Dashboard";
import StocksBazin from "../Stocks/Bazin";
import StocksGraham from "../Stocks/Graham";
import StocksWacc from "../Stocks/Wacc";

function Admin() {
  const [image, setImage] = React.useState(sidebarImage);
  const [color, setColor] = React.useState("black");
  const [hasImage, setHasImage] = React.useState(true);
  const location = useLocation();
  const mainPanel = React.useRef(null);
  const getRoutes = (routesPath) => {
    return routesPath.map((prop) => {
      debugger;
      console.log(prop);
      if (prop.layout === "/admin") {
        return (
          <>
            path={prop.layout + prop.path}
            render={(props) => <prop.component {...props} />}
            key={"key"}
          </>
        );
      } else {
        debugger;
        console.log("retorn null");
        return null;
      }
    });
  };
  React.useEffect(() => {
    document.documentElement.scrollTop = 0;
    document.scrollingElement.scrollTop = 0;
    mainPanel.current.scrollTop = 0;
    if (
      window.innerWidth < 993 &&
      document.documentElement.className.indexOf("nav-open") !== -1
    ) {
      document.documentElement.classList.toggle("nav-open");
      var element = document.getElementById("bodyClick");
      element.parentNode.removeChild(element);
    }
  }, [location]);
  return (
    <>
      <div className="wrapper">
        <Sidebar color={color} image={hasImage ? image : ""} routes={routesPath} />
        <div className="main-panel" ref={mainPanel}>
          <Header />
            <div className="content">
              <StocksBazin></StocksBazin>
              <StocksGraham></StocksGraham>
              <StocksWacc></StocksWacc>
            </div>
          <Footer />
        </div>
      </div>
    </>
  );
}

export default Admin;
