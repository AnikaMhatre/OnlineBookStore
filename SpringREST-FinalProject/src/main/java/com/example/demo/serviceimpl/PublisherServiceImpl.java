package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Publisher;
import com.example.demo.repository.PublisherRepository;
import com.example.demo.service.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService{
	@Autowired
	private PublisherRepository publisherRepository;

	@Override
	public Publisher savePublisher(Publisher Publisher) {
		// TODO Auto-generated method stub
		return publisherRepository.save(Publisher);
	}

	@Override
	public List<Publisher> getAllPublishers() {
		// TODO Auto-generated method stub
		return publisherRepository.findAll();
	}

	@Override
	public Publisher getPublisherById(int id) {
		// TODO Auto-generated method stub
		return publisherRepository.findById(id).get();
	}

	@Override
	public Publisher updatePublisher(int id, Publisher publisher) {
		// TODO Auto-generated method stub
		Publisher publisher1 = getPublisherById(id);
		publisher1.setpName(publisher.getpName());
		publisher1.setpCountry(publisher.getpCountry());
		publisher1.setPassword(publisher.getPassword());
		publisher1.setpStatus(publisher.getpStatus());
		return publisherRepository.save(publisher1);
	}

	@Override
	public List<Publisher> deletePublisher(int id) {
		// TODO Auto-generated method stub
		Publisher publisher1 = getPublisherById(id);
		publisherRepository.deleteById(publisher1.getpId());
		return publisherRepository.findAll();
	}

	@Override
	public Publisher loginPublisher(Publisher publisher) {
		// TODO Auto-generated method stub
		
		return publisherRepository.findByEmailAndPassword(publisher.getEmail(), publisher.getPassword());
		
	}

	@Override
	public Publisher findByEmail(String email) {
		// TODO Auto-generated method stub
		return publisherRepository.findByEmail(email);
	}

	@Override
	public List<Publisher> getActivePublishers() {
		// TODO Auto-generated method stub
		return publisherRepository.getActivePublishers();
	}

	@Override
	public List<Publisher> getNonActivePublishers() {
		// TODO Auto-generated method stub
		return publisherRepository.getNonActivePublishers();
	}
}
