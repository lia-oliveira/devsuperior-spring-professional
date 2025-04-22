package com.oliveiralia.mypeopleapp.dtos;

import com.oliveiralia.mypeopleapp.entities.Person;

public class PersonDto {
	
	private Long id;
	
	private String name;
	
	private Double salary;
	
	public PersonDto() {
	}
	
	public PersonDto(Person entity) {
		id = entity.getId();
		name = entity.getName();
		salary = entity.getSalary();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

}
