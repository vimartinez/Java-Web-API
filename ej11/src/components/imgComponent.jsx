import React from "react";

const ImgComponent = (props) => {

    return(
        <img src={props.url} alt={props.alt} />
    )
}

export default ImgComponent;