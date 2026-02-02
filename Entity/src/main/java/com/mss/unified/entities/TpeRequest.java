package com.mss.unified.entities;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "TPE_REQUEST", schema = "POS")
public class TpeRequest {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "TpeRequestSequence")
	  @SequenceGenerator(name = "TpeRequestSequence", sequenceName = "POS.TpeRequestSequence", allocationSize = 1)
	  @Column(name = "REQUEST_CODE", nullable = false)
	  private int requestCode;
  @Column(name = "ACCOUNT_NUMBER")
  private String accountNumber;

  @Column(name = "MERCHANT_NAME")
  private String userName;

  @Column(name = "AGENCE", nullable = false)
  private int agence;

  @Column(name = "NB_TPE", nullable = false)
  private String nombreTPE;

  @Column(name = "CREATION_DATE")
  private Date dateCreation;

  @Column(name = "DECISION_DATE")
  private Date dateDecision;

  @Column(name = "COMMISSION_NATIONAL")
  private String commissionNational;

  @Column(name = "COMMISSION_INTERNATIONAL")
  private String commissionInterNational;

  @Column(name = "CITY")
  private String city;

  @Column(name = "COUNTRY")
  private String country;

  @Column(name = "CODE_ZIP")
  private String codeZip;

  @Column(name = "PHONE")
  private String phone;
  @Column(name = "AGENT_NAME")
  private String agentName;
  @Column(name = "ADDRESS")
  private String adresse;

  @Column(name = "STATUS", nullable = false)
  private int status;
  @Column(name = "COMMISSION_CODE", nullable = true)
  private int commissionTypeCode;
  @Column(name = "TYPE_CODE", nullable = true)
  private int requestTpeCode;
  @Column(name = "ISOFFSHORE")
  private Boolean offshore;
  
  @Column(name = "DEVISE")
  private String devise;
  
  @Column(name = "NOM")
  private String nom;
  


  @Column(name = "PRENOM")
  private String prenom;


  @Column(name = "NIF")
  private String nif;
  
  @Column(name = "RSO")
  private String rso;
  
  @Column(name = "RC")
  private String rc;
  @Column(name = "CODE_WILAYA")
  private String codeWilaya;

  @Column(name = "EMAIL")
  private String email;
  @Column(name = "COMMUNE")

	private String commune;
  @Column(name = "DAIRA")

	private String daira;
  
  @Column(name = "REVENUE")

	private String revenue;
  

  @Column(name = "NUM_CONTRAT")

	private String numContrat;
  
  @Column(name = "EMAIL_CHARGE")
  private String emailCharge;
  
  @Column(name = "STATU_CONTRAT")
  private String statuContrat;
  
  @Column(name = "WEB_SITE")
  private String siteWeb;
  
  
  @Column(name = "DESCRIPTION_REJECT")
  private String descriptionReject;

  @Column(name = "NOM_CONTACT")
  private String nomC;
  
  @Column(name = "TYPE_CONTACT")
  private String typeC;
  
  @Column(name = "TITLE_CONTACT")
  private String titleC;
  
  @Column(name = "MONTANT_LOYER")
  private String montantLoyer;
  
  
  
public String getMontantLoyer() {
	return montantLoyer;
}

