package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@IdClass(ZoneId.class)
@Table(name = "ZONE",schema = "ADMINISTRATION")
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_ZONE", nullable = false)
    private Integer codeZone;

    @Id
    @Column(name = "INITIALE", nullable = false)
    private String initial;

    @Column(name = "LIBELLE")
    private String libelle;

    @Column(name = "INITIAL_REGION")
    private String initialRegion;

    @Column(name = "CODE_REGION")
    private Integer codeRegion;
    
    @Column(name = "EMAIL")
    private String email;
    
    



    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getCodeZone() {
        return codeZone;
    }

    public void setCodeZone(Integer codeZone) {
        this.codeZone = codeZone;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getInitialRegion() {
        return initialRegion;
    }

    public void setInitialRegion(String initialRegion) {
        this.initialRegion = initialRegion;
    }

    public Integer getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(Integer codeRegion) {
        this.codeRegion = codeRegion;
    }
}
