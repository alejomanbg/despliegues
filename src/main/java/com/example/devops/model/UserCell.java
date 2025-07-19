package com.example.devops.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devops_celulas")
public class UserCell {

    @Id
    @Column(name = "numero_cedula")
    private Long numeroCedula;

    @Column(name = "id_requerimiento")
    private Long idRequerimiento;

    // getters y setters
    public Long getNumeroCedula() { return numeroCedula; }
    public void setNumeroCedula(Long numeroCedula) { this.numeroCedula = numeroCedula; }
    public Long getIdRequerimiento() { return idRequerimiento; }
    public void setIdRequerimiento(Long idRequerimiento) { this.idRequerimiento = idRequerimiento; }
}
