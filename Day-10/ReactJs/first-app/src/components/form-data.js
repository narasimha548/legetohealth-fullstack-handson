import React from "react";


export class Form extends React.Component{

    constructor(props){
        super(props)
        this.state={value:'',no:'',ge:''}
    }

    handleInput=(event)=>{
      console.log("Event ",event.target.value);
      this.setState({value:event.target.value});
    }
   
    handleRadio=(event)=>{
        console.log("Event ",event.target.value);
        this.setState({ge:event.target.value});
    }
    handlePhoneNumber=(event)=>{
        console.log("Event ",event.target.value);
        this.setState({no:event.target.value});
    }

    handleClick=(e)=>{
        console.log(e);
    }

    render(){
         return(<div>
           
             Name : <input type="text" name="Fname" onChange={this.handleInput} ></input><br/>
             Gender:  <input type="radio"   value="Male" onChange={this.handleRadio} ></input>
                      <input type="radio"  value="Fe-Male" onChange={this.handleRadio}></input><br/>
            Phone number <input type="number" name="phnumber" onChange={this.handlePhoneNumber} ></input>

            <p>output : {this.state.value}, {this.state.ge} ,{this.state.no}</p>
             
            <button onClick={this.handleClick}>Click</button>
            
         </div>)
    }
}