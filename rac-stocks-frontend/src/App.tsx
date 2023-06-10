
import Router from './routes';
import ThemeCustomization from './components/new/themes';
import ScrollTop from './components/new/ScrollTop';

function App() {

  return (
    <ThemeCustomization>
    <ScrollTop>
      <Router />
    </ScrollTop>
  </ThemeCustomization>
  );
}

export default App;
