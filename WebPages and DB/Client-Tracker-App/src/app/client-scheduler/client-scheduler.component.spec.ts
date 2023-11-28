import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientSchedulerComponent } from './client-scheduler.component';

describe('ClientSchedulerComponent', () => {
  let component: ClientSchedulerComponent;
  let fixture: ComponentFixture<ClientSchedulerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ClientSchedulerComponent]
    });
    fixture = TestBed.createComponent(ClientSchedulerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
