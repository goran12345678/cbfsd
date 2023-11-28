import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ClientSchedulerComponent } from './client-scheduler/client-scheduler.component';
import { ScheduleAdminComponent } from './schedule-admin/schedule-admin.component';

const routes: Routes = [
  {path:"client",component:ClientSchedulerComponent},
  {path:"schedadmin",component:ScheduleAdminComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
