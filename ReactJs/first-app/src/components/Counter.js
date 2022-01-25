import React from "react";

export class Counter extends React.Component{

    constructor(props){
         super(props);
         this.state={likes:0,dislikes:0};
         // this.state={value:''};
        // this.handleChange = this.handleChange.bind(this);
    }

    likesCounter=(event)=>{
       this.setState(prevState=>({likes:prevState.likes+1}));
    }

    disLikesCounter=(event)=>{
        this.setState(prevState=>({dislikes:prevState.dislikes+1}));
    }

    handleChange=(event)=>{
        this.setState({value:this.value});
    }

    render(){
        return(<div>
            <h2>counter component!!</h2>
            <p>Likes : {this.state.likes}</p>
            <p>Dislikes: {this.state.dislikes}</p>
            <p>oput : {this.state.value}</p>
            <input type="text"  value={this.state.value} onChange={this.handleChange}></input>
            
            <button onClick={this.likesCounter}>Like</button>
            <button  onClick={this.disLikesCounter}>DisLike</button>
        </div>)
    }
}