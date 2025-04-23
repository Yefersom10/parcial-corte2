import { CommonModule } from '@angular/common';
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-fecha-hora',
  templateUrl: './fecha-hora.component.html',
  styleUrls: ['./fecha-hora.component.scss'],
  imports: [CommonModule, IonicModule, FormsModule],
})
export class FechaHoraComponent  implements OnInit {
  constructor() {
    console.log('⚠️ Componente Fecha-Hora cargado');
  }
  
  @Input() fecha: string = '';
  @Input() hora: string = '';

  @Output() fechaChange: EventEmitter<string> = new EventEmitter();
  @Output() horaChange: EventEmitter<string> = new EventEmitter();

  onFechaChange() {
    this.fechaChange.emit(this.fecha);
  }

  onHoraChange() {
    this.horaChange.emit(this.hora);
  }

  ngOnInit() {}

}
