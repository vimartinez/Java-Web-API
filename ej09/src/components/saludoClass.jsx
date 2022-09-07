import React, {Component} from "react";
import PropTypes from 'prop-types'
import './saludo.css'

class SaludoClass extends Component{

    constructor(props){
        super(props);
        this.state = {
            age: 35
        }
    }

    render(){
        return (
            <div id="divComponente">
                <h3>Componente tipo Clase</h3>
                <h4>Hola: {this.props.name}</h4>
                <h5>Edad: {this.state.age}</h5>
                <div>
                    <button onClick={this.incremetAge}>Sumar edad</button>
                </div>
            </div>
        )
    }

    incremetAge = () =>{
        this.setState((prevState) => (
            {
                age: prevState.age + 1
            }
        ))
    }


}


SaludoClass.propTypes = {
    name: PropTypes.string,
}

export default SaludoClass;