package com.vallegrande.asistencias.repository;

import com.vallegrande.asistencias.entity.Cultivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("cultivoRepository")
public interface CultivoRepository extends JpaRepository<Cultivos, Serializable> {
}
