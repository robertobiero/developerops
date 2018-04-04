package com.rob.devoloperops.backend.persistence.repositories;

import com.rob.devoloperops.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {



              public User findByUsername(String username);


        }