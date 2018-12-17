package com.vallegrande.asistencias.repository;

import com.vallegrande.asistencias.entity.AlternanciaDetalle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("alternanciaDetalleRepository")
public interface AlternanciaDetalleRepository extends JpaRepository<AlternanciaDetalle, Serializable>, PagingAndSortingRepository<AlternanciaDetalle, Serializable> {

//    public abstract List<AlternanciaDetalle> findByAlumno_CodAlumAndAlternancia_Estalt(String codAlum, String estAlt);

    public abstract Page<AlternanciaDetalle> findAll(Pageable pageable);

    public abstract List<AlternanciaDetalle> findByAlumno_CodAlumAndAlternancia_EstaltOrderByCodaltdetDesc(String codAlum, String estAlt);

}
