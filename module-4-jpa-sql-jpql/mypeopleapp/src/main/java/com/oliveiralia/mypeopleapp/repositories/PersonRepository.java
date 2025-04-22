package com.oliveiralia.mypeopleapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.mypeopleapp.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
