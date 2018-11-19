package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "EMPRESA")
public class Empresa implements Serializable {

    @Id
    @Column(name = "COD_EMP")
    private BigInteger codEmp;

    @Size(max = 250)
    @Column(name = "NOM_EMP")
    private String nomEmp;

    @Size(max = 14)
    @Column(name = "DOC_EMP")
    private String docEmp;

    @Size(max = 1)
    @Column(name = "EST_EMP")
    private String estEmp;

}
