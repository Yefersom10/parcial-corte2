package com.corhuila.app_movil_g2.repository;


import com.corhuila.app_movil_g2.entity.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMesaRepository extends JpaRepository<Mesa, Long> {
}