package com.in28minutes.microservices.serviciousuarios2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name="usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true,length = 20)
    private String username;

    @Column(length = 60)
    private String password;

    private Boolean enable;

    private String nombre;

    private String ape1;

    @Column(unique = true,length = 100)
    private String email;

   // @ManyToMany(fetch = FetchType.LAZY)
    // La tabla intermedia se crea automaticamente (usuarios_roles) Nombres tablas + _
    // Las claves foráneas de la tabla intermedia
    // usuario_id (Nombre clase dominante + _id)
    // roles_id (Nombre del atributo en la clase dominante -no nombre Clase Role- + _id)
    // Para modificar lo que se crea por defecto se usa @JoinTable
    // uniqueConstraints  para hacer una clave unica compuesta (No se puede repetir usuario y role
    /*@JoinTable(
            name="usuarios_to_roles",
            joinColumns = @JoinColumn (name="usuario_id"), inverseJoinColumns = @JoinColumn(name="role_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id","role_id"})}
    )
    private List<Role> roles;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /* public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }*/
}
