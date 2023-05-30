package com.isil.parcial.repository;

import org.springframework.data.repository.CrudRepository;

import com.isil.parcial.model.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long> {
    
}
