package com.corhuila.app_movil_g2.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reserva extends ABaseEntity {
    private LocalDateTime fechaHora;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Mesa mesa;

    // Getters y Setters
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}