package com.trainingsofka.sprintboot.controllers;

import com.trainingsofka.sprintboot.models.UserModel;
import com.trainingsofka.sprintboot.models.UserRolModel;
import com.trainingsofka.sprintboot.services.UserRolService;
import com.trainingsofka.sprintboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("usuariorol")
public class UserRolController {

    @Autowired
    UserRolService userRolService;

    @GetMapping()
    public ArrayList<UserRolModel> obtenerListaRoles(){
        return userRolService.obtenerListaRoles();
    }

    @PostMapping()
    public UserRolModel guardarRol(@RequestBody UserRolModel rol) {
        return this.userRolService.guardarRol(rol);
    }

    @GetMapping(path = "/{id_rol}")
    public Optional<UserRolModel> obtenerListaRolesPorIdUsuario(@PathVariable("id_rol") Integer id) {
        return this.userRolService.obtenerPorIdUsuario(id);
    }

    @GetMapping(path = "/{id_rol}")
    public Optional<UserRolModel> obtenerPorIdRol(@PathVariable("id_rol") Integer id) {
        return this.userRolService.obtenerPorIdRol(id);
    }

    @PutMapping("/{id_rol}")
    public void editarRol(@RequestBody UserRolModel rol, @PathVariable("id_rol") Integer id_rol)
    {
        userRolService.eliminarRol(id_rol);
        userRolService.guardarRol(rol);

    }

    @GetMapping(path = "/{id_rol}")
    public boolean eliminarRol(Integer id_rol) {
        try{
            userRolService.eliminarRolesAsociadosalIdUsuario(id_rol);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    @GetMapping(path = "/{id_usuario}")
    public boolean eliminarRolesPorIdUsuario(Integer id_usuario) {
        try{
            userRolService.eliminarRolesAsociadosalIdUsuario(id_usuario);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
