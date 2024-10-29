import { Component } from "react";

export class ScoreBoard extends Component {
    constructor() {
        super();
        this.state = {
            score: 0
        };
    }

    incrementScore = () => {
        this.setState(prevState => ({
            score: prevState.score + 1
        }));
    };

    decrementScore = () => {
        this.setState(prevState => ({
            score: prevState.score - 1
        }));
    };

    render() {
        return (
            <div>
                <h1>{this.state.score}</h1> {/* value of state will be decided by component dynamically */}
                <button onClick={this.incrementScore}>+</button>
                <button onClick={this.decrementScore}>-</button>
            </div>
        );
    }
}
