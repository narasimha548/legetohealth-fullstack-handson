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
                  <h2>Store Data !!</h2>
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


export class EmployeeUpdate extends React.Component{
    render() {
        return (<div>
            <h3>Update Employee</h3> <hr />
            <label>
                Id <input type = 'text'></input>
                <br />
                Salary <input type = 'number'></input>
                <br />
                <button>Update</button>
            </label>
        </div>)
    }   
}