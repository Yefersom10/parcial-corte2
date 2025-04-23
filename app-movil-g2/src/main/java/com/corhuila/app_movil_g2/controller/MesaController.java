package com.corhuila.app_movil_g2.controller;

import com.corhuila.app_movil_g2.entity.Mesa;
import com.corhuila.app_movil_g2.iservice.IMesaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    private final IMesaService mesaService;

    public MesaController(IMesaService mesaService) {
        this.mesaService = mesaService;
    }

    @PostMapping
    public ResponseEntity<Mesa> save(@RequestBody Mesa mesa) {
        return ResponseEntity.ok(mesaService.save(mesa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mesa> getById(@PathVariable Long id) {
        return ResponseEntity.ok(mesaService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Mesa>> getAll() {
        return ResponseEntity.ok(mesaService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mesa> update(@PathVariable Long id, @RequestBody Mesa mesa) {
        return ResponseEntity.ok(mesaService.update(id, mesa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mesaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}