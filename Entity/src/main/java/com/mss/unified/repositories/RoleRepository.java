package com.mss.unified.repositories;

import com.mss.unified.entities.Role;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
    Optional< Role > findByName(String roleName);

}