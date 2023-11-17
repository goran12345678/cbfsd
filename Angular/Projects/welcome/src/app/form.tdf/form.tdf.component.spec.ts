import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormTdfComponent } from './form.tdf.component';

describe('FormTdfComponent', () => {
  let component: FormTdfComponent;
  let fixture: ComponentFixture<FormTdfComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormTdfComponent]
    });
    fixture = TestBed.createComponent(FormTdfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
