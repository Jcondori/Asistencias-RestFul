package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "CARRERA")
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(generator="CarreraSeq")
    @SequenceGenerator(name="CarreraSeq",sequenceName="CARRERA_SEQ", allocationSize=1)
    @Column(name = "COD_CAR")
    private BigInteger codCar;
    @Size(max = 2)
    @Column(name = "ABRCAR")
    private String abrcar;
    @Size(max = 100)
    @Column(name = "NAME_CAR")
    private String nameCar;
    @Size(max = 2)
    @Column(name = "ABRMOD")
    private String abrmod;
    @Size(max = 250)
    @Column(name = "MOD_CAR")
    private String modCar;
    @Size(max = 4)
    @Column(name = "YEAR_CAR")
    private String yearCar;
    @Size(max = 1)
    @Column(name = "EST_CAR")
    private String estCar;
    @Size(max = 5)
    @Column(name = "ESTCUL")
    private String estcul;
    @Column(name = "HORMOD")
    private BigInteger hormod;

}
