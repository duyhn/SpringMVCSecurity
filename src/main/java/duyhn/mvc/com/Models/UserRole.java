package duyhn.mvc.com.Models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class UserRole  {

	@EmbeddedId
	private UserRolePk userRolePk;

	
	public UserRolePk getUserRolePk() {
		return userRolePk;
	}

	public void setUserRolePk(UserRolePk userRolePk) {
		this.userRolePk = userRolePk;
	}
	
}
