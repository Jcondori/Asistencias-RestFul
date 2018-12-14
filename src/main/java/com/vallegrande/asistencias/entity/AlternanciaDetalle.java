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
@Table(name = "ALTERNANCIA_DETALLE")
public class AlternanciaDetalle implements Serializable {

    @Id
    @Column(name = "CODALTDET")
    private BigInteger codaltdet;

    @Size(max = 250)
    @Column(name = "COMALTDET")
    private String comaltdet;

    @Size(max = 1)
    @Column(name = "ESTALTDET")
    private String estaltdet;

    @Column(name = "FECMONITOREO")
    private LocalDate fecmonitoreo;

    @Size(max = 300)
    @Column(name = "OBSMONITOREO")
    private String obsmonitoreo;

    @ManyToOne
    @JoinColumn(name = "CODALT", referencedColumnName = "CODALT")
    private Alternancia alternancia;

    @ManyToOne
    @JoinColumn(name = "COD_ALUM", referencedColumnName = "COD_ALUM")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "CODMON", referencedColumnName = "CODMON")
    private Monitor monitor;

    @ManyToOne
    @JoinColumn(name = "COD_RES", referencedColumnName = "COD_RES")
    private Responsable responsable;

}
