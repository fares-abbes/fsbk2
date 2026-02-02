package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "PRIVILEGE", schema = "Administration ")
public class Privilege {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "PrivilegeSequence")
	  @SequenceGenerator(name = "PrivilegeSequence", sequenceName = "Administration.PrivilegeSequence", allocationSize = 1)
	  private Integer id;

  private String name;

private Integer value;

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Privilege(String name) {

    this.name = name;
  }

  public Privilege() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public String toString() {
    return "Privilege{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", value=" + value +
        '}';
  }
}