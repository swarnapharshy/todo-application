package com.application.todoapplication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

    /*User findAll(String username);*/

    /*Iterable<User> findUsers();*/

    @Override
    Iterable<User> findAllById(Iterable<String> iterable);

    @Override
    Optional<User> findById(String s);
}
