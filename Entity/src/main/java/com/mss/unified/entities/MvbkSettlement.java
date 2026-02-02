package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mvbk_settelement", schema = "FRANSABANK")
public class MvbkSettlement {

    @Id
    private int code;


    @Column(name = "ACCOUNT")
    private String account;
    @Column(name = "IDENTIFICATION")
    private String identification;
    @Column(name = "SIGNE")
    private String signe;
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "CODE_SETTELEMENT")
    private String codeSettlement;

    @Column(name = "TYPE")
    private String type;


    @Column(name = "CATEGORIE")
    private String categorie;

    @Column(name = "CODE_FRANSABANK")
    private String codeFransabank;


    @Column(name = "CODE_AGENCE")
    private String codeAgence;

    @Column(name = "CODE_REMBOURSEMENT_INTERNET")
    private String codeInternet;

    @Column(name = "CODE_ACHAT_INTERNET")
    private String codeAchatInternet;
    
    private String codeOperation;
    
    private String libelleOperation;
    
    private String libelleOperationTVP;
    
    private String libelleOperationALP;
    
    
    
    public String getLibelleOperationTVP() {
		return libelleOperationTVP;
	}

	public void setLibelleOperationTVP(String libelleOperationTVP) {
		this.libelleOperationTVP = libelleOperationTVP;
	}

	public String getLibelleOperationALP() {
		return libelleOperationALP;
	}

	public void setLibelleOperationALP(String libelleOperationALP) {
		this.libelleOperationALP = libelleOperationALP;
	}

	public String getLibelleOperation() {
		return libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public String getCodeOperation() {
		return codeOperation;
	}

	public void setCodeOperation(String codeOperation) {
		this.codeOperation = codeOperation;
	}

	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getSigne() {
        return signe;
    }

    public void setSigne(String signe) {
        this.signe = signe;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeSettlement() {
        return codeSettlement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCodeSettlement(String codeSettlement) {
        this.codeSettlement = codeSettlement;


    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }



    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getCodeInternet() {
        return codeInternet;
    }

    public void setCodeInternet(String codeInternet) {
        this.codeInternet = codeInternet;
    }

    public String getCodeAchatInternet() {
        return codeAchatInternet;
    }

    public void setCodeAchatInternet(String codeAchatInternet) {
        this.codeAchatInternet = codeAchatInternet;
    }

    public String getCodeFransabank() {
        return codeFransabank;
    }

    public void setCodeFransabank(String codeFransabank) {
        this.codeFransabank = codeFransabank;
    }

	@Override
	public String toString() {
		return "MvbkSettlement [code=" + code + ", account=" + account + ", identification=" + identification
				+ ", signe=" + signe + ", libelle=" + libelle + ", codeSettlement=" + codeSettlement + ", type=" + type
				+ ", categorie=" + categorie + ", codeFransabank=" + codeFransabank + ", codeAgence=" + codeAgence
				+ ", codeInternet=" + codeInternet + ", codeAchatInternet=" + codeAchatInternet + "]";
	}


}
