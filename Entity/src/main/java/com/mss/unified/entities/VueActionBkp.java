package com.mss.unified.entities;


import javax.persistence.*;


@Entity
@Table(name = "VUEACTIONBKP", schema = "ADMINISTRATION")
public class VueActionBkp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "VueActionBkpSequence")
    @SequenceGenerator(name = "VueActionBkpSequence", sequenceName = "ADMINISTRATION.VueActionBkpSequence", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "LIBELLE", nullable = false)
    private String libelle;

    @Column(name = "GROUPE")
    private String groupe;

    @Column(name = "URL",unique=true)
    private String url;


    public VueActionBkp() {
    }

    public VueActionBkp(String libelle, String groupe, String url) {
        this.libelle = libelle;
        this.groupe = groupe;
        this.url = url;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
}
