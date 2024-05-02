package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;

@Service
public class ContactImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	@Override
	public Contact saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}

	@Override
	public List<Contact> getAllContactUss() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id).get();
	}

	@Override
	public Contact updateContact(int id, boolean isActive) {
		// TODO Auto-generated method stub
		Contact contact1 = getContactById(id);
		contact1.setActive(isActive);
		return contactRepository.save(contact1);
	}

	@Override
	public List<Contact> deleteContactById(int id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> findByIsActive(boolean isActive) {
		// TODO Auto-generated method stub
		return contactRepository.findByIsActive(isActive);
	}

}
