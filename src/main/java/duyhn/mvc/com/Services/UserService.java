package duyhn.mvc.com.Services;

import java.util.List;

import duyhn.mvc.com.Models.User;


public interface UserService {
	List<User> findAll();
	User findById(int id);
	User findByUserName(String userName);
	User inserUser(User user);
	User findUserByUsernamAndPassword(String userName, String password);

}
