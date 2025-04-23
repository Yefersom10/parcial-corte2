package com.corhuila.app_movil_g2.entity;

import jakarta.persistence.*;

@Entity
public class Mesa extends ABaseEntity {
    private String nombre; // Ej: "Mesa 5"
    private int capacidad;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}