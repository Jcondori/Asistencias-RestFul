package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "RESPONSABLE")
public class Responsable implements Serializable {

    @Id
    @Column(name = "COD_RES")
    private BigInteger codRes;

    @Size(max = 8)
    @Column(name = "DNI_RES")
    private String dniRes;

    @Size(max = 150)
    @Column(name = "NOM_RES")
    private String nomRes;

    @Size(max = 250)
    @Column(name = "AREA_RES")
    private String areaRes;

    @Size(max = 20)
    @Column(name = "CEL_RES")
    private String celRes;

    @Size(max = 7)
    @Column(name = "TEL_RES")
    private String telRes;

    @Size(max = 50)
    @Column(name = "EMAIL_RES")
    private String emailRes;

    @Size(max = 80)
    @Column(name = "DIR_RES")
    private String dirRes;

    @Size(max = 1)
    @Column(name = "EST_RES")
    private String estRes;

    @Size(max = 250)
    @Column(name = "CAR_RES")
    private String carRes;

    @ManyToOne
    @JoinColumn(name = "COD_EMP", referencedColumnName = "COD_EMP")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "UBIGEO_RES", referencedColumnName = "CODUBI")
    private Ubigeo ubigeo;

}
