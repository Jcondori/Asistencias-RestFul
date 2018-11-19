package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "AULA")
public class Aula implements Serializable {

    @Id
    @Column(name = "COD_AULA")
    private BigInteger codAula;

    @Size(max = 1)
    @Column(name = "SEC_AULA")
    private String secAula;

    @Size(max = 10)
    @Column(name = "SEM_AULA")
    private String semAula;

    @Size(max = 4)
    @Column(name = "YEAR_AULA")
    private String yearAula;

    @Size(max = 1)
    @Column(name = "EST_AULA")
    private String estAula;

    @Size(max = 4)
    @Column(name = "PRO_AULA")
    private String proAula;

    @Size(max = 6)
    @Column(name = "MES_AULA")
    private String mesAula;

    @ManyToOne
    @JoinColumn(name = "COD_CAR", referencedColumnName = "COD_CAR")
    private Carrera carrera;

}
