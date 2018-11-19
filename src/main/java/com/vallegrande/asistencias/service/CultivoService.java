package com.vallegrande.asistencias.service;

import com.vallegrande.asistencias.entity.Cultivos;
import com.vallegrande.asistencias.repository.CultivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cultivoService")
public class CultivoService {

    @Autowired
    @Qualifier("cultivoRepository")
    private CultivoRepository repository;

    public List<Cultivos> findAll(){
        return repository.findAll();
    }

}
