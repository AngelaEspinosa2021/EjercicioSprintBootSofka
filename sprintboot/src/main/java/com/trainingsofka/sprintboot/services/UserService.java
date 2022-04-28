package com.trainingsofka.sprintboot.services;

import com.trainingsofka.sprintboot.models.UserModel;
import com.trainingsofka.sprintboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtenerUsuarios(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel guardarUsuario(UserModel usuario){
        return userRepository.save(usuario);
    }

    public Optional<UserModel> obtenerPorIdUsuario(Integer id_usuario){
        return userRepository.findById(id_usuario);
    }

    public ArrayList<UserModel>  obtenerPorPrioridad(Integer prioridad) {
        return userRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Integer id_usuario) {
        try{
            userRepository.deleteById(id_usuario);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
