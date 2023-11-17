import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ClientFormService } from '../client-form.service';
//import { ValidationService } from '../validation-service';

@Component({
  selector: 'app-client-form',
  templateUrl: './client-form.component.html',
  styleUrls: ['./client-form.component.css']
})
export class ClientFormComponent {
  clients:Array<string> = []
  constructor(public service:ClientFormService){}
  formRef = new FormGroup({
    input:new FormControl()
  })
  submit():void{
    //let vs = new ValidationService()
    //vs.validateClientForm(this.formRef.value)
    this.service.validateClientForm(this.formRef.value)
    //alert("form input: " + this.formRef.value.input)
  }
  getClients():void{
    this.service.getClients()
  }
}
