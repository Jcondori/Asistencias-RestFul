package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.entity.Carrera;
import com.vallegrande.asistencias.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/carrera")
public class CarreraController {

    @Autowired
    @Qualifier("carreraService")
    private CarreraService service;

    @GetMapping
    public List<Carrera> finAll(){
        return service.findAll();
    }

    @PutMapping
    public boolean create(@RequestBody @Valid Carrera carrera){
        return service.create(carrera);
    }

}
