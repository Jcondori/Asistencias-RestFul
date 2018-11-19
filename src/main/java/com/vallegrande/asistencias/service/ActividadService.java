package com.vallegrande.asistencias.service;

import com.vallegrande.asistencias.entity.Actividades;
import com.vallegrande.asistencias.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("actividadService")
public class ActividadService {

    @Autowired
    @Qualifier("actividadRepository")
    private ActividadRepository repository;

    public List<Actividades> findAll(){
        return repository.findAll();
    }

}
