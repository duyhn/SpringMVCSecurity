package duyhn.mvc.com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import duyhn.mvc.com.Models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	List<Role> findByRoleName(String roleName);
}
