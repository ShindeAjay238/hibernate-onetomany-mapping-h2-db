package com.ajay.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ajay.hibernate.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
