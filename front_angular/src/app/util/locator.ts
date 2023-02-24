import { Injectable } from '@angular/core';

@Injectable()
export class Locator{

    public static listarAlumnos = '/alumnos/listar';
    public static listarMaterias = '/materias/listar';
    public static guardarCalificacion = '/calificaciones/guardar';

}
