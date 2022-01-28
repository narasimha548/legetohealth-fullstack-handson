import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule   } from '@angular/forms';
import { TemplateDrivenFormsComponent } from './template-driven-forms/template-driven-forms.component';
import { ModelDrivenFormComponent } from './model-driven-form/model-driven-form.component';

@NgModule({
  declarations: [
    AppComponent,
    TemplateDrivenFormsComponent,
    ModelDrivenFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
