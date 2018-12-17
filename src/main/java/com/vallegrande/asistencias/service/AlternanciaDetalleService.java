package com.vallegrande.asistencias.service;

import com.vallegrande.asistencias.entity.AlternanciaDetalle;
import com.vallegrande.asistencias.repository.AlternanciaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
@Service("alternanciaDetalleService")
public class AlternanciaDetalleService {

    @Autowired
    @Qualifier("alternanciaDetalleRepository")
    private AlternanciaDetalleRepository repository;

    public List<AlternanciaDetalle> findAll() {
        return repository.findAll();
    }

    public AlternanciaDetalle findbyAlternanciaAlumno(String codAlum) {
        List<AlternanciaDetalle> lista = repository.findByAlumno_CodAlumAndAlternancia_EstaltOrderByCodaltdetDesc(codAlum, "A");
        if (lista.size() > 0) {
            return lista.get(0);
        }
        return null;
    }

    public List<AlternanciaDetalle> obtenePaginado(Pageable pageable) {
        return repository.findAll(pageable).getContent();
    }

}
