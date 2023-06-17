import React from "react";

import Footer from "../../components/Footer/Footer";
import Sidebar from "../../components/Sidebar/Sidebar";

import routesPath from "../../routesPath.js";

import sidebarImage from "../../assets/img/sidebar-stocks.jpeg";
import Header from "../../components/Navbars/AdminNavbar";
import StocksAll from "../Stocks/All";

function Admin() {
  const [image, setImage] = React.useState(sidebarImage);
  const [color, setColor] = React.useState("black");
  const [hasImage, setHasImage] = React.useState(true);

  const mainPanel = React.useRef(null);
  return (
    <>
      <div className="wrapper">
        <Sidebar color={color} image={hasImage ? image : ""} routes={routesPath} />
        <div className="main-panel" ref={mainPanel}>
          <Header />
          <div className="content">
            <StocksAll></StocksAll>
          </div>
          <Footer />
        </div>
      </div>
    </>
  );
}

export default Admin;
