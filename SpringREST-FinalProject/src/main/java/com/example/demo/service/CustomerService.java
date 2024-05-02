package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Publisher;

public interface CustomerService 
{
	public Customer saveCustomer(Customer customer);
	
	public String getHashedPasswordByEmail(String cEmail);
	
	public Customer loginCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	public Customer getCustomerById(int id);
	
	public Customer updateCustomer(int id,Customer customer);
	
	public List<Customer> deleteCustomerById(int id);
	
	public Customer findByEmail(String email);
	
	
}
