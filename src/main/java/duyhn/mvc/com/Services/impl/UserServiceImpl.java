package duyhn.mvc.com.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Repository.UserRepository;
import duyhn.mvc.com.Services.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(int id) {
		return userRepository.findOne(id);
	}

	@Override
	@Transactional
	public User inserUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User findUserByUsernamAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
