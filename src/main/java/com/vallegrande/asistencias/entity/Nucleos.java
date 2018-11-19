package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "NUCLEOS")
public class Nucleos implements Serializable {

    @Id
    @Column(name = "CODNUC")
    private BigInteger codnuc;

    @Size(max = 250)
    @Column(name = "NOMNUC")
    private String nomnuc;

    @Size(max = 4)
    @Column(name = "CODNT")
    private String codnt;

    @Size(max = 1)
    @Column(name = "CODALT")
    private String codalt;

    @Size(max = 1)
    @Column(name = "ESTNUC")
    private String estnuc;

    @ManyToOne
    @JoinColumn(name = "COD_CAR", referencedColumnName = "COD_CAR")
    private Carrera carrera;

}
