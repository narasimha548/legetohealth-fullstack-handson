import React from "react";
import axios from 'axios';


export class EmployeeList extends React.Component{
    constructor(props){
        super(props);
        this.state={employess:[]};
    }
    handleRefresh = (event) => {
        let url = 'http://localhost:9090/employees';
        axios.get(url)
        .then((response) => this.setState({employees : response.data}))
        .catch((err) => console.log(err))
    }
  

    render(){
        return(<div>
            <h2>EmployeeList Data !!! </h2>
            <button onClick={this.handleRefresh}>Referesh</button>

            <table className="table table-striped">
                <thead>
                    <tr>
                        <th>Sl no</th><th>name </th><th>age</th>

                    </tr>
                    <tbody>
                        {this.state.employess.map((item,index)=><tr key={item.id}>
                            <td>{index+1}</td><td>{item.id}</td><td>{item.name}</td><td>{item.salary}</td>
                            </tr>)}
                    </tbody>
                </thead>

            </table>
        </div>)
    }
}