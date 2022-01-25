import logo from './logo.svg';
import './App.css';
import Greetings, { Hello } from './components/Greetings';
import Button, { Input } from './components/Button'
import { Counter } from './components/Counter';
import { Form } from './components/form-data';
import { EmployeeList } from './components/Employee-Example';
import { EmployeeCurd } from './components/Employee-Curd';



function App() {
  let message='Hello Every one';
  let profile={name:'alex',age:30,dob:new Date(1994,7,10)};
  return (
    <div>
      <h1>Welcome to React JS!!!</h1>
      <EmployeeCurd></EmployeeCurd>
          </div>
  );
}

export default App;
