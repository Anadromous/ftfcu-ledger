import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckingEditComponent } from './checking-edit.component';

describe('CheckingEditComponent', () => {
  let component: CheckingEditComponent;
  let fixture: ComponentFixture<CheckingEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckingEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckingEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
