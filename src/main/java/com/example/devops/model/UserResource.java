package com.example.devops.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devops_recursos")
public class UserResource {

    @Id
    @Column(name = "numero_cedula")
    private Long numeroCedula;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "rol", length = 50)
    private String rol;

    // getters y setters
    public Long getNumeroCedula() { return numeroCedula; }
    public void setNumeroCedula(Long numeroCedula) { this.numeroCedula = numeroCedula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
