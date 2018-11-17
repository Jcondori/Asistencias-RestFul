package com.vallegrande.asistencias.repository;

import com.vallegrande.asistencias.entity.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("CarreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Serializable> {

}
