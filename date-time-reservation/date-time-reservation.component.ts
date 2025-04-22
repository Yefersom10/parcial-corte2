import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
@Component({
  selector: 'app-date-time-reservation',
  templateUrl: './date-time-reservation.component.html',
  styleUrls: ['./date-time-reservation.component.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule], // Aquí puedes agregar módulos adicionales si es necesario
})
export class DateTimeReservationComponent  implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  fechaHoraSeleccionada: string | undefined;

  onFechaHoraChange(event: any) {
    this.fechaHoraSeleccionada = event.detail.value;
    // Emitir el evento con la fecha seleccionada
  }
}
