package com.oliveiralia.mypeopleapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveiralia.mypeopleapp.dtos.PersonDto;
import com.oliveiralia.mypeopleapp.services.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PersonDto> findById(@PathVariable Long id){
		PersonDto dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}

}
