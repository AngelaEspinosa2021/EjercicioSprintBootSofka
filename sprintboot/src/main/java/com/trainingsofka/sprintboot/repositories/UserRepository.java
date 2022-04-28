package com.trainingsofka.sprintboot.repositories;


import com.trainingsofka.sprintboot.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer>{
    public abstract ArrayList<UserModel> findByPrioridad(Integer prioridad);
}
