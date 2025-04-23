package com.corhuila.app_movil_g2.repository;


import com.corhuila.app_movil_g2.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
