package com.corhuila.app_movil_g2.service;


import com.corhuila.app_movil_g2.entity.Reserva;
import com.corhuila.app_movil_g2.iservice.IReservaService;
import com.corhuila.app_movil_g2.repository.IClienteRepository;
import com.corhuila.app_movil_g2.repository.IMesaRepository;
import com.corhuila.app_movil_g2.repository.IReservaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservaService extends ABaseService<Reserva, IReservaRepository> implements IReservaService {

    private final IClienteRepository clienteRepository;
    private final IMesaRepository mesaRepository;

    public ReservaService(IReservaRepository repository, IClienteRepository clienteRepository, IMesaRepository mesaRepository) {
        super(repository);
        this.clienteRepository = clienteRepository;
        this.mesaRepository = mesaRepository;
    }

    @Override
    @Transactional
    public Reserva save(Reserva reserva) {
        // Asegurarse de que el cliente y la mesa existan antes de guardar la reserva
        clienteRepository.findById(reserva.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        mesaRepository.findById(reserva.getMesa().getId())
                .orElseThrow(() -> new RuntimeException("Mesa no encontrada"));

        return super.save(reserva);
    }

    @Override
    @Transactional
    public Reserva update(Long id, Reserva reserva) {
        // Asegurarse de que el cliente y la mesa existan antes de actualizar la reserva
        clienteRepository.findById(reserva.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        mesaRepository.findById(reserva.getMesa().getId())
                .orElseThrow(() -> new RuntimeException("Mesa no encontrada"));

        return super.update(id, reserva);
    }
}