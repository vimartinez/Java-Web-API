import React, {useState} from "react";
import PropTypes from 'prop-types'

const SaludoFunciton = (props) => {
 
    const[age, setAge] = useState(29)
    const incremetAge = () =>{
        setAge(age + 1);
    }

    return (
        <div>
            <h3>Componente Function</h3>
            <h4>Hola: {props.name}</h4>
            <h5>Edad: {age}</h5>
            <div>
                <button onClick={incremetAge}>Cumplir años!</button>
            </div>
        </div>
    )
}

SaludoFunciton.propTypes = {
    name: PropTypes.string,
}

export default SaludoFunciton;