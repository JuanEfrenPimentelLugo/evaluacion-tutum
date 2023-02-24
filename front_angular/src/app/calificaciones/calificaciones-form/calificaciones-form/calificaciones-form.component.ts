import { Component, Inject, LOCALE_ID } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { TAlumno } from '../../../model/t-alumno';
import { CursosService } from '../../../servicios/cursos.service';
import { TMaterias } from '../../../model/t-materias';
import { TCalificaciones } from '../../../model/t-calificaciones';
import {formatDate} from '@angular/common';

@Component({
  selector: 'app-calificaciones-form',
  templateUrl: './calificaciones-form.component.html',
  styleUrls: ['./calificaciones-form.component.css']
})
export class CalificacionesFormComponent {

  alumno!: TAlumno;
  materias!: TMaterias[];

  constructor(
    public cursosService:CursosService,
    public dialogRef: MatDialogRef<CalificacionesFormComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    @Inject(LOCALE_ID) private locale: string,
  ) {
    this.alumno = data['alumno'];
  }

  ngOnInit(){
    this.cursosService.getMaterias().subscribe({
      next: (mat: TMaterias[]) => {
        this.materias = mat;
      },
      error: (err: any) => {
      },
      complete: () => {
          //this.loadingService.hide();
      }
    });
  }


  save(materia: TMaterias){
    let cal = new TCalificaciones();
    cal.idTMaterias = materia.idTMaterias;
    cal.idTUsuarios = this.alumno.idTUsuarios;
    cal.fechaRegistro = formatDate(Date.now(),'yyyy-MM-dd',this.locale);
    cal.calificacion = materia.calificacion;

    this.cursosService.saveCalificacion(cal).subscribe({
      next: (data) => {
          console.log(data);
      },
      error: () => { },
      complete: () => {

      }
  });;
  }

}
