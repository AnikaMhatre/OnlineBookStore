package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	public Customer findByEmailAndPassword(String email,String password);
	
	@Query(value="select password from customer where email=?1",nativeQuery=true)
	public String getHashedPassword(String email);
	
	public Customer findByEmail(String email);
	
}
