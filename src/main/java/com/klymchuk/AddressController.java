package com.klymchuk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@RequestMapping(value = "/address",
					method = RequestMethod.GET,
					produces = "application/json")
	
	public Address getAddress() {
		Address address = new Address();
		address.setStreet("FL");
		address.setState("154 FL");
		
		return address;
	}

}
