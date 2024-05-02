package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

	public Publisher findByEmailAndPassword(String email,String password);
	
	public Publisher findByEmail(String email);
	
	//active publishers
	@Query(value = "select * from publisher_table where publisher_status=true",nativeQuery = true)
	public List<Publisher> getActivePublishers();
	
	@Query(value = "select * from publisher_table where publisher_status=false",nativeQuery = true)
	public List<Publisher> getNonActivePublishers();
	
	//get publisher name by id
	
	
	
}
