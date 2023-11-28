import { Component, ComponentFactoryResolver } from '@angular/core';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-client-scheduler',
  templateUrl: './client-scheduler.component.html',
  styleUrls: ['./client-scheduler.component.css']
})
export class ClientSchedulerComponent {
  message:string = ""
  blockedates:Array<string> = []

  submit(form: NgForm): void {
    let values = form.value
    let fname = values.fname 
    let lname = values.lname
    let email = values.email
    let date = values.date
    let time = values.time
    console.log("fname:", fname, "lname: ", lname, " email",email, " date: ", date, " time: " , time)
    this.message = "Your meeting is schedule and email confirmation will arrive shortly"
  }
}
