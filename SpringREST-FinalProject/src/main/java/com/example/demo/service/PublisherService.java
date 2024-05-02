package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Publisher;


public interface PublisherService {
	public Publisher savePublisher(Publisher publisher);
	
	public Publisher loginPublisher(Publisher publisher);
	
	public List<Publisher> getAllPublishers();
	
	public Publisher getPublisherById(int id);
	
	public Publisher updatePublisher(int id,Publisher publisher);
	
	public List<Publisher> deletePublisher(int id);
	
	public Publisher findByEmail(String email);
	
	public List<Publisher> getActivePublishers();
	
	public List<Publisher> getNonActivePublishers();
}
