import React, {useState, useEffect} from "react";

const SaludoLog = () => {

    const [contador1, setContador1] = useState(0);
    const [contador2, setContador2] = useState(5);

    function inc_1 () {
        setContador1(contador1+1)
    }

    function inc_2 () {
        setContador2(contador2+1)
    }

    useEffect(() => {
        console.log('Se modificó el estado del componente')
    },[contador2])

    return (
        <div>
            <h4>Componente Log en consola</h4>
            <h4> Contador 1: {contador1} - Contador 2: {contador2}</h4>
            <div>
                <button onClick={inc_1}>Incrementar Contador 1</button>
                <button onClick={inc_2}>Incrementar Contador 2</button>
            </div>
        </div>
    )
}

export default SaludoLog;