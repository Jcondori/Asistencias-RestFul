package com.vallegrande.asistencias.repository;

import com.vallegrande.asistencias.entity.Actividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("actividadRepository")
public interface ActividadRepository extends JpaRepository<Actividades, Serializable> {
}
