package com.in28minutes.microservices.serviciousuarios2.repository;

import com.in28minutes.microservices.serviciousuarios2.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


//Con esto no necesitamos service no controller. Se cran automaticamente
//@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

    //el path de los método añadidos es usuarios/search/[nombreMétodo] ó
    //se especifica mediante path
    //usuarios/search/[path] (usuarios/search/apellido?apellido1=usuario_agu

    public Usuario findByUsername(String username);


}
