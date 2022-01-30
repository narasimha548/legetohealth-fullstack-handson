import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Test } from '../models/test';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  constructor(private _service:ProductService,private _builders:FormBuilder) { }

  ngOnInit(): void {
  }

  product=this._builders.group({
    id : [] , name : [] , price : []
  })

  res :any=undefined;

  updateProduct() : void {

    let id=this.product.controls['id'].value;
    let name=this.product.controls['name'].value;
    let price=this.product.controls['price'].value;

    //console.log(" id : "+id  + " name : "+name +"  price: "+price);

    const prd=new Test(id,name,price);
    console.log(prd)

      this._service.update(prd).subscribe(res =>{
        
        console.log(res);
    this.res=res.res;
      },err=>{

        console.log(err);
      });

  }

}
