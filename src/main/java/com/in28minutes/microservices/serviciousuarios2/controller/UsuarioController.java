package com.in28minutes.microservices.serviciousuarios2.controller;

import com.in28minutes.microservices.serviciousuarios2.entity.Usuario;
import com.in28minutes.microservices.serviciousuarios2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin(allowCredentials="true")
@RestController

public class UsuarioController {

    @Autowired
    UsuarioRepository repo;

    @GetMapping("/usuarios")
    public List<Usuario> getAll(){

        return repo.findAll();
    }


    @GetMapping("/username/{username}")
    public Usuario getUsuario(@PathVariable("username") String username){

        return repo.findByUsername(username);
    }
}
