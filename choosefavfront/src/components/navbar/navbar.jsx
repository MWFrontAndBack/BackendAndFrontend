import React from "react";
import { Link } from "react-router-dom";
import "./navstyles.css";
const NavBar = () => {
  return (
    <div>
      <div className="navbar-container">
        <div className="logo-container"></div>
        <div className="links-container">
          <Link className="login-link" to="/login">
            Login
          </Link>
          <Link className="login-link" to="/music">
            Music
          </Link>
          <Link className="login-link" to="/movies">
            Movies
          </Link>
        </div>
      </div>
    </div>
  );
};

export { NavBar };
