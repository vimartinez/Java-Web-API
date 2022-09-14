import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css'
import Header from './components/header';
import ApiPeliculasConsumer from './components/apiPeliculasConsumer';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header"> */}
       <Header name="Ej10 - Consumir API desde React desarrollada por nosotros (listado de películas)"></Header>
       <ApiPeliculasConsumer></ApiPeliculasConsumer>
      {/* </header> */}
    </div>
  );
}

export default App;
