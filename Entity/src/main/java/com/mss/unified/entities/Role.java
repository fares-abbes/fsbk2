package com.mss.unified.entities;

import javax.persistence.*;


@Entity
@Table(name = "ROLE", schema = "Administration ")
public
class Role {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "RoleSequence")
	  @SequenceGenerator(name = "RoleSequence", sequenceName = "ADMINISTRATION.RoleSequence", allocationSize = 1)
	  private Long id;


  @Column(length = 60)
  private String name;
  /*@ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "role_vue", schema = "Administration",
      joinColumns = @JoinColumn(name = "role_id"),
      inverseJoinColumns = @JoinColumn(name = "vue_id"))
  private Set<UserPermission> vue = new HashSet<>();
*/
  public Role() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Role{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
