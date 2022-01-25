import React from "react";
import axios from 'axios';

export class EmployeeCurd extends React.Component{

   constructor(props){
       super(props);

       this.state={name:'',salary:''}

   }

   handleOnChange=event=>{
       this.setState({[event.target.name]:event.target.value});
   }

   hanldeSubmit=(event)=>{
     event.preventDefault();
     console.log(this.state);

     axios.post("http://localhost:9090/save",this.state).then(response=>{
         console.log(response);
     }).catch(err=>{
         console.log(err);
     })
   }

    render(){
        return(<div>
              <form onSubmit={this.hanldeSubmit}>
                  <div>
                      <input type="text" name="name" onChange={this.handleOnChange}  autoComplete="off"></input>
                  </div>
                  <div>
                      <input type="number" name="salary" onChange={this.handleOnChange}  autoComplete="off"></input>
                  </div>
                  <div>
                      <button type="submit">submit</button>
                  </div>
              </form>
        </div>)
    }
}