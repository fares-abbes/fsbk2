package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PENDING_TPE",schema = "POS")
public class PendingTpe
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PendingTpeSequence")
    @SequenceGenerator(name = "PendingTpeSequence", sequenceName = "POS.PendingTpeSequence", allocationSize = 1)
    @Column(name = "CODE", nullable = false)
    private Integer code;

    @Column(name = "LIBELLE", nullable = false)
    private String libelle;

    @Column(name = "CITY", nullable = false)
    private String city;
    @Column(name = "MCC_CODE")
    private Integer mccCode;
    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @Column(name = "ZIP_CODE", nullable = false)
    private String zipCode;
    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Column(name = "TYPE", nullable = false)
    private int type;
    @Column(name = "MOTIF")
    private String motif;
    @Column(name = "Status")
    private int status;
    @Column(name = "PREAUTORISATION", nullable = false)
    private Boolean preAutorisation;
    @Column(name = "MODEL" )
    private String model;
    @Column(name = "ADDRESS", nullable = false)
    private String adresse;
    @Column(name = "SERIAL_NUM")
	private String serialNum;
    
    @Column(name = "ACTIVITE")
	private String activite;
    @Column(name = "FAMILLE_POS_CODE")
    private int famillePosCode;
    
    @Column(name = "NOM_CONTACT")
    private String nomC;
    
    @Column(name = "TYPE_CONTACT")
    private String typeC;
    
    @Column(name = "TITLE_CONTACT")
    private String titleC;
    @Column(name = "COMMUNE")
	private String commune;
    
    @Column(name = "DAIRA")
   	private String daira;



	public String getDaira() {
		return daira;
	}

	public void setDaira(String daira) {
		this.daira = daira;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public int getFamillePosCode() {
		return famillePosCode;
	}

	public void setFamillePosCode(int famillePosCode) {
		this.famillePosCode = famillePosCode;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getModel() {
        return model;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotif() {
        return motif;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Boolean getPreAutorisation() {
        return preAutorisation;
    }

    public void setPreAutorisation(Boolean preAutorisation) {
        this.preAutorisation = preAutorisation;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMccCode() {
        return mccCode;
    }

    public void setMccCode(Integer mccCode) {
        this.mccCode = mccCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

	public String getNomC() {
		return nomC;
	}

	public void setNomC(String nomC) {
		this.nomC = nomC;
	}

	public String getTypeC() {
		return typeC;
	}

	public void setTypeC(String typeC) {
		this.typeC = typeC;
	}

	public String getTitleC() {
		return titleC;
	}

	public void setTitleC(String titleC) {
		this.titleC = titleC;
	}

	@Override
	public String toString() {
		return "PendingTpe [code=" + code + ", libelle=" + libelle + ", city=" + city + ", mccCode=" + mccCode
				+ ", country=" + country + ", zipCode=" + zipCode + ", phone=" + phone + ", type=" + type + ", motif="
				+ motif + ", status=" + status + ", preAutorisation=" + preAutorisation + ", model=" + model
				+ ", adresse=" + adresse + ", serialNum=" + serialNum + ", activite=" + activite + ", famillePosCode="
				+ famillePosCode + ", nomC=" + nomC + ", typeC=" + typeC + ", titleC=" + titleC + ", commune=" + commune
				+ "]";
	}

	

	
    
}

