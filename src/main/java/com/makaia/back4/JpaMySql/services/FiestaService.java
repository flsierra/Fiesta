package com.makaia.back4.JpaMySql.services;

import com.makaia.back4.JpaMySql.dtos.CrearPublicacionDTO;
import com.makaia.back4.JpaMySql.dtos.CrearUsuarioDTO;
import com.makaia.back4.JpaMySql.entities.Publicacion;
import com.makaia.back4.JpaMySql.entities.Usuario;
import com.makaia.back4.JpaMySql.exceptions.RedSocialApiException;
import com.makaia.back4.JpaMySql.publisher.Publisher;
import com.makaia.back4.JpaMySql.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class FiestaService {
    UsuarioRepository repository;

    Publisher publisher;

    @Autowired
    public FiestaService(UsuarioRepository repository, Publisher publisher) {
        this.repository = repository;
        this.publisher = publisher;
    }

    public String iniciarFiesta(){
        System.out.println("Fiesta iniciada");
        this.publisher.send("Fiesta iniciada");
        return "ok";
    }

}
