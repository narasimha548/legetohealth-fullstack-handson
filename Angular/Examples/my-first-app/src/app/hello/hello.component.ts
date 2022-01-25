import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent  {

  title:string="Employee Data";
  employess : any=[
    {id: 100, name : 'Alex', salary: 45000}, 
    {id: 200, name: 'charles', salary:4000}];

}
