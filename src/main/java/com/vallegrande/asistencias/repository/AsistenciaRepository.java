package com.vallegrande.asistencias.repository;

import com.vallegrande.asistencias.entity.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Repository("asistenciaRepository")
public interface AsistenciaRepository extends JpaRepository<Asistencia, Serializable> {

    public abstract List<Asistencia> findByAlternanciaDetalle_Codaltdet(BigInteger codAltDet);

}
