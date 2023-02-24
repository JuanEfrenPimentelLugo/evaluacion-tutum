import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalificacionesRegistroComponent } from './calificaciones-registro.component';

describe('CalificacionesRegistroComponent', () => {
  let component: CalificacionesRegistroComponent;
  let fixture: ComponentFixture<CalificacionesRegistroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalificacionesRegistroComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalificacionesRegistroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
