package com.mss.unified.repositories;

import com.mss.unified.entities.UserPermission;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermission, Integer> {
	List<UserPermission> findByUserPermissionId_RoleId(Integer roleId);
	List<UserPermission> findByUserPermissionId_VueID(String userPermissionId_vueID);
}
