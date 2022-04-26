package com.springrest.springrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.springrest.springrest.entitiy.Courses;

@Repository
public interface UserRepository extends CrudRepository<Courses, Integer> {

}
