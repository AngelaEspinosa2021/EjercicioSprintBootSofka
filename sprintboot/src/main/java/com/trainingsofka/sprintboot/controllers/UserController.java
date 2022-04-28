package com.trainingsofka.sprintboot.controllers;

import com.trainingsofka.sprintboot.models.UserModel;
import com.trainingsofka.sprintboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("usuario")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> obtenerUsuarios(){
        return userService.obtenerUsuarios();
    }

    @PostMapping()
    public UserModel guardarUsuario(@RequestBody UserModel usuario) {
        return this.userService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id_usuario}")
    public Optional<UserModel> obtenerUsuarioPorId(@PathVariable("id_usuario") Integer id) {
        return this.userService.obtenerPorIdUsuario(id);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.userService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping(path = "/{id_usuario}")
    public String eliminarPorId(@PathVariable("id_usuario") Integer id) {
        boolean ok = this.userService.eliminarUsuario(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id" + id;
        }
    }
}
