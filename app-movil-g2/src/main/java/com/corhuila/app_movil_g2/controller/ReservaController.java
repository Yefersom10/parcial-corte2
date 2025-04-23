package com.corhuila.app_movil_g2.controller;


import com.corhuila.app_movil_g2.entity.Reserva;
import com.corhuila.app_movil_g2.iservice.IReservaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservas")
@Tag(name = "Reservas", description = "API para gestión de reservas")
public class ReservaController extends ABaseController<Reserva, IReservaService> {

    public ReservaController(IReservaService service) {
        super(service);
    }

    @Operation(summary = "Crear una nueva reserva")
    @Override
    @PostMapping
    public ResponseEntity<Reserva> save(@RequestBody Reserva reserva) {
        return super.save(reserva);
    }

    @Operation(summary = "Actualizar una reserva existente")
    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Reserva> update(@PathVariable Long id, @RequestBody Reserva reserva) {
        return super.update(id, reserva);
    }
}