package com.makaia.back4.JpaMySql.security;

import com.makaia.back4.JpaMySql.entities.Usuario;
import com.makaia.back4.JpaMySql.exceptions.RedSocialApiException;
import com.makaia.back4.JpaMySql.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomDetailService implements UserDetailsService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       Usuario user = this.usuarioRepository.findByUsername(username);

        if(user== null){
        throw new UsernameNotFoundException("Usuario no encontrado, paila"+username);
        }
        UserDetails userPrueba = User.withUsername(user.getUsername())
                .password((user.getPassword()))
                .build();
        return userPrueba;
    }
}
