import { Component } from '@angular/core';
import { Client } from '../client';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DataService } from '../data.service';

@Component({
  selector: 'app-client-info',
  templateUrl: './client.info.component.html',
  styleUrls: ['./client.info.component.css']
})
export class ClientInfoComponent {
  clients: any = null
  client: Client = new Client()
  constructor(public srv: DataService) {
    this.client.first_name = ""
    this.client.last_name = ""
    this.client.email = ""
    this.loadClients()
  }

  submit(): void {
    console.log("client id", this.client.id)
    if (this.client.id > 0)
      this.srv.editClient(this.client)
    else
      this.srv.addClient(this.client)

    this.loadClients()
    console.log(this.client)
  }
  loadClients(): void {
    this.srv.getClients().subscribe(result => {
      this.clients = result
      console.log("clients", this.clients)
    })
  }
  deleteClient(id: number) {
    this.srv.deletClient(id)
    this.loadClients()
  }
  editClient(id: number) {
    this.srv.getClient(id)
      .subscribe(result => {
        this.client = result
      })

  }
}
