import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { DemoComponent } from './demo/demo.component';
import { DataBindComponent } from './data-bind/data-bind.component';
import { FormsModule } from '@angular/forms';
import { GenderPipe } from './gender.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    DemoComponent,
    DataBindComponent,
    GenderPipe
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
