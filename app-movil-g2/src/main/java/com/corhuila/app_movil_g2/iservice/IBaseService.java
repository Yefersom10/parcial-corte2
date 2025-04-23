package com.corhuila.app_movil_g2.iservice;

import java.util.List;

public interface IBaseService<T> {
    T save(T entity);
    T findById(Long id);
    List<T> findAll();
    T update(Long id, T entity);
    void delete(Long id);
}