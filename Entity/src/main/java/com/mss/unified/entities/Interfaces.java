package com.mss.unified.entities;


import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "INTERFACES",schema = "SWITCH")
public
class Interfaces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "InterfaceSequence")
    @SequenceGenerator(name = "InterfaceSequence", sequenceName = "SWITCH.InterfaceSequence", allocationSize = 1)
    @Column(name = "INTER_CODE", nullable = false)
    private String interCode;
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "LAST_STATUS")
    private String lastStatus;
//    @Column(name = "DATE_CURRENT")
//    private String date;
    @Column(name = "CHANGE_DATE")
    private Date dateChangement;
    @Column(name = "ETAT")
    private String status;

    public String getInterCode() {
        return interCode;
    }

    public void setInterCode(String interCode) {
        this.interCode = interCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
    
    public Date getDateChangement() {
		return dateChangement;
	}

	public void setDateChangement(Date dateChangement) {
		this.dateChangement = dateChangement;
	}

	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Interfaces() {
    }
}
