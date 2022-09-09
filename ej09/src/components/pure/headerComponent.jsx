import React from "react";

const HeaderComponent = (props) => {

    return(
        <nav className="navbar bg-light">
            <div className="container-fluid">
                <span className="navbar-brand mb-0 h1">{props.title}</span>
            </div>
        </nav>
    )   
}

export default HeaderComponent;