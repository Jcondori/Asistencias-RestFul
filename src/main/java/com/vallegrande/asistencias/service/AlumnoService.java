package com.vallegrande.asistencias.service;

import com.vallegrande.asistencias.entity.Alumno;
import com.vallegrande.asistencias.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("alumnoService")
public class AlumnoService {

    @Autowired
    @Qualifier("alumnoRepository")
    private AlumnoRepository repository;

    public List<Alumno> findAll(){
        return repository.findAll();
    }

}
