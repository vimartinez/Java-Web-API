import React from "react";

const BadgeComponent = (props) => {

    return (
        <h5>{props.texto} <span className="badge bg-secondary">JWA</span></h5>
    )
}

export default BadgeComponent;