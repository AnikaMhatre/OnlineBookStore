package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.demo.service.PublisherService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/publisher/")
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
	@PostMapping
	public ResponseEntity<Publisher> savePublisher(@RequestBody Publisher publisher){
		return new ResponseEntity<Publisher>(publisherService.savePublisher(publisher),HttpStatus.CREATED);	
	}
	
	//Login
	@PostMapping("loginPublisher")
	public ResponseEntity<Publisher> loginPublisher(@RequestBody Publisher publisher) {
		//TODO: process POST request
		
		return new ResponseEntity<Publisher>(publisherService.loginPublisher(publisher),HttpStatus.OK);
		
	}
	
	@GetMapping
	public List<Publisher> getAllPublishers(){
		return publisherService.getAllPublishers();
	}
		
	@GetMapping("{publisherId}")
	public ResponseEntity<Publisher> getPublisherById(@PathVariable ("publisherId")int publisherId) {
		return new ResponseEntity<Publisher>(publisherService.getPublisherById(publisherId),HttpStatus.OK);
	}
	
	
	@PutMapping("{publisherId}")
	public ResponseEntity<Publisher> updatePublisher(@PathVariable ("publisherId")int publisherId,@RequestBody Publisher publisher){
		return new ResponseEntity<Publisher>(publisherService.updatePublisher(publisherId, publisher),HttpStatus.OK);
	}
	
	@DeleteMapping("{publisherId}")
	public List<Publisher> deletePublisher(@PathVariable ("publisherId") int publisherId){
		return publisherService.deletePublisher(publisherId);
	}
	
	@GetMapping("/getPubByEmail/{publisherEmail}")
	public ResponseEntity<Publisher> getCustomerByEmail(@PathVariable("publisherEmail")String email)
	{
		return new ResponseEntity<Publisher>(publisherService.findByEmail(email),HttpStatus.OK);
	}
	
	@GetMapping("/getActivePublishers")
	public List<Publisher> getActivePublishers()
	{
		return publisherService.getActivePublishers();
	}
	
	@GetMapping("/getNonActivePublishers")
	public List<Publisher> getNonActivePublishers()
	{
		return publisherService.getNonActivePublishers();
	}
}
