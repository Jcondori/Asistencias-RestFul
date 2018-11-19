package com.vallegrande.asistencias.controller;

import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class Controller {

    //Recibir patametros por URL
    @GetMapping("/parametro/{p1}/{p2}")
    public String getpamametro(@PathVariable("p1") String p1,
                               @PathVariable("p2") String p2) {
        JsonObject objeto = new JsonObject();
        objeto.addProperty("Parametro1", p1);
        objeto.addProperty("Parametro2", p2);
        return objeto.toString();
    }



}
