package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "USERTYPE", schema = "Administration ")
public class UserType {
	  @Id

	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_type_seq")
	  @SequenceGenerator(name = "user_type_seq", sequenceName = "Administration.user_type_seq", allocationSize = 1)
	  @Column(name = "Type_CODE", nullable = false)
	  private Integer userCode;

	  @Column(name = "TYPE_NAME", nullable = false)
	  private String typeName;

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	  
	  
}
