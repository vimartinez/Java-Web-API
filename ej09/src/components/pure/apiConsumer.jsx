import React, {useEffect, useState} from "react";

const ApiConsumer = () =>{

    const [usuarios, setUsuarios] = useState([]);
    useEffect (() =>{
        fetch('https://jsonplaceholder.typicode.com/users?_limit=20')
        .then((response) => response.json())
        .then((data) => {
            console.log(data);
            setUsuarios(data);
        })
        .catch((err) => {
            console.log(err.message);
        });
    },[]);

    return(
        <div>
            <h5>Listado de usuarios desde una API </h5>
            <table class="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Nombre</th>
                <th scope="col">UserName</th>
                <th scope="col">Mail</th>
                </tr>
            </thead>
                <tbody>
                    {usuarios.map((users) => {
                            return (
                                <tr key={users.id}>
                                    <td>{users.id}</td>
                                    <td>{users.name}</td>
                                    <td>{users.username}</td>
                                    <td>{users.email}</td>
                                </tr>
                            )
                        }) 
                    }
                </tbody>
            </table>
            <br/><br/>
            <h6>Fuente: https://jsonplaceholder.typicode.com/users</h6>
        </div>
    )
}

export default ApiConsumer;