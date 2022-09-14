import React,{useState, useEffect} from "react";

const ApiPeliculasConsumer = () => {
    const [peliculas, setPeliculas] = useState([]);
    useEffect(() => {
        fetch('http://localhost:8126/movies/')
        .then((response) => response.json())
        .then((data) => {
            console.log(data);
            setPeliculas(data);
        })
        .catch((err) => {
            console.log(err.message)
        });
    },[]);


    return(
        <div>
            <h5>Listado de películas desde la api del ejercicio 07</h5>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <th >id</th>
                        <th>Nombre</th>
                        <th>Año</th>
                        <th>Duración</th>
                        <th>Resumen</th>
                    </tr>
                </thead>
                <tbody>
                    {peliculas.map((peli) =>{
                        return(
                            <tr key={peli.id}>
                                <td>{peli.id}</td>
                                <td>{peli.name}</td>
                                <td>{peli.yearOfRelease}</td>
                                <td>{peli.duration}</td>
                                <td>{peli.summary}</td>
                            </tr>
                        )
                    })}
                </tbody>
            </table>
        </div>
    )

}

export default ApiPeliculasConsumer;