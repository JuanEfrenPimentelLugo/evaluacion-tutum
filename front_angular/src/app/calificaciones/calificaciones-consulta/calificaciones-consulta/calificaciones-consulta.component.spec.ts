import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalificacionesConsultaComponent } from './calificaciones-consulta.component';

describe('CalificacionesConsultaComponent', () => {
  let component: CalificacionesConsultaComponent;
  let fixture: ComponentFixture<CalificacionesConsultaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalificacionesConsultaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalificacionesConsultaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
