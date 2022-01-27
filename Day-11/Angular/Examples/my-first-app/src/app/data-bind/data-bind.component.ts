import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent {

  phoneNumber : number=908786;
  username : string='charles';
  toggleButton : boolean= false;

  handleClick(val : string){
    this.username=val;
    this.toggleButton=!this.toggleButton;
  }

}
