package com.isil.parcial.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;

    
    @ManyToOne
    @JoinColumn(name = "biblioteca_id")
    private Biblioteca biblioteca;

    public Catalogo() {
    }



    public Catalogo(Integer id, String nombre, Biblioteca biblioteca) {
        this.id = id;
        this.nombre = nombre;
        this.biblioteca = biblioteca;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Biblioteca getBiblioteca() {
        return biblioteca;
    }



    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    
}