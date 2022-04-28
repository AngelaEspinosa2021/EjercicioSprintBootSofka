package com.trainingsofka.sprintboot.services;

import com.trainingsofka.sprintboot.models.UserModel;
import com.trainingsofka.sprintboot.models.UserRolModel;
import com.trainingsofka.sprintboot.repositories.UserRepository;
import com.trainingsofka.sprintboot.repositories.UserRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserRolService {
    @Autowired
    UserRolRepository userRolRepository;

    public ArrayList<UserRolModel> obtenerRoles(){
        return (ArrayList<UserRolModel>) userRolRepository.findAll();
    }

    public UserRolModel guardarRol(UserRolModel rol){
        return userRolRepository.save(rol);
    }

    public Optional<UserRolModel> obtenerPorIdRol(Integer id_rol){
        return userRolRepository.findById(id_rol);
    }

    public Optional<UserRolModel> obtenerPorIdUsuario(Integer id_usuario){
        return userRolRepository.findById(id_usuario);
    }

    public boolean eliminarRol(Integer id_rol) {
        try{
            userRolRepository.deleteById(id_rol);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public boolean eliminarRolesAsociadosalIdUsuario(Integer id_usuario) {
        try{
            userRolRepository.deleteById(id_usuario);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
