import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ClientComponent } from './client/client.component';
import { FormTdfComponent } from './form.tdf/form.tdf.component';
import { FormMdfComponent } from './form-mdf/form-mdf.component';
import { DirectivesComponent } from './directives/directives.component';
import { ClientFormComponent } from './client-form/client-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientComponent,
    FormTdfComponent,
    FormMdfComponent,
    DirectivesComponent,
    ClientFormComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
