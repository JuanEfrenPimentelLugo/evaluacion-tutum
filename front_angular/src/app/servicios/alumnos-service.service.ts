import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Locator} from '../util/locator';
import { Observable } from 'rxjs';
import { TAlumno } from '../model/t-alumno';

@Injectable({
  providedIn: 'root'
})
export class AlumnosServiceService {

  baseUrl='https://www.jie.mx/escuela';

  constructor(public _http: HttpClient) { }

  getObtener(): Observable<any> {
    return this._http.get<TAlumno[]>(this.baseUrl
        + Locator.listarAlumnos);
  }

}
