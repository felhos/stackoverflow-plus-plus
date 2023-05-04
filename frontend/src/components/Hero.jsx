import React from "react";
import fullLogo from "../assets/logofull.svg";
import usericon from "../assets/usericon.svg";

import "./hero.css"

export default function Hero() {
  return (<header>
    <div className="top-bar">
        <div>
            <img src={fullLogo} id="fulllogo" alt="Logo"></img>
        </div>
        <div>
            <img src={usericon} id="usericon" alt="User Icon"></img>
        </div>
        
    </div>
    <div className="hero-container">
        <div>
            <h1>Got a question?</h1>
            <input className="ask-question" type="button" value="Ask the community!"/> 
        </div>
    </div>
  </header>)
}
