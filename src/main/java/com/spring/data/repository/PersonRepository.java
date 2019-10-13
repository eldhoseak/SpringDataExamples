package com.spring.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.data.model.Person;

import java.util.List;

public interface PersonRepository<P> extends CrudRepository<Person, Long> {
    List<Person> findByFirstName(String firstName);
}