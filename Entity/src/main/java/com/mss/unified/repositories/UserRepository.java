package com.mss.unified.repositories;

import com.mss.unified.entities.Role;
import com.mss.unified.entities.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
public interface UserRepository extends JpaRepository<User,Integer > {
	
	boolean existsByUserEmail(String username);

	boolean existsByUserName(String username);

	Optional<User> findByUserEmail(String username);

	Optional<User> findByUserNameOrUserEmail(String name, String name1);

	@Transactional
	void deleteByUserEmail(String username);

	User findByUserCode(int userCode);

	Optional<User> findByUserName(String userName);

	List<User> findByUserTypeAndIdAgence(int userType, int idAgence);
	@Query("select u from User u where u.userName like %:userName% and :role member of u.roles")
	List<User> getByRoleAndUserNameFilter(String userName, Role role);

	@Query("select u from User u where u.userName like %:userName% ")
	List<User> getByUserName(String userName);

	@Query("select u.userEmail from User u where u.idAgence=:idAgence")
	List<String> getByAllUserAgence(int idAgence);
}
