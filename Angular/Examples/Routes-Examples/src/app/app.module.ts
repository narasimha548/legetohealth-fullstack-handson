import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginDemoComponent } from './login-demo/login-demo.component';
import { FormsModule , ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Routes , RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    LoginDemoComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
