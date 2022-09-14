import React,{useState, useEffect} from "react";
import ImgComponent from "./imgComponent";

// https://dashboard.api-football.com/formula/requests
const ApiConsumerComponent = () => {
    const [circutos, setCircuitos] = useState([]);
    useEffect(() => {
        fetch('https://v1.formula-1.api-sports.io/circuits', {
            "method": "GET",
            "headers": {
                "x-rapidapi-host":"api-formula-1.p.rapidapi.com",
                "x-rapidapi-key":"Api Key"
            }
        })
        .then((response) => response.json())
        .then((data) => {
            console.log(data);
            setCircuitos(data.response)
        })
        .catch((err) => {
            console.log(err.message);
        })
    }, [])


return (
    <div>
        <h2>Listado de circuitos F1</h2>
        {circutos.map((circ) => {
                return (
                    <div className="card" style={{width:'18rem'}} key={circ.id}>
                    <ImgComponent url={circ.image} alt={circ.name}></ImgComponent>
                        <div className="card-body">
                            <p className="card-text">{circ.name} ({circ.first_grand_prix}) </p>
                        </div>
                    </div>
                    );
                })}
    </div>
)

}

export default ApiConsumerComponent;