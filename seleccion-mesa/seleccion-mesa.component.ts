import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-seleccion-mesa',
  templateUrl: './seleccion-mesa.component.html',
  styleUrls: ['./seleccion-mesa.component.scss'],
  imports: [CommonModule, IonicModule, FormsModule],
})
export class SeleccionMesaComponent  implements OnInit {

  @Input() mesa: string = '';

  @Output() mesaChange: EventEmitter<string> = new EventEmitter();

  onMesaChange() {
    this.mesaChange.emit(this.mesa);
  }
  ngOnInit() {}

}
