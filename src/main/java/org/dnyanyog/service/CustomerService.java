package org.dnyanyog.service;

import org.dnyanyog.dto.CustomerRequest;
import org.dnyanyog.dto.CustomerResponse;
import org.springframework.web.bind.annotation.RequestParam;

public interface CustomerService 
{
	 public CustomerResponse calculateDiscount(CustomerRequest request);

}
