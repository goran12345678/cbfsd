import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-form-mdf',
  templateUrl: './form-mdf.component.html',
  styleUrls: ['./form-mdf.component.css']
})
export class FormMdfComponent {
  formRef = new FormGroup({
      input:new FormControl()
    })
    submit():void{
      let form = this.formRef.value
      if(form.input == "")
       alert("enter input")
 else
      alert("form input: " + form.input)
    }
}
