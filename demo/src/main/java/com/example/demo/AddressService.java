package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	@Autowired
	private IAddressRepository repository;
	
	public List<Address> vindAlleAddressen() {
		List<Address> addresses = repository.findAll();

		return addresses;
	}

	public Address maakAdresAan(Address address) {
		return repository.save(address);
	}
}
