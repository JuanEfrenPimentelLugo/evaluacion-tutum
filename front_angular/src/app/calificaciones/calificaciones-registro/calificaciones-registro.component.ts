
import { FormControl } from '@angular/forms'

import {OnInit,AfterViewInit, Component, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';
import { AlumnosServiceService } from 'src/app/servicios/alumnos-service.service';
import { TAlumno } from '../../model/t-alumno';
import {MatDialog} from '@angular/material/dialog';
import { CalificacionesFormComponent } from '../calificaciones-form/calificaciones-form/calificaciones-form.component';
import { CursosService } from '../../servicios/cursos.service';

@Component({
  selector: 'app-calificaciones-registro',
  templateUrl: './calificaciones-registro.component.html',
  styleUrls: ['./calificaciones-registro.component.css']
})
export class CalificacionesRegistroComponent implements OnInit,AfterViewInit {

  constructor(public alumnoService:AlumnosServiceService,
              public dialog: MatDialog) { }

  alumnos!: TAlumno[];
  displayedColumns: string[] = ['id', 'nombre', 'calificaciones'];
  dataSource = new MatTableDataSource<PeriodicElement>(ELEMENT_DATA);

  ngOnInit(){
    this.alumnoService.getObtener().subscribe({
      next: (op: TAlumno[]) => {
        this.alumnos = op;
        this.dataSource = new MatTableDataSource<PeriodicElement>(this.alumnos);
      },
      error: (err: any) => {
      },
      complete: () => {
          //this.loadingService.hide();
      }
    });
  }

  openDialog(alu:TAlumno) {
    const dialogRef = this.dialog.open(CalificacionesFormComponent, {
      data: {alumno: alu},
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }



  @ViewChild(MatPaginator) paginator!: MatPaginator;

  ngAfterViewInit() {

    this.dataSource.paginator = this.paginator;
  }
}

export interface PeriodicElement {
  nombre: string;
  idTUsuarios: number;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {idTUsuarios: 1, nombre: 'Hydrogen'},
  {idTUsuarios: 2, nombre: 'Helium'},
  {idTUsuarios: 3, nombre: 'Lithium'}
];
