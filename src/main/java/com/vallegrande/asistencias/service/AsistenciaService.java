package com.vallegrande.asistencias.service;

import com.vallegrande.asistencias.entity.Asistencia;
import com.vallegrande.asistencias.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service("asistenciaService")
public class AsistenciaService {

    @Autowired
    @Qualifier("asistenciaRepository")
    private AsistenciaRepository repository;

    public List<Asistencia> listarAlternancia(BigInteger codAltDet){
        return repository.findByAlternanciaDetalle_Codaltdet(codAltDet);
    }

}
