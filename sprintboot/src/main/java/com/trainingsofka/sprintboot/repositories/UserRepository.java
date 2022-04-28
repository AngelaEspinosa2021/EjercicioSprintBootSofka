package com.trainingsofka.sprintboot.repositories;


import com.trainingsofka.sprintboot.models.UserModel;
import com.trainingsofka.sprintboot.models.UserRolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer>{
    public abstract ArrayList<UserModel> findByPrioridad(Integer prioridad);

}
