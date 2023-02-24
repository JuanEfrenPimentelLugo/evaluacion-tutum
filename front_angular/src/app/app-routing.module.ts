import { createComponent, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalificacionesConsultaComponent } from './calificaciones/calificaciones-consulta/calificaciones-consulta/calificaciones-consulta.component';
import { CalificacionesRegistroComponent } from './calificaciones/calificaciones-registro/calificaciones-registro.component';

const routes: Routes = [
  { path: 'calificaciones/registro', component: CalificacionesRegistroComponent },
  { path: 'calificaciones/consulta', component: CalificacionesConsultaComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
