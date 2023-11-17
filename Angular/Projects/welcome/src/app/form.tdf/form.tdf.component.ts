import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form-tdf',
  templateUrl: './form.tdf.component.html',
  styleUrls: ['./form.tdf.component.css']
})
export class FormTdfComponent {
  submit(form: NgForm): void {
    let values = form.value
    alert("Form input: " + values.input)
  }
}
