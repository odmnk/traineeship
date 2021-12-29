package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
public class PersonController {
	
	@Autowired
	private PersonService service;

	@RequestMapping(value = "/personen")
	public List<Person> vind() {
		return service.vindAllePersonen();
	}

	@RequestMapping("/persoon/{mijnid}")
	public Optional<Person> vindEentje(@PathVariable int mijnid) {
		return service.vindEentje(mijnid);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "maakpersoonaan")
	public Person maakPersoonAan(@RequestBody Person persoon) {
		return service.maakPersoonAan(persoon);
		
	}
}