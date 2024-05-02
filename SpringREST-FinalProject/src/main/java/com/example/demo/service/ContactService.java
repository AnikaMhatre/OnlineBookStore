package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {

	public Contact saveContact(Contact contact);
	
	public List<Contact> getAllContactUss();
	
	public Contact getContactById(int id);
	
	public Contact updateContact(int id,boolean isActive);
	
	public List<Contact> deleteContactById(int id);
	
	public List<Contact> findByIsActive(boolean isActive);
}
