package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "CULTIVOS")
public class Cultivos implements Serializable {

    @Id
    @Column(name = "CODCUL")
    private BigInteger codcul;

    @Size(max = 50)
    @Column(name = "NOMCUL")
    private String nomcul;

    @Size(max = 1)
    @Column(name = "ESTCUL")
    private String estcul;

    @ManyToOne
    @JoinColumn(name = "COD_CAR", referencedColumnName = "COD_CAR")
    private Carrera carrera;

}
