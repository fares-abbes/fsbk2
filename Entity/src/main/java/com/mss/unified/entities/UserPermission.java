package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PERMISSION2",schema = "ADMINISTRATION")
public class UserPermission {

  @EmbeddedId
  @Column(name = "PERMISSION", nullable = false)
  private com.mss.unified.entities.UserPermissionId userPermissionId;

  @Column(name = "VALUE", nullable = false)
  private Integer value;

  public UserPermissionId getUserPermissionId() {
    return userPermissionId;
  }

  public void setUserPermissionId(UserPermissionId userPermissionId) {
    this.userPermissionId = userPermissionId;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
  public UserPermission(UserPermissionId userPermissionId, Integer value) {

    this.userPermissionId = userPermissionId;

    this.value = value;

  }



  public UserPermission() {



  }
}
