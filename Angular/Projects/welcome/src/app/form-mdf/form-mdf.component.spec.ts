import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormMdfComponent } from './form-mdf.component';

describe('FormMdfComponent', () => {
  let component: FormMdfComponent;
  let fixture: ComponentFixture<FormMdfComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormMdfComponent]
    });
    fixture = TestBed.createComponent(FormMdfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
