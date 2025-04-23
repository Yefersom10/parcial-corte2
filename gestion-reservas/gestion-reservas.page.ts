import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { ReservaService } from 'src/app/services/reserva.service';
import { SeleccionMesaComponent } from 'src/app/components/seleccion-mesa/seleccion-mesa.component';
import { FechaHoraComponent } from 'src/app/components/fecha-hora/fecha-hora.component';
import { DatosClienteComponent } from 'src/app/components/datos-cliente/datos-cliente.component';

@Component({
  selector: 'app-gestion-reservas',
  templateUrl: './gestion-reservas.page.html',
  styleUrls: ['./gestion-reservas.page.scss'],
  standalone: true,
  imports: [CommonModule,
    IonicModule,
    FormsModule,
    FechaHoraComponent,
    DatosClienteComponent,
    SeleccionMesaComponent]
})
export class GestionReservasPage  {
  
  reserva = {
    nombre: '',
    contacto: '',
    fecha: '',
    hora: '',
    mesa: ''
  };

  reservasGuardadas: any[] = [];

  constructor(private reservaService: ReservaService) { console.log('✅ Componente Gestor de Reservas cargado');}
  

  guardar() {
    this.reservaService.crearReserva({ ...this.reserva });
    this.reservasGuardadas = this.reservaService.obtenerReservas();
    alert('Reserva guardada correctamente');
  }
}
