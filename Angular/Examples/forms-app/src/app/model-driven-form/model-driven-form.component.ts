import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-model-driven-form',
  templateUrl: './model-driven-form.component.html',
  styleUrls: ['./model-driven-form.component.css']
})
export class ModelDrivenFormComponent  {

  //Dependency Injection
  constructor(private _builder:FormBuilder) { }

  profile=this._builder.group({
    firstname :['' , Validators.compose([Validators.required,Validators.minLength(3)])],
    lastname : ['', Validators.compose([Validators.required, Validators.minLength(2)])]
  })

  handleSubmit(){
    console.log(this.profile.value);
    this.profile.reset();
  }
  
}
