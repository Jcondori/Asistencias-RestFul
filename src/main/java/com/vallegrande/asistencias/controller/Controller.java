package com.vallegrande.asistencias.controller;

import com.google.gson.JsonObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/demo", produces = MediaType.APPLICATION_JSON_VALUE)
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

    //Recibir patametros por metodo GET
    @GetMapping("/param")
    public String getUrlParam(@RequestParam(name = "parametro") String parametro) {
        JsonObject objeto = new JsonObject();
        objeto.addProperty("parametro", parametro);
        return objeto.toString();
    }

    //Recibir patametros por el Header
    @GetMapping("/header")
    public String getHeaders(@RequestHeader("Demo") String demo) {
        JsonObject objeto = new JsonObject();
        objeto.addProperty("Demo", demo);
        return objeto.toString();
    }

}
