package duyhn.mvc.com.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import duyhn.mvc.com.Models.User;
public interface UserRepository extends JpaRepository<User,Integer> {
	User findByUserName(String userName);
	User findByUserNameAndPassword(String userName, String pasword);

}
