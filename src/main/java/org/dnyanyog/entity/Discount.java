package org.dnyanyog.entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table
@Component
public class Discount 
{
		@Id
	    private Long id;
	private int age;
	private String gender;
	
	public static Discount getInstance() {
		return new Discount();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public int getAge() {
		return age;
	}
	public Discount setAge(int age) {
		this.age = age;
		return this;
	}
	public String getGender() {
		return gender;
	}
	public Discount setGender(String gender) {
		this.gender = gender;
		return this;
	}
}
