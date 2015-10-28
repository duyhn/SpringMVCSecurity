package duyhn.mvc.com.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails extends User implements UserDetails {

	private static final long serialVersionUID = 1L;
	public MyUserDetails(String userName, String password, List<GrantedAuthority> authorities){ 
		super(userName, password, true, true,true,true, authorities);
    } 
}
