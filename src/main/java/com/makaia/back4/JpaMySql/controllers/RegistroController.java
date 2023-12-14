package com.makaia.back4.JpaMySql.controllers;

import com.makaia.back4.JpaMySql.dtos.UsersDTO;
import com.makaia.back4.JpaMySql.entities.Usuario;
import com.makaia.back4.JpaMySql.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ap1/v1/registro")
public class RegistroController {
    private UserService userService;
@PostMapping
public Usuario crearUsuario(@RequestBody UsersDTO dto){
    return this.userService.crearUsuario(dto);
}

}
