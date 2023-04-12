import React, { useState, useEffect } from "react";
import { Card } from "../cards/card";
import "./directory.css";
const Directory = () => {
  const [music, setMusic] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/music/all")
      .then((response) => response.json())
      .then((data) => setMusic(data))
      .catch((error) => console.error(error));
  }, []);

  return (
    <div className="directory">
      {console.log(music)}
      {music.map((artistData, index) => (
        <Card key={index} artist={artistData} className="card" />
      ))}
    </div>
  );
};

export { Directory };
