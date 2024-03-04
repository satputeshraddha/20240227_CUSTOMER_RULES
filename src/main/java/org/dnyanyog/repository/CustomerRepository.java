package org.dnyanyog.repository;

import java.util.List;

import org.dnyanyog.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface CustomerRepository extends JpaRepository<Discount,Long>
{
	//List<Discount> calculateDiscount(int age,String Gender);
	//@Query("SELECT c.discount FROM Discount c WHERE c.age = ?1 AND c.gender = ?2")
    //List<Discount> calculateDiscount(int age, String gender);

}
