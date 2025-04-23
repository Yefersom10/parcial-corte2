package com.corhuila.app_movil_g2.service;

import com.corhuila.app_movil_g2.entity.Mesa;
import com.corhuila.app_movil_g2.iservice.IMesaService;
import com.corhuila.app_movil_g2.repository.IMesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService implements IMesaService {

    private final IMesaRepository mesaRepository;

    public MesaService(IMesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    @Override
    public Mesa save(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public Mesa findById(Long id) {
        return mesaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mesa no encontrada"));
    }

    @Override
    public List<Mesa> findAll() {
        return mesaRepository.findAll();
    }

    @Override
    public Mesa update(Long id, Mesa mesa) {
        if (!mesaRepository.existsById(id)) {
            throw new RuntimeException("Mesa no encontrada");
        }
        mesa.setId(id);
        return mesaRepository.save(mesa);
    }

    @Override
    public void delete(Long id) {
        mesaRepository.deleteById(id);
    }
}