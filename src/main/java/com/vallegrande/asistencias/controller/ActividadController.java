package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.entity.Actividades;
import com.vallegrande.asistencias.service.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/actividad")
public class ActividadController {

    @Autowired
    @Qualifier("actividadService")
    private ActividadService service;

    @GetMapping
//    @RequestMapping()
    public List<Actividades> findAll() {
        return service.findAll();
    }

}
