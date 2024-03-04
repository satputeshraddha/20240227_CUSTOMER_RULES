package org.dnyanyog.controller;

import org.dnyanyog.dto.CustomerRequest;
import org.dnyanyog.dto.CustomerResponse;
import org.dnyanyog.service.CustomerService;
import org.dnyanyog.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class CustomerController 
{
	    @Autowired
	    private CustomerServiceImpl customerServiceImpl;
	   
	    
	    	@PostMapping(path = "/api/v1/discount/getDiscount")
	    	public CustomerResponse calculateDiscount(@Valid @RequestBody CustomerRequest request) {
	    		return customerServiceImpl.calculateDiscount(request);
	    	}
	    	 
	}



