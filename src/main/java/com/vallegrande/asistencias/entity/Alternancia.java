package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "ALTERNANCIA")
public class Alternancia implements Serializable {

    @Id
    @Column(name = "CODALT")
    private BigInteger codalt;
    @Size(max = 1)
    @Column(name = "ESTALT")
    private String estalt;
    @ManyToOne
    @JoinColumn(name = "COD_AULA", referencedColumnName = "COD_AULA")
    private Aula aula;
    @ManyToOne
    @JoinColumn(name = "CODNUC", referencedColumnName = "CODNUC")
    private Nucleos nucleos;
    @ManyToOne
    @JoinColumn(name = "CODPRA1", referencedColumnName = "COD_PRAC")
    private Practicas semana1;
    @ManyToOne
    @JoinColumn(name = "CODPRA2", referencedColumnName = "COD_PRAC")
    private Practicas semana2;

}
