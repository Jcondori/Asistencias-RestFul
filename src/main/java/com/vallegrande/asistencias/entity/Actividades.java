package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "ACTIVIDADES")
public class Actividades implements Serializable {

    @Id
    @Column(name = "CODACT")
    private BigInteger codact;

    @Size(max = 100)
    @Column(name = "NOMACT")
    private String nomact;

    @Column(name = "ESTACT")
    private Character estact;

    @ManyToOne
    @JoinColumn(name = "COD_CAR", referencedColumnName = "COD_CAR")
    private Carrera carrera;

}
