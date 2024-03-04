package org.dnyanyog.service;

import java.util.List;

import org.dnyanyog.dto.CustomerRequest;
import org.dnyanyog.dto.CustomerResponse;
import org.dnyanyog.entity.Discount;
import org.dnyanyog.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService
{
	 public CustomerResponse calculateDiscount(CustomerRequest request) {
	        int discount ;

	        if (request.getAge() < 30) {
	            discount = 10; 
	        } else if (request.getAge() < 60) 
	        {
	            discount = 5;
	        } else {
	            discount = 15; 
	        }

	        if ("female".equalsIgnoreCase(request.getGender())) {
	            discount += 5; 
	            }

	       CustomerResponse response = new CustomerResponse();
	        response.setDiscount(discount);
	          return response;

	       
	    }

	
}



