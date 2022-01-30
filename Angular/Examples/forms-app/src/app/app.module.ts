import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule   } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { TemplateDrivenFormsComponent } from './template-driven-forms/template-driven-forms.component';
import { ModelDrivenFormComponent } from './model-driven-form/model-driven-form.component';
import { FetchProductComponent } from './fetch-product/fetch-product.component';
import { FetchProductsComponent } from './fetch-products/fetch-products.component';
import { StoreProductComponent } from './store-product/store-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';

@NgModule({
  declarations: [
    AppComponent,
    TemplateDrivenFormsComponent,
    ModelDrivenFormComponent,
    FetchProductComponent,
    FetchProductsComponent,
    StoreProductComponent,
    UpdateProductComponent,
    DeleteProductComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
