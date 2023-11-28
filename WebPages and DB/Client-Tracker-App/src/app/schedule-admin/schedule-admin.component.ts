import { Component } from '@angular/core';
import { ScheduleModel } from '../schedule-model';

@Component({
  selector: 'app-schedule-admin',
  templateUrl: './schedule-admin.component.html',
  styleUrls: ['./schedule-admin.component.css']
})
export class ScheduleAdminComponent {
  model:ScheduleModel = new ScheduleModel()
  models:Array<ScheduleModel> = [{fname:"Tom",lname:"Smith",email:"t.smith@gmail.com",id:0,client_id:1,date:"11-30-2023",time:"09:30 AM"}]

  loadSchedules():void{
     //TODO populate models property
     //select * from client c join schedule s on c.id = s.client_id
     // set property models to db result
  }
  selectSchedule(id:number):void{
    let model = this.models.filter(ref => {ref.id = id})
    //call db
    // select * from schedule where id = id
    // set db result to proeprty model
  }
  editSchedule():void{
    //TODO submit changes to model property
    //update schedule set date = model.date,time = model.time where id = model.id
    //set db result to property model
  }
  deleteSchedule(id:number):void{
    //TODO delete in database
    //delete from schedule where id = id
  }

}
