package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@IdClass(AgenceId.class)
@Table(name = "AGENCE",schema = "Administration")
public class AgenceAdministration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_AGENCE", nullable = false)
    private Integer codeAgence;

    @Id
    @Column(name = "INITIALE", nullable = false)
    private String initial;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "LIBELLE")
    private String libelle;

    @Column(name = "INITIAL_ZONE")
    private String initialZone;

    @Column(name = "CODE_ZONE")
    private Integer codeZone;
    
    @Column(name = "STATUS")
    private String status;

    private String manager;
    
    private String city;
    
    @Column(name = "EMAIL")
    private String email;
    
    
    
    
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(Integer codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getInitialZone() {
        return initialZone;
    }

    public void setInitialZone(String initialZone) {
        this.initialZone = initialZone;
    }

    public Integer getCodeZone() {
        return codeZone;
    }

    public void setCodeZone(Integer codeZone) {
        this.codeZone = codeZone;
    }
}
