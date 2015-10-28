package duyhn.mvc.com.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import duyhn.mvc.com.Models.Contact;
import duyhn.mvc.com.Repository.ContactRepository;
import duyhn.mvc.com.Services.ContactService;

@Service
@Transactional
public class ContactServiceImpl implements ContactService{

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public List<Contact> findAll() {
		return contactRepository.findAll();
	}
	
	@Override
	public Contact insertContact(Contact contact){
		return contactRepository.save(contact);
	}

}
