import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TAlumno } from '../model/t-alumno';
import { Locator } from '../util/locator';
import { TMaterias } from '../model/t-materias';
import { TCalificaciones } from '../model/t-calificaciones';

@Injectable({
  providedIn: 'root'
})
export class CursosService {
  baseUrl='https://www.jie.mx/escuela';

  constructor(public _http: HttpClient) { }

  getAlumnos(): Observable<any> {
    return this._http.get<TAlumno[]>(this.baseUrl
        + Locator.listarAlumnos);
  }
  getMaterias(): Observable<any> {
    return this._http.get<TMaterias[]>(this.baseUrl
        + Locator.listarMaterias);
  }

  saveCalificacion(calificacion: TCalificaciones): Observable<any> {
    return this._http.post<TCalificaciones>(this.baseUrl
        + Locator.guardarCalificacion, calificacion);
  }


}
