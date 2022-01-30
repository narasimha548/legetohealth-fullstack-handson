import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Test } from '../models/test';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-store-product',
  templateUrl: './store-product.component.html',
  styleUrls: ['./store-product.component.css']
})
export class StoreProductComponent implements OnInit {

 
  constructor(private _service:ProductService,private _builders:FormBuilder) { }

  ngOnInit(): void {
  }


  product=this._builders.group({
    id : [] , name : [] , price : []
  })

  prdct : any =undefined;

   storeProduct() : void {
    let id=this.product.controls['id'].value;
    let name=this.product.controls['name'].value;
    let price=this.product.controls['price'].value;

    //console.log(" id : "+id  + " name : "+name +"  price: "+price);

    const prd=new Test(id,name,price);
    console.log(prd)

    this._service.store(prd).subscribe(data =>{
       console.log(data.status);
       this.prdct=data.res;
    },err=>{
      console.log(err.json());
    })

   }

}
