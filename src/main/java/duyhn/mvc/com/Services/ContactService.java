package duyhn.mvc.com.Services;

import java.util.List;

import duyhn.mvc.com.Models.Contact;

public interface ContactService {

	public List<Contact> findAll();
	public Contact insertContact(Contact contact);
	
}
