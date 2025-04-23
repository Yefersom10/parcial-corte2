import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-datos-cliente',
  templateUrl: './datos-cliente.component.html',
  styleUrls: ['./datos-cliente.component.scss'],
  imports: [CommonModule, IonicModule, FormsModule],
})
export class DatosClienteComponent  implements OnInit {

  @Input() nombre: string = '';
  @Input() contacto: string = '';
  
  @Output() nombreChange: EventEmitter<string> = new EventEmitter();
  @Output() contactoChange: EventEmitter<string> = new EventEmitter();

  onNombreChange() {
    this.nombreChange.emit(this.nombre);
  }

  onContactoChange() {
    this.contactoChange.emit(this.contacto);
  }
  ngOnInit() {}

}
