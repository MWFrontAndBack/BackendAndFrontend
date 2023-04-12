import React from "react";
import { MainCard } from "../mainCards/mainCard";
import { Link } from "react-router-dom";
import "../general.css";
const MainOptions = () => {
  const categories = [
    {
      id: 1,
      title: "music",
      img: "https://www.analyticsinsight.net/wp-content/uploads/2021/09/Cant-believe-in-AI-songs-Top-7-Rock-Songs-Written-by-AI-Bots.jpg",
    },
    {
      id: 2,
      title: "movies",
      img: "https://i.ebayimg.com/images/g/MigAAOSwVA1ilMiu/s-l500.jpg",
    },
    {
      id: 3,
      title: "footballers",
      img: "https://assets.publishing.service.gov.uk/government/uploads/system/uploads/image_data/file/176455/s960_Football_gov.uk.jpg",
    },
  ];
  return (
    <div className="main-options">
      {categories.map((c) => {
        return <MainCard key={c.id} detail={c} />;
      })}
    </div>
  );
};

export { MainOptions };