public void setMontantLoyer(String montantLoyer) {
	this.montantLoyer = montantLoyer;
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

public String getDescriptionReject() {
	return descriptionReject;
}

public void setDescriptionReject(String descriptionReject) {
	this.descriptionReject = descriptionReject;
}

public String getSiteWeb() {
	return siteWeb;
}

public void setSiteWeb(String siteWeb) {
	this.siteWeb = siteWeb;
}

public String getStatuContrat() {
	return statuContrat;
}

public void setStatuContrat(String statuContrat) {
	this.statuContrat = statuContrat;
}

public String getEmailCharge() {
	return emailCharge;
}

public void setEmailCharge(String emailCharge) {
	this.emailCharge = emailCharge;
}

public String getNumContrat() {
	return numContrat;
}

public void setNumContrat(String numContrat) {
	this.numContrat = numContrat;
}

public String getRevenue() {
	return revenue;
}

public void setRevenue(String revenue) {
	this.revenue = revenue;
}

public String getCommune() {
	return commune;
}

public void setCommune(String commune) {
	this.commune = commune;
}

public String getDaira() {
	return daira;
}

public void setDaira(String daira) {
	this.daira = daira;
}

public String getRc() {
	return rc;
}

public void setRc(String rc) {
	this.rc = rc;
}

public String getCodeWilaya() {
	return codeWilaya;
}

public void setCodeWilaya(String codeWilaya) {
	this.codeWilaya = codeWilaya;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getRso() {
	return rso;
}

public void setRso(String rso) {
	this.rso = rso;
}

public String getNif() {
	return nif;
}

public void setNif(String nif) {
	this.nif = nif;
}

public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @ManyToMany(fetch = FetchType.EAGER)
  @Cascade(CascadeType.ALL)
  @JoinTable(name = "REQUEST_CODE", schema = "POS",
      joinColumns = @JoinColumn(name = "request"),
      inverseJoinColumns = @JoinColumn(name = "CODE"))
  private Set<PendingTpe> pendingTpes = new HashSet<>();

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }



  public int getRequestCode() {
    return requestCode;
  }

  public void setRequestCode(int requestCode) {
    this.requestCode = requestCode;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getAgence() {
    return agence;
  }

  public void setAgence(int agence) {
    this.agence = agence;
  }

  public String getNombreTPE() {
    return nombreTPE;
  }

  public void setNombreTPE(String nombreTPE) {
    this.nombreTPE = nombreTPE;
  }

  public Date getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  public Date getDateDecision() {
    return dateDecision;
  }

  public void setDateDecision(Date dateDecision) {
    this.dateDecision = dateDecision;
  }

  public String getCommissionNational() {
    return commissionNational;
  }

  public void setCommissionNational(String commissionNational) {
    this.commissionNational = commissionNational;
  }

  public String getCommissionInterNational() {
    return commissionInterNational;
  }

  public void setCommissionInterNational(String commissionInterNational) {
    this.commissionInterNational = commissionInterNational;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCodeZip() {
    return codeZip;
  }

  public void setCodeZip(String codeZip) {
    this.codeZip = codeZip;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getCommissionTypeCode() {
    return commissionTypeCode;
  }

  public void setCommissionTypeCode(int commissionTypeCode) {
    this.commissionTypeCode = commissionTypeCode;
  }

  public TpeRequest() {
  }

  public TpeRequest(int requestCode, String accountNumber, String userName, int agence, String nombreTPE, Date dateCreation, Date dateDecision, String commissionNational, String commissionInterNational, String city, String country, String codeZip, String phone, String agentName, String adresse, int status, int commissionTypeCode, int requestTpeCode, Boolean offshore, Set<PendingTpe> pendingTpes) {
    this.requestCode = requestCode;
    this.accountNumber = accountNumber;
    this.userName = userName;
    this.agence = agence;
    this.nombreTPE = nombreTPE;
    this.dateCreation = dateCreation;
    this.dateDecision = dateDecision;
    this.commissionNational = commissionNational;
    this.commissionInterNational = commissionInterNational;
    this.city = city;
    this.country = country;
    this.codeZip = codeZip;
    this.phone = phone;
    this.agentName = agentName;
    this.adresse = adresse;
    this.status = status;
    this.commissionTypeCode = commissionTypeCode;
    this.requestTpeCode = requestTpeCode;
    offshore = offshore;
    this.pendingTpes = pendingTpes;
  }

  public Set<PendingTpe> getPendingTpes() {
	return pendingTpes;
}

public void setPendingTpes(Set<PendingTpe> pendingTpes) {
	this.pendingTpes = pendingTpes;
}

  public int getRequestTpeCode() {
    return requestTpeCode;
  }

  public void setRequestTpeCode(int requestTpeCode) {
    this.requestTpeCode = requestTpeCode;
  }

  public Boolean getOffshore() {
    return offshore;
  }

  public void setOffshore(Boolean offshore) {
    this.offshore = offshore;
  }

  
  
  public String getDevise() {
	return devise;
}

public void setDevise(String devise) {
	this.devise = devise;
}



public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

@Override
public String toString() {
	return "TpeRequest [requestCode=" + requestCode + ", accountNumber=" + accountNumber + ", userName=" + userName
			+ ", agence=" + agence + ", nombreTPE=" + nombreTPE + ", dateCreation=" + dateCreation + ", dateDecision="
			+ dateDecision + ", commissionNational=" + commissionNational + ", commissionInterNational="
			+ commissionInterNational + ", city=" + city + ", country=" + country + ", codeZip=" + codeZip + ", phone="
			+ phone + ", agentName=" + agentName + ", adresse=" + adresse + ", status=" + status
			+ ", commissionTypeCode=" + commissionTypeCode + ", requestTpeCode=" + requestTpeCode + ", offshore="
			+ offshore + ", devise=" + devise + ", nom=" + nom + ", prenom=" + prenom + ", nif=" + nif + ", rso=" + rso
			+ ", rc=" + rc + ", codeWilaya=" + codeWilaya + ", email=" + email + ", commune=" + commune + ", daira="
			+ daira + ", revenue=" + revenue + ", numContrat=" + numContrat + ", emailCharge=" + emailCharge
			+ ", statuContrat=" + statuContrat + ", siteWeb=" + siteWeb + ", descriptionReject=" + descriptionReject
			+ ", nomC=" + nomC + ", typeC=" + typeC + ", titleC=" + titleC + ", montantLoyer=" + montantLoyer
			+ ", pendingTpes=" + pendingTpes + "]";
}









}