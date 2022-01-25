import React from "react";


export class Hello extends React.Component {
   constructor(props){
       super(props);
   }

   render(){
       return (<div>
           <p>Hi {this.props.name}</p>
       </div>);
   }

}


class Greetings extends React.Component{
    constructor(props){
        super(props);
    }

    render(){
      return  (<div>
        <p>Hello {this.props.firstname}  {this.props.lastname}</p>
        </div>)
    }
}

export default Greetings;