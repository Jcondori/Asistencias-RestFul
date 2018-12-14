package com.vallegrande.asistencias.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity
@Table(name = "ASISTENCIA")
public class Asistencia implements Serializable {

    @Id
    @Column(name = "COD_AS")
    private BigInteger codAs;

    @Column(name = "FCH_DIA")
    private LocalDate fchDia;

    @Column(name = "HORA_ENT1")
    private LocalTime horaEnt1;

    @JsonIgnore
    @Column(name = "HORA_ENT2")
    private LocalTime horaEnt2;

    @Column(name = "HORA_SAL1")
    private LocalTime horaSal1;

    @JsonIgnore
    @Column(name = "HORA_SAL2")
    private LocalTime horaSal2;

    @Size(max = 1)
    @Column(name = "DENDIA")
    private String dendia;

    @Size(max = 50)
    @Column(name = "JUSTIFICACION")
    private String justificacion;

    @ManyToOne
    @JoinColumn(name = "CODACT", referencedColumnName = "CODACT")
    private Actividades actividades;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CODALTDET", referencedColumnName = "CODALTDET")
    private AlternanciaDetalle alternanciaDetalle;

    @ManyToOne
    @JoinColumn(name = "CODCUL", referencedColumnName = "CODCUL")
    private Cultivos cultivos;

}
