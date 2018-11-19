package com.vallegrande.asistencias.service;

import com.vallegrande.asistencias.entity.Carrera;
import com.vallegrande.asistencias.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carreraService")
public class CarreraService {

    @Autowired
    @Qualifier("carreraRepository")
    private CarreraRepository repository;

    public List<Carrera> findAll() {
        return repository.findAll();
    }

    public boolean create(Carrera carrera) {
        try {
            repository.save(carrera);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
