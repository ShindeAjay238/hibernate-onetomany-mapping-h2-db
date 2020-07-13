package com.ajay.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ajay.hibernate.model.Location;

@Repository
public interface LocationRepostitory extends CrudRepository<Location, Integer> {

}
