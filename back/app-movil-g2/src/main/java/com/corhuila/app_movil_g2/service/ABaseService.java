package com.corhuila.app_movil_g2.service;

import com.corhuila.app_movil_g2.iservice.IBaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class ABaseService<T, R extends JpaRepository<T, Long>> implements IBaseService<T> {
    protected final R repository;

    public ABaseService(R repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T update(Long id, T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}