package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.entity.Alumno;
import com.vallegrande.asistencias.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/alumno")
public class AlumnoController {

    @Autowired
    @Qualifier("alumnoService")
    private AlumnoService service;

    @GetMapping
    public List<Alumno> findAll(){
        return service.findAll();
    }



}
