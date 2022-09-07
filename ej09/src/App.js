import logo from './logo.svg';
import './App.css';
import SaludoClass from './components/saludoClass';
import SaludoFunciton from './components/saludoFuncion';
import SaludoLog from './components/saludoLog';
import Saludos from './components/containers/saludos';

function App() {
  return (
    <div className="App">
      <header className="App-header">
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
        {/* <SaludoClass name='Victor'></SaludoClass>
        <SaludoFunciton name={'Sergio'}></SaludoFunciton>
        <SaludoFunciton name={'Mariana'}></SaludoFunciton>
        <SaludoLog></SaludoLog> */}
        {/* Llamar a un único componente que contiene a los demás */}
        <Saludos></Saludos>
      </header>
    </div>
  );
}

export default App;
