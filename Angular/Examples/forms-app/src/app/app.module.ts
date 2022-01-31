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
import { RouterDemoComponent } from './router-demo/router-demo.component';
import { Routes , RouterModule } from '@angular/router';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProfileComponent } from './profile/profile.component';
import { SettingsComponent } from './settings/settings.component';
import { AuthDemoGuard } from './auth-demo.guard';

let routeConfig: Routes = [
  {path : '', component : FetchProductsComponent},
  {path : 'fetchAll', component : FetchProductsComponent},
  {path : 'fetchById', component : FetchProductComponent},
  {path : 'tdf', component : TemplateDrivenFormsComponent},
  {path : 'mdf', component : ModelDrivenFormComponent},
  {path : 'success/:un' , component : SuccessComponent , canActivate : [AuthDemoGuard],children : [
    {path : '' , component : DashboardComponent},
    {path : 'dashboard' , component : DashboardComponent},
    {path : 'profile' , component : ProfileComponent},
    {path : 'settings', component : SettingsComponent}
  ]}
]

@NgModule({
  declarations: [
    AppComponent,
    TemplateDrivenFormsComponent,
    ModelDrivenFormComponent,
    FetchProductComponent,
    FetchProductsComponent,
    StoreProductComponent,
    UpdateProductComponent,
    DeleteProductComponent,
    RouterDemoComponent,
    SuccessComponent,
    DashboardComponent,
    ProfileComponent,
    SettingsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routeConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
