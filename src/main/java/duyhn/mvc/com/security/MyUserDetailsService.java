package duyhn.mvc.com.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.GrantedAuthority;

import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Models.UserRole;
import duyhn.mvc.com.Services.RoleService;
import duyhn.mvc.com.Services.UserRoleService;
import duyhn.mvc.com.Services.UserService;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		User user = userService.findByUserName(userName);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		List<UserRole> userRoles = userRoleService.findByUserRolePkUser(user);
		for (UserRole userRole : userRoles) {
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.getUserRolePk().getRole().getRoleName()); 
			authorities.add(authority);
		}
		MyUserDetails userDetail = new MyUserDetails(userName, user.getPassword(), authorities);  
		return userDetail;
	}

}
