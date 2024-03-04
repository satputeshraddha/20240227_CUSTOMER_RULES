package org.dnyanyog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class CustomerRulesMain 
{
	public static void main(String args[])
	{
		SpringApplication.run(CustomerRulesMain.class, args);
		
	}
}
