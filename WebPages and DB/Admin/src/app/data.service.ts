import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Client } from './client';
import { Observable } from 'rxjs';
import { identifierName } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(public http: HttpClient) { }

  getClients(): Observable<Client[]> {

    let result: Array<Client> = new Array<Client>()

    return this.http.get<Client[]>("http://localhost:3000/clients")

  }
  getClient(id: Number): Observable<Client> {
    return this.http.get<Client>("http://localhost:3000/clients/" + id)
  }
  addClient(client: Client): void {
    //console.log("service add", client)
    this.http.post("http://localhost:3000/clients", client)
      .subscribe(
        {
          next: (data: any) => { },
          error: (error: any) => { }
        }
      )
  }
  editClient(client: Client): void {
    //console.log("service add", client)
    this.http.put("http://localhost:3000/clients/" + client.id, client)
      .subscribe(
        {
          next: (data: any) => { },
          error: (error: any) => { }
        }
      )
  }
  deletClient(id: number) {
    this.http.delete("http://localhost:3000/clients/" + id)
      .subscribe(
        {
          next: (data: any) => { },
          error: (error: any) => { }
        }
      )

  }
}
