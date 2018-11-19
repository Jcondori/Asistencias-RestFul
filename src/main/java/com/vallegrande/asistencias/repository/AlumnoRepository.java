package com.vallegrande.asistencias.repository;

import com.vallegrande.asistencias.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("alumnoRepository")
public interface AlumnoRepository extends JpaRepository<Alumno, Serializable> {

    public abstract List<Alumno> findByCodAlumAndPwdAlum(String codAlum,String pwdAlum);

}
