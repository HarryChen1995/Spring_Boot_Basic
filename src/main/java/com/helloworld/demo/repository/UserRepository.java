package com.helloworld.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.helloworld.demo.model.Model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
    
}
