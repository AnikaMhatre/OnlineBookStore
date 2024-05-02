package com.example.demo.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Publisher;
import com.example.demo.service.CustomerService;
import com.google.gson.Gson;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/customer/")
public class CustomerController 
{

	@Autowired
	private CustomerService customerservice;
	
	@PostMapping
	public ResponseEntity<Customer> saveStudent(@RequestBody @Validated Customer customer)
	{
		return new ResponseEntity<Customer>(customerservice.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	//Login
	@PostMapping("loginCustomer")
	public ResponseEntity<Customer> loginCustomer(@RequestBody Customer customer) {
		//TODO: process POST request
		
		return new ResponseEntity<Customer>(customerservice.loginCustomer(customer),HttpStatus.OK);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return customerservice.getAllCustomers();
	}
	
	@GetMapping("{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId")int id)
	{
		return new ResponseEntity<Customer>(customerservice.getCustomerById(id),HttpStatus.OK);
	}
	
	@PutMapping("{customerId}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("customerId")int id,@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerservice.updateCustomer(id, customer),HttpStatus.OK);
	}
	
	@DeleteMapping("{customerId}")
	public List<Customer> getAllCustomers(@PathVariable ("customerId") int id)
	{
		return customerservice.deleteCustomerById(id);
	}
	
	//Get hashed password --not currently using...
	@GetMapping("getHashedPassword/{customerEmail}")
	public String getHashedPassword(@PathVariable ("customerEmail") String email)
	{
		return customerservice.getHashedPasswordByEmail(email);
	}
	
	//find customer by id
	
	@GetMapping("/getByEmail/{customerEmail}")
	public ResponseEntity<Customer> getCustomerByEmail(@PathVariable("customerEmail")String email)
	{
		return new ResponseEntity<Customer>(customerservice.findByEmail(email),HttpStatus.OK);
	}
	
	@GetMapping("createRazorpayOrder/{bPrice}")
	public ResponseEntity<String> createRazorpayOrder(@PathVariable("bPrice")int bPrice) throws RazorpayException
	{
		
		RazorpayClient rpClient = new RazorpayClient("rzp_test_j7PO399Eq2YGNt", "u9FBkfgauUyOwc0DiAuZeui6");
		
		JSONObject ob = new JSONObject();
		ob.put("amount", bPrice*100);
		ob.put("currency", "INR");
		ob.put("receipt", "txn_235425");
		
		Order order = rpClient.Orders.create(ob);
		
		return new ResponseEntity<String>(order.toString(),HttpStatus.OK);
		
	}
}
