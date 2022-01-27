import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';

  users=[
    {name:'sachin',gender:'MALE'},
    {name:'Madhana',gender:'FE-MALE'},
    {name:'Alex',gender:'MALE'},
    {name:'Geniffer',gender:'FE-MALE'}
  ]
}
