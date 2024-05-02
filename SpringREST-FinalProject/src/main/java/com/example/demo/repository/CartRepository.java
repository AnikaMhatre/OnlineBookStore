package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

	//find in cart bu customer id
	public List<Cart> findByCustId(int custId);
		
	//delete cart of customer
	@Modifying
	@Query(value = "delete from cart_table where customer_id = ?1",nativeQuery = true)
	public void deleteCustomerCart(int custId);
}
