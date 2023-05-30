package com.isil.parcial.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Date fechaReserva;
    
    private String libro;
    private String nombres_apellidos;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Reserva() {
    }



    public Reserva(Integer id, Date fechaReserva, String libro, String nombres_apellidos, Usuario usuario) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.libro = libro;
        this.nombres_apellidos = nombres_apellidos;
        this.usuario = usuario;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getNombres_apellidos() {
        return nombres_apellidos;
    }

    public void setNombres_apellidos(String nombres_apellidos) {
        this.nombres_apellidos = nombres_apellidos;
    }



    public Usuario getUsuario() {
        return usuario;
    }



    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
}