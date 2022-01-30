import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-delete-product',
  templateUrl: './delete-product.component.html',
  styleUrls: ['./delete-product.component.css']
})
export class DeleteProductComponent implements OnInit {

  constructor(private _service:ProductService,private _builders:FormBuilder) { }

  ngOnInit(): void {
  }

  product=this._builders.group({
    id : [] , name :[], price : []
  })

  prdct : any = undefined;


  deleteProduct() : void {

    let id=this.product.controls['id'].value;

    console.log(" id : "+id);
    this._service.deleteProductById(id).subscribe(res => {
      console.log(res);
      this.prdct = res;
    }, err => {
      console.log(err);
    });

  }

}
