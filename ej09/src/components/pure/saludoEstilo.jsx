import React, {useState} from "react";
import 'bootstrap/dist/css/bootstrap.css'

const estiloLoguedo = {
    color: 'white',
    fortStyle: 'italic'
}

const estiloDeslogueado = {
    color: 'tomato',
    fontWeight: 'bold'
}

const SaludoEstilo = (props) => {

    const [logueado, setLogueado] = useState(false)
    const cambiarEstado = () => {
        console.log('Se cambió el estado de la propiedad logueado');
        setLogueado(!logueado);
    }

    return(
        <div>
            <h4>Texto con estilo condicional</h4>
            <div style={logueado ? estiloLoguedo : estiloDeslogueado}>
                {/* { logueado ? (<p>Hola {props.name} - Saludo con estilo variable</p>)
                :
                (<p>Ingrese al sistema</p>)
                } */}
                <button onClick={cambiarEstado}>{logueado ? 'Salir' : 'Ingrear al sistema'}</button>
                <div className={logueado ? "alert alert-success" : "alert alert-danger"} role="alert">
                { 
                    logueado ? 
                    (<p>Hola {props.name} - Saludo con estilo variable</p>)
                    :
                    (<p>Ingrese al sistema</p>)
                }
                </div>
            </div>
        </div>
    )
}

export default SaludoEstilo;