package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class CustomerResponse
{
	
	private int discount;
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
