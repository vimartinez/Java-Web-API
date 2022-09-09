import logo from './logo.svg';
import './App.css';

import './components/pure/saludoClass';

import HeaderComponent from './components/pure/headerComponent';
import BadgeComponent from './components/pure/badgeComponent';
import ApiConsumer from './components/pure/apiConsumer';
import SaludoClass from './components/pure/saludoClass';
import SaludoFunciton from './components/pure/saludoFuncion';
import Saludos from './components/containers/saludos';
import SaludoEstilo from './components/pure/saludoEstilo';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header"> */}
        {/* <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a> */}
        {/*<SaludoClass name='Victor'></SaludoClass>
        <SaludoFunciton name='Jose'></SaludoFunciton>
        <SaludoFunciton name={'Mariana'}></SaludoFunciton>
        <SaludoLog></SaludoLog>  */}
        {/* Llamar a un único componente que contiene a los demás */}
        {/* <Saludos></Saludos> */}
        <HeaderComponent title ="Java Web API"></HeaderComponent>
        <BadgeComponent texto="Ej 09 - React"></BadgeComponent> 
        {/* <SaludoEstilo name="Marcelo"></SaludoEstilo> */}
        <ApiConsumer></ApiConsumer>
      {/* </header> */}
    </div>
  );
}

export default App;
