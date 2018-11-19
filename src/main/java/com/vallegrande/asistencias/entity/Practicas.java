package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "PRACTICAS")
public class Practicas implements Serializable {

    @Id
    @Column(name = "COD_PRAC")
    private BigInteger codPrac;

    @Column(name = "FCH_INI_PRAC")
    @Temporal(TemporalType.DATE)
    private Date fchIniPrac;

    @Column(name = "FCH_FIN_PRAC")
    @Temporal(TemporalType.DATE)
    private Date fchFinPrac;

    @Column(name = "FCH_SYSTEM")
    @Temporal(TemporalType.DATE)
    private Date fchSystem;

    @Size(max = 1)
    @Column(name = "EST_PRAC")
    private String estPrac;

}
