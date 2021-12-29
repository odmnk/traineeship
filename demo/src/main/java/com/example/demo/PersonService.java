package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private IPersonRepository repository;
	
	public Optional<Person> vindEentje(int id) {
		return repository.findById(id);
		
	}
	
	public List<Person> vindAllePersonen() {
		List<Person> persons = repository.findAll();

		return persons;
	}
	
	public Person maakPersoonAan(Person person) {
		return repository.save(person);
	}
}
