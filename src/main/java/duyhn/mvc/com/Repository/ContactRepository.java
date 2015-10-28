package duyhn.mvc.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import duyhn.mvc.com.Models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
