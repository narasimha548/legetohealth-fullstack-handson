import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-fetch-product',
  templateUrl: './fetch-product.component.html',
  styleUrls: ['./fetch-product.component.css']
})
export class FetchProductComponent implements OnInit {

  constructor(private _serivce:ProductService, private _builder:FormBuilder) { }

  ngOnInit(): void {
  }

  product=this._builder.group({
    id : [] , name : [] , price : []
  })

  prdct : any = undefined;
  errorMessage : any = undefined;
 

  handleSubmit() : void{
     
    console.log(this.product);
    let id=this.product.controls['id'].value;

       this._serivce.fetchEmployeeById(id).subscribe(response=>{  
       this.prdct = response;
       this.errorMessage = undefined;
      }, err=>{
        console.log(this.errorMessage);
        this.errorMessage = err.error.err;
        this.prdct = undefined;
      });

      this.product.reset({});
  }

}
