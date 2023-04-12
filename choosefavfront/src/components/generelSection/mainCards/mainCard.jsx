import React from "react";
import "../general.css";
import { Link } from "react-router-dom";

const MainCard = (props) => {
  const { id, title, img } = props.detail;
  console.log(id);

  return (
    <div className="main-card">
      <div className="main-card-image">
        <img src={img} alt={title} />
      </div>
      <div className="main-card-content">
        <p className="catText">{title}</p>
        <Link className="play-link" to={`/${title}`}>
          Play
        </Link>
      </div>
    </div>
  );
};

export { MainCard };
