import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent {
  toggle:boolean = true
  clients:Array<string> = ["Client 1","Client 2","Client 3"]

}
