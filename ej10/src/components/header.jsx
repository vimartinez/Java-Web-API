import React,{useState} from "react";

const Header = (data) => {

    return (
        <div>
            <h3> {data.name}</h3>
            <br/><br/>
        </div>
        
    )
}


export default Header;