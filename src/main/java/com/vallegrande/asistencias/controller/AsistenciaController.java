package com.vallegrande.asistencias.controller;

import com.vallegrande.asistencias.entity.Asistencia;
import com.vallegrande.asistencias.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/asistencia", produces = MediaType.APPLICATION_JSON_VALUE)
public class AsistenciaController {

    @Autowired
    @Qualifier("asistenciaService")
    private AsistenciaService service;

    @GetMapping("/{codAltDet}")
    public List<Asistencia> listarAlternancia(@PathVariable("codAltDet") BigInteger codAltDet) {
        return service.listarAlternancia(codAltDet);
    }

}
