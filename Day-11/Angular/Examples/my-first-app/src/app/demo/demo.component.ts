import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent {

   name :string="john";
   price:number=2500;
   dob:Date = new Date(1994, 9, 15);
   status:boolean=false;

   fruits:any=["Apple","orange","Mango"]


}
