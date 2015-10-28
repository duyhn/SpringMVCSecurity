package duyhn.mvc.com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Models.UserRole;
import duyhn.mvc.com.Models.UserRolePk;

public interface UserRoleRepository extends JpaRepository<UserRole, UserRolePk> {
	public List<UserRole> findByUserRolePkUser(User user);

}
