package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "PRACTICAS")
public class Practicas implements Serializable {

    @Id
    @Column(name = "COD_PRAC")
    private BigInteger codPrac;

    @Column(name = "FCH_INI_PRAC")
    private LocalDate fchIniPrac;

    @Column(name = "FCH_FIN_PRAC")
    private LocalDate fchFinPrac;

    @Column(name = "FCH_SYSTEM")
    private LocalDate fchSystem;

    @Size(max = 1)
    @Column(name = "EST_PRAC")
    private String estPrac;

}
