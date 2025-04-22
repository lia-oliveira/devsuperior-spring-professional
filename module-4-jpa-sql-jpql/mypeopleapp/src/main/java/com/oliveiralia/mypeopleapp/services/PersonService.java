package com.oliveiralia.mypeopleapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oliveiralia.mypeopleapp.dtos.PersonDto;
import com.oliveiralia.mypeopleapp.entities.Person;
import com.oliveiralia.mypeopleapp.repositories.PersonRepository;



@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	@Transactional(readOnly = true)
	public PersonDto findById(Long id) {
		Optional<Person> repo = repository.findById(id);
		Person person = repo.get();
		PersonDto dto = new PersonDto(person);
		return dto;
	}
	

}
