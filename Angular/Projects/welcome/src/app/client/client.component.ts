import { Component } from '@angular/core';

@Component({ /* decorator, metadata describing the component */
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent {
  msg:string = "Hello all from inside the class."
  disabled:boolean = false
  text:string = "Hello text"
  message:string ="Hi there"
  showClick():void {
    alert('clicked')
  }
  getText(ref:any):void{
    alert('text: ' + ref.value)
  }
  reset():void{
    this.message = "text reset"
  }
}
