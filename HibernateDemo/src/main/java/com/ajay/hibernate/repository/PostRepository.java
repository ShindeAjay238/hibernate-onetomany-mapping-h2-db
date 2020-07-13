package com.ajay.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ajay.hibernate.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

}
