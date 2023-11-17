import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ClientFormService {

  constructor(public http:HttpClient) { }

  validateClientForm(form: any): void {
    if (form.input == null)
      alert("enter text")
  }
  getClients(){
    this.http.get("#").subscribe({
      next:(data:any) =>{console.log(data)},
      error: (error:any) => {console.log(error)},
      complete: () => {console.log("http complete")}
    })
  }
}
