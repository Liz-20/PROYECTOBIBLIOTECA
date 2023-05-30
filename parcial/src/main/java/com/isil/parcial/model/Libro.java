package com.isil.parcial.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String titulo;
    private String autor;
    private String genero;

    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Catalogo catogoId;

    public Libro() {
    }

    public Libro(Integer id, String titulo, String autor, String genero, Catalogo catogoId) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.catogoId = catogoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Catalogo getCatogoId() {
        return catogoId;
    }

    public void setCatogoId(Catalogo catogoId) {
        this.catogoId = catogoId;
    }

    

}