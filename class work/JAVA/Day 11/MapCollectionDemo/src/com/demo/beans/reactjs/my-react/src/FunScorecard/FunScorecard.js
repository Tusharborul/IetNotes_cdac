import React from 'react'
import { useState } from "react";

export function FunScorecard(){
const[score,setScore]=useState(0);
const[player,setPlayer]=useState("rohan");
const incrementScore=()=>{
    setScore(score+4);

}
const decrementScore=()=>{
    setScore(score-1);        

}
const changePlayerName=()=>{
    setPlayer("suraj");


}
return(

    <div>
        <h1>{player} has scored {score}</h1>
        <button onClick={incrementScore}>+</button>
        <button onClick={decrementScore}>-</button>
        <button onClick={changePlayerName}>Change Player</button>
    </div>


);
}