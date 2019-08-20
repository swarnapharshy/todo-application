package com.application.todoapplication.repository;

import com.application.todoapplication.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User,String> {

    User findByUsername(String username);

}
