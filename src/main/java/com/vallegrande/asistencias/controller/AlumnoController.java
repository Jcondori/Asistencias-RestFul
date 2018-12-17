package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.Encriptacion;
import com.vallegrande.asistencias.entity.Alumno;
import com.vallegrande.asistencias.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/alumno", produces = MediaType.APPLICATION_JSON_VALUE)
public class AlumnoController {

    @Autowired
    @Qualifier("alumnoService")
    private AlumnoService service;

    @GetMapping
    public List<Alumno> findAll() {
        return service.findAll();
    }

    @GetMapping("/login")
    public boolean loginAlumno(@RequestHeader("Usuario") String codAlum,
                               @RequestHeader("Password") String pwdAlum) {
        return service.login(codAlum, Encriptacion.encriptar(pwdAlum));
    }

}
