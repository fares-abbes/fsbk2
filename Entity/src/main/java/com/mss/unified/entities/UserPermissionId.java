package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserPermissionId implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "ROLE_ID", nullable = false)
  private Integer roleId;

  @Column(name = "VUE_ID", nullable = false)
  private String vueID;

  public UserPermissionId(Integer roleId, String vueID) {
    this.roleId = roleId;
    this.vueID = vueID;
  }

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public String getVueID() {
    return vueID;
  }

  public UserPermissionId() {
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public void setVueID(String vueID) {
    this.vueID = vueID;
  }

  @Override
  public String toString() {
    return "UserPermissionId{" +
        "roleId=" + roleId +
        ", vueID=" + vueID +
        '}';
  }
}
