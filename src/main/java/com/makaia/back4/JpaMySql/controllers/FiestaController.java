package com.makaia.back4.JpaMySql.controllers;

import com.makaia.back4.JpaMySql.services.FiestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fiesta")
public class FiestaController {
    private FiestaService service;

    @Autowired
    public FiestaController(FiestaService service) {
        this.service = service;
    }

    @GetMapping("/iniciarFiesta")
    public String crearUsuario() {
        return "Prueba";
    }
}
