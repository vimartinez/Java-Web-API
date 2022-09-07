import React from "react";
import SaludoClass from "../saludoClass";
import SaludoFunciton from "../saludoFuncion";
import SaludoLog from "../saludoLog";
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