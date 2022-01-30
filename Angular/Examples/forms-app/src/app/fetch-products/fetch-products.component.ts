import { Component, OnInit } from '@angular/core';
import { Product } from '../models/product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-fetch-products',
  templateUrl: './fetch-products.component.html',
  styleUrls: ['./fetch-products.component.css']
})
export class FetchProductsComponent implements OnInit {

  constructor(private _service:ProductService) { }

  ngOnInit(): void {
  }

   products :Product[] | undefined;

   res : any=undefined;

  handleSubmit() : void {
      this._service.fetchProducts().subscribe((data:Product[]) =>{
        console.log(data);
        this.products=data;
        
      }, err=>{
        console.log(err);
      })
  }

}
