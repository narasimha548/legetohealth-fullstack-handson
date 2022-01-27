import logo from './logo.svg';
import './App.css';
import Greetings, { Hello } from './components/Greetings';
import Button, { Input } from './components/Button'
import { Counter } from './components/Counter';
import { Form } from './components/form-data';
import { EmployeeList } from './components/Employee-Example';
import { EmployeeCurd, EmployeeUpdate } from './components/Employee-Curd';
import {Route,Link,Routes} from 'react-router-dom'


function Navigation(){
  return(<div>
    <Link to='/store'>Store Employess</Link>  /
    <Link to='/fetchAll'>Show Employess Data</Link> /
    <Link to='/update'>Update Employess Data</Link>
  </div>)
}


function App() {
  let message='Hello Every one';
  let profile={name:'alex',age:30,dob:new Date(1994,7,10)};
  return (
    <div>
      <h1> React Js </h1>
             <div>
                <Navigation></Navigation>
             </div>
              <div>
                 <Routes>
                  
                     <Route path='/store' element={<EmployeeCurd/>}></Route>
                     <Route path='/fetchAll' element={<EmployeeList/>}></Route>
                     <Route path='/update' element={<EmployeeUpdate/>}></Route>
                 </Routes>
              </div>
          </div>
  );
}

export default App;
