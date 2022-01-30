import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Test } from './models/test';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

    baseUrl='http://localhost:9090';

  constructor(private _httpClient:HttpClient) { }

  //Fetch Product by id
  fetchEmployeeById(id:number) : Observable<any>{
    let url=`${this.baseUrl}/product/${id}`;
    return this._httpClient.get(url);
  }


  //Fetch All Records
  fetchProducts(): Observable<any> {
    let url=`${this.baseUrl}/product`;
    return this._httpClient.get(url);
  }

  //Store Products
  store(prd : Test) : Observable<any> {
    let url = `${this.baseUrl}/product`;
    const headers={"content-type":"application/json"};
    const body=JSON.stringify(prd);
    console.log(' body req : '+body)
    return this._httpClient.post(url, body,{'headers':headers});
  }
  

  //Update Product data
  update(product :Test):Observable<any>{
    const headers={"content-type":"application/json"};
    let url=`${this.baseUrl}/product/${product.id}/${product.name}/${product.price}`;
    return this._httpClient.put(url,{},undefined);
  }

  deleteProductById(id:number) : Observable <any>{
    let url=`${this.baseUrl}/product/${id}`;
   return this._httpClient.delete(url);
  }


}
