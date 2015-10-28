package duyhn.mvc.com.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Models.UserRole;
import duyhn.mvc.com.Models.UserRolePk;
import duyhn.mvc.com.Repository.UserRoleRepository;
import duyhn.mvc.com.Services.UserRoleService;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	UserRoleRepository userRoleRepository;
	
	@Override
	public UserRole inserUserRole(UserRole userRole) {
		return userRoleRepository.saveAndFlush(userRole);
	}

	@Override
	public List<UserRole> findUserRoles() {
		return userRoleRepository.findAll();
	}

	@Override
	public UserRole finUserRole(UserRolePk userRolePk) {
		return userRoleRepository.findOne(userRolePk);
	}

	@Override
	public List<UserRole> findByUserRolePkUser(User user) {
		return userRoleRepository.findByUserRolePkUser(user);
	}

}
