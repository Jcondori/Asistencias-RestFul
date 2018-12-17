package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.entity.AlternanciaDetalle;
import com.vallegrande.asistencias.service.AlternanciaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("v1/alternancia/detalle")
public class AlternanciaDetalleController {

    @Autowired
    @Qualifier("alternanciaDetalleService")
    private AlternanciaDetalleService service;

    @GetMapping
    public List<AlternanciaDetalle> findAll() {
        return service.findAll();
    }

    @GetMapping("/{codAlum}/{estAlt}")
    public List<AlternanciaDetalle> findByAlumno(@PathVariable("codAlum") String codAlum,
                                                 @PathVariable("estAlt") String estAlt) {
        return service.findbyAlumno(codAlum, estAlt);
    }

    @GetMapping("/p")
    public List<AlternanciaDetalle> getPagina(Pageable pageable) {
        return service.obtenePaginado(pageable);
    }

}
