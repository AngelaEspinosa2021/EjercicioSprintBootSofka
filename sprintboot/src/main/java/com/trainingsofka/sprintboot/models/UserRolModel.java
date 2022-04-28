package com.trainingsofka.sprintboot.models;

import javax.persistence.*;



@Entity
@Table(name = "usuariorol")
public class UserRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id_rol;
    private String rol;
    private Integer id_usuario;

    public UserRolModel(String rol,Integer id_usuario){
        this.rol = rol;
        this.id_usuario = id_usuario;
    }

    public UserRolModel(){

    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public void setRol(String rol){
        this.rol = rol;
    }
    public String getRol() {
        return rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }



}
