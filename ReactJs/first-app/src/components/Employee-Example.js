import React from "react";


export class EmployeeList extends React.Component{
    constructor(props){
        super(props);
        this.state={employess:[]};
    }
 
    handleCLick=event=>{
        this.setState({
            employess:[{id:100,name:'alex',salary:200},{id:200,name:'bruce',salary:300}]
        })
    }

    render(){
        return(<div>
            <h2>EmployeeList Data !!! </h2>
            <button onClick={this.handleCLick}>Referesh</button>

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