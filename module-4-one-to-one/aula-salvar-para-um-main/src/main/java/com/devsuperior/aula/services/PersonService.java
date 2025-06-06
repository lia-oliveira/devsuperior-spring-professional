package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDepartmentDto;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public PersonDepartmentDto insert(PersonDepartmentDto dto) {		
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());
		//Department dept = new Department();
		//dept.setId(dto.getDepartment().getId());
		
		entity.setDepartment(dept);
		
		entity = repository.save(entity);
		
		return new PersonDepartmentDto(entity);		
	}

}
