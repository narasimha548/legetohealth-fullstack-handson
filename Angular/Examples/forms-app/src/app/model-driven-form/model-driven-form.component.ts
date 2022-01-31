import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-model-driven-form',
  templateUrl: './model-driven-form.component.html',
  styleUrls: ['./model-driven-form.component.css']
})
export class ModelDrivenFormComponent  {

  //Dependency Injection
  constructor(private _route:Router,private _builder:FormBuilder) { }

  profile=this._builder.group({
    firstname :['' , Validators.compose([Validators.required,Validators.minLength(3)])],
    lastname : ['', Validators.compose([Validators.required, Validators.minLength(2)])]
  })

  handleSubmit(){
    console.log(this.profile.value);
    let firstname=this.profile.controls['firstname'].value;

    // Authenticate Hard code values 
    if(firstname=='alex'){
      //store the firstname in session storage
      sessionStorage.setItem('user',firstname);
      this._route.navigate(['success' , firstname]) // request path will be success to success/firstname value -> success/:un
    }else{

      this._route.navigate(['mdf']);
      this.profile.reset();
    }
   
  }
  
}
