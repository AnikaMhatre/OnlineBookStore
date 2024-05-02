package com.example.demo.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
   private	CustomerRepository customerrepository ;

	

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepository.save(customer);
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		Customer customer1 = getCustomerById(id);
		
		customer1.setCustomer_name(customer.getCustomer_name());
		customer1.setCustomer_address(customer.getCustomer_address());
		customer1.setCustomer_contact(customer.getCustomer_contact());
		customer1.setEmail(customer.getEmail());
		
		return customerrepository.save(customer1);	}

	@Override
	public List<Customer> deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer1 = getCustomerById(id);
		customerrepository.deleteById(customer1.getCust_id());
		
		return customerrepository.findAll();	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerrepository.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerrepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("customer","customerId",id));
	}

	@Override
	public Customer loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("customer login service check");
		return customerrepository.findByEmailAndPassword(customer.getEmail(), customer.getPassword());
	}

	@Override
	public String getHashedPasswordByEmail(String cEmail) {
		// TODO Auto-generated method stub
		return customerrepository.getHashedPassword(cEmail);
	}

	@Override
	public Customer findByEmail(String email) {
		// TODO Auto-generated method stub
		return customerrepository.findByEmail(email);
	}

	
}
