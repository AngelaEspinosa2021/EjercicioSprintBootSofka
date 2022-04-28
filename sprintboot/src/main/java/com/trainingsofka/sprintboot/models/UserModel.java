package com.trainingsofka.sprintboot.models;

import javax.persistence.*;



@Entity
@Table(name = "usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id_usuario;
    private String nombre;
    private String email;
    private Integer prioridad;

    public UserModel(String nombre, String email, Integer prioridad){
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }

    public UserModel(){

    }

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }
    public Integer getPrioridad() {
        return prioridad;
    }

    public int getId() {
        return id_usuario;
    }

    public void setId(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }








}
