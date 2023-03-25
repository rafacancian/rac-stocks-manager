import  {BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Admin from './paginas/Admin/Admin';
import routersPath from './routesPath';

import "bootstrap/dist/css/bootstrap.min.css";
import "./assets/scss/light-bootstrap-dashboard-react.scss?v=2.0.0";

export default function AppRouter() {
    return (
       <Router>
         <Routes>
           <Route path="/" element={<Admin {...routersPath} />} />
         </Routes>
       </Router>
    );
}
