package duyhn.mvc.com.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import duyhn.mvc.com.Models.Role;
import duyhn.mvc.com.Repository.RoleRepository;
import duyhn.mvc.com.Services.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public Role findById(int id) {
		return roleRepository.findOne(id);
	}

}
