import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login-demo',
  templateUrl: './login-demo.component.html',
  styleUrls: ['./login-demo.component.css']
})
export class LoginDemoComponent {

  constructor(private _service:UserService, private _builder : FormBuilder) { }

  user=this._builder.group({
    username : [] , password : []
  });

   //name : string=undefined;
  // pwd : string =undefined;
  
  handleLogin() : void {
    
    console.log(this.user.value);
    let username=this.user.controls['username'].value;
    let pwd=this.user.controls['password'].value;
     this._service.fetchById(username).subscribe(res =>{
       console.log(res);
       let data=res;
       if(data.name==username && data.password == pwd){
          console.log("Sucess " +data.name + ' '+data.password);
       }

     }, err => {
        console.log(err);
     })
  }

}
