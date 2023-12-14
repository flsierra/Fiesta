package com.makaia.back4.JpaMySql.services;

import com.makaia.back4.JpaMySql.dtos.UsersDTO;
import com.makaia.back4.JpaMySql.entities.Usuario;
import com.makaia.back4.JpaMySql.exceptions.RedSocialApiException;
import com.makaia.back4.JpaMySql.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   UsuarioRepository repository;

   @Autowired
   public UserService(UsuarioRepository repository) {
        this.repository = repository;
    }
    @Autowired
    PasswordEncoder passwordEncoder;
    public Usuario crearUsuario(UsersDTO dto){
        Usuario exists = this.repository.findByUsername(dto.getUsername());
        if (exists != null) {
            throw new RedSocialApiException("User aleady exists", HttpStatusCode.valueOf(400));
        }
        Usuario nuevoUsuario = new Usuario(dto.getUsername(), passwordEncoder.encode(dto.getPassword()));
        nuevoUsuario = this.repository.save(nuevoUsuario);
        System.out.println(nuevoUsuario);

        return nuevoUsuario;
    }
}
