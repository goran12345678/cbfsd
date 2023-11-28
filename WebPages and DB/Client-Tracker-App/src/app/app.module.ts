import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientSchedulerComponent } from './client-scheduler/client-scheduler.component';
import { ScheduleAdminComponent } from './schedule-admin/schedule-admin.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientSchedulerComponent,
    ScheduleAdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
