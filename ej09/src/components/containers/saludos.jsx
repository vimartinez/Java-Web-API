import React from "react";
import SaludoClass from "../pure/saludoClass";
import SaludoFunciton from "../pure/saludoFuncion";
import SaludoLog from "../pure/saludoLog";
import './saludos.css'

const Saludos = () =>  {

    return (
        <div id="saludosDiv">
            <h3 id="saludosTitulo">Componente contenedor de saludos</h3>
            <SaludoClass name="Pepe"></SaludoClass>
            <SaludoFunciton name="Jose Luis"></SaludoFunciton>
            <SaludoLog></SaludoLog>
            <SaludoFunciton name="Cecilia"></SaludoFunciton>
        </div>
    )
}



export default Saludos;