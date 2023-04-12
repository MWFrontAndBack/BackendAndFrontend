import React from "react";
import "./cardstyles.css";
import { MyButton } from "../soundComponent/sounds";
const Card = (props) => {
  const { artistname, musicCollection, photo } = props.artist;
  return (
    <div className="card">
      <img src={photo} alt="Artist photo" className="card-image" />
      <div className="card-info">
        <h2 className="card-title">{artistname}</h2>
        <ul className="card-list">
          {musicCollection.map((music) => (
            <li key={music.idMusic} className="card-list-item">
              <p className="song-name">{music.name}</p>
              <MyButton path={music.path} />
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export { Card };
