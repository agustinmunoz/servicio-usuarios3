package com.in28minutes.microservices.serviciousuarios2.controller;

import com.in28minutes.microservices.serviciousuarios2.entity.Usuario;
import com.in28minutes.microservices.serviciousuarios2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UsuarioController {

    @Autowired
    UsuarioRepository repo;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuario(){

        return repo.findAll();
    }
}
