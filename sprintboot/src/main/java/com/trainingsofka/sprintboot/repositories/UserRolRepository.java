package com.trainingsofka.sprintboot.repositories;

import com.trainingsofka.sprintboot.models.UserRolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRolRepository  extends CrudRepository<UserRolModel, Integer>{
    public abstract ArrayList<UserRolModel> findById_usuario(Integer id_usuario);
}
