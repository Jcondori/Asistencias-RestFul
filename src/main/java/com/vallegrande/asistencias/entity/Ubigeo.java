package com.vallegrande.asistencias.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "UBIGEO")
public class Ubigeo implements Serializable {

    @Id
    @Size(min = 1, max = 6)
    @Column(name = "CODUBI")
    private String codubi;

    @Size(max = 50)
    @Column(name = "DEPUBI")
    private String depubi;

    @Size(max = 50)
    @Column(name = "PROUBI")
    private String proubi;

    @Size(max = 50)
    @Column(name = "DISUBI")
    private String disubi;

}
