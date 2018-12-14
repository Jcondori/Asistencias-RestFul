package com.vallegrande.asistencias.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "ALUMNO")
public class Alumno implements Serializable {

    @Id
    @Size(min = 1, max = 8)
    @Column(name = "COD_ALUM")
    private String codAlum;

    @Size(max = 50)
    @Column(name = "NOM_ALUM")
    private String nomAlum;

    @Size(max = 50)
    @Column(name = "APE_ALUM")
    private String apeAlum;

    @Size(max = 20)
    @Column(name = "INGR_ALUM")
    private String ingrAlum;

    @Column(name = "FCH_NAC_ALUM")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private LocalDate fchNacAlum;

    @Size(max = 50)
    @Column(name = "CORREO_ALUM")
    private String correoAlum;

    @Size(max = 9)
    @Column(name = "TELF1_ALUM")
    private String telf1Alum;

    @Size(max = 9)
    @Column(name = "TELF2_ALUM")
    private String telf2Alum;

    @Size(max = 250)
    @Column(name = "DIR_ORIG")
    private String dirOrig;

    @Size(max = 250)
    @Column(name = "REF_ORIG")
    private String refOrig;

    @Size(max = 250)
    @Column(name = "DIR_ALUM")
    private String dirAlum;

    @Size(max = 250)
    @Column(name = "REF_ALUM")
    private String refAlum;

    @Size(max = 50)
    @Column(name = "PWD_ALUM")
    private String pwdAlum;

    @Size(max = 5)
    @Column(name = "BLOALUM")
    private String bloalum;

}
