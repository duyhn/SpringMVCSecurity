package duyhn.mvc.com.Services;

import java.util.List;

import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Models.UserRole;
import duyhn.mvc.com.Models.UserRolePk;

public interface UserRoleService {

	UserRole inserUserRole(UserRole userRole);
	List<UserRole> findUserRoles();
	UserRole finUserRole(UserRolePk userRolePk);
	List<UserRole> findByUserRolePkUser(User user);
}
