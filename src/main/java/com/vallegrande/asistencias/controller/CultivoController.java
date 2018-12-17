package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.entity.Cultivos;
import com.vallegrande.asistencias.service.CultivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/cultivo")
public class CultivoController {

    @Autowired
    @Qualifier("cultivoService")
    private CultivoService service;

    @GetMapping
    public List<Cultivos> findAall() {
        return service.findAll();
    }

}
