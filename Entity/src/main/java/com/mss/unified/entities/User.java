package com.mss.unified.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERS", schema = "Administration ")
public
class User {

	  @Id

	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "UserAdSequence")
	  @SequenceGenerator(name = "UserAdSequence", sequenceName = "Administration.UserAdSequence", allocationSize = 1)
	  @Column(name = "USER_CODE", nullable = false)
	  private Integer userCode;

  @Column(name = "USER_NAME", nullable = false)
  private String userName;

  @Column(name = "USER_EMAIL", nullable = false)
  private String userEmail;
  @JsonIgnore
  @Column(name = "PASSWORD", nullable = false)
  private String password;
  @Column(name = "FIRST_NAME", nullable = false)
  private String firstName;
  @Column(name = "LAST_NAME", nullable = false)
  private String lastName;
  @Column(name = "COUNTRY_CODE")
  private String countryCode;
  @Column(name = "ATTEMPT")
  private int attempt;

  @Column(name = "LAST_LOGIN")
  private Date lastLogin;
  @Column(name = "NEW_LOGIN")
  private Date newLogin;
  @Column(name = "BANk")
  private Integer bankId;
  @Column(name = "ACTIVATED")
  private Boolean isActivated = false;

  @Column(name = "STATUS")
  private Boolean status = false;
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "user_roles", schema = "Administration",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();
  @Column(name = "LAST_USER_UPDATE")
  private Date lastUserUpdate;
  
  @Column(name = "PASSWORD_UPDATED")
  private Integer passwordUpdated;
  
  @Column(name = "CREATED_AT")
  private Date createdAt;
  
  @Column(name = "TIME_ELAPSED")
  private Integer timeElapsed;
  @Column(name = "USER_TYPE")
  private Integer userType;
  @Column(name = "id_Agence")
  private Integer idAgence;
  @Column(name = "FIRST_USER")

  private Boolean firstUser;
  
  
  
  public Boolean getFirstUser() {
	return firstUser;
}


public void setFirstUser(Boolean firstUser) {
	this.firstUser = firstUser;
}


public User() {
  }
  

  public Integer getIdAgence() {
	return idAgence;
}


public void setIdAgence(Integer idAgence) {
	this.idAgence = idAgence;
}



public Integer getUserType() {
	return userType;
}


public void setUserType(Integer userType) {
	this.userType = userType;
}


public Integer getTimeElapsed() {
	return timeElapsed;
}


public void setTimeElapsed(Integer timeElapsed) {
	this.timeElapsed = timeElapsed;
}


public Date getNewLogin() {
    return newLogin;
  }

  public void setNewLogin(Date newLogin) {
    this.newLogin = newLogin;
  }

  public Date getLastUserUpdate() {
    return lastUserUpdate;
  }

  public void setLastUserUpdate(Date lastUserUpdate) {
    this.lastUserUpdate = lastUserUpdate;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public User(String username, String email) {
    this.userName = username;
    this.userEmail = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public Integer getBankId() {
    return bankId;
  }

  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Boolean getActivated() {
    return isActivated;
  }

  public void setActivated(Boolean activated) {
    isActivated = activated;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public Integer getUserCode() {
    return userCode;
  }

  public void setUserCode(Integer userCode) {
    this.userCode = userCode;
  }

  public int getAttempt() {
    return attempt;
  }

  public void setAttempt(int attempt) {
    this.attempt = attempt;
  }

  public Date getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Integer getPasswordUpdated() {
	return passwordUpdated;
}

public void setPasswordUpdated(Integer passwordUpdated) {
	this.passwordUpdated = passwordUpdated;
}



public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

@Override
  public String toString() {
    return "User{" +
        "userCode=" + userCode +
        ", userName='" + userName + '\'' +
        ", userEmail='" + userEmail + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", countryCode='" + countryCode + '\'' +
        ", attempt=" + attempt +
        ", lastLogin=" + lastLogin +
        ", bankId=" + bankId +
        ", isActivated=" + isActivated +
        ", status=" + status +
        ", roles=" + roles +
        ", lastUserUpdate=" + lastUserUpdate +
        '}';
  }
}
