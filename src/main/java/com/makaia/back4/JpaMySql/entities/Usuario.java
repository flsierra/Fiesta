package com.makaia.back4.JpaMySql.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(length = 50)
    private String username;

    @Column(length = 50)
    private String password;

 

    public Usuario() {
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
