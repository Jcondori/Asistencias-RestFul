package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "MONITOR")
public class Monitor implements Serializable {

    @Id
    @Column(name = "CODMON")
    private BigInteger codmon;

    @Size(max = 50)
    @Column(name = "NOMMON")
    private String nommon;

    @Size(max = 50)
    @Column(name = "APEMON")
    private String apemon;

    @Size(max = 8)
    @Column(name = "DNIMON")
    private String dnimon;

    @Column(name = "NACMON")
    @Temporal(TemporalType.DATE)
    private Date nacmon;

    @Size(max = 50)
    @Column(name = "CORMON")
    private String cormon;

    @Size(max = 9)
    @Column(name = "CELMON")
    private String celmon;

    @Size(max = 200)
    @Column(name = "DIRMON")
    private String dirmon;

    @Size(max = 20)
    @Column(name = "ESTMON")
    private String estmon;

    @Size(max = 50)
    @Column(name = "PASMON")
    private String pasmon;

    @Column(name = "NIVMON")
    private BigInteger nivmon;

    @ManyToOne
    @JoinColumn(name = "COD_CAR", referencedColumnName = "COD_CAR")
    private Carrera carrera;

    @ManyToOne
    @JoinColumn(name = "CODUBI", referencedColumnName = "CODUBI")
    private Ubigeo ubigeo;

}
