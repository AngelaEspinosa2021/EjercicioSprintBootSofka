package com.trainingsofka.sprintboot.repositories;

import com.trainingsofka.sprintboot.models.UserRolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRolRepository  extends CrudRepository<UserRolModel, Integer>{
    public abstract Optional<UserRolModel> findById(Integer id_usuario);
}
