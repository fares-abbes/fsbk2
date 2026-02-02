package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_STATUS",schema = "PORTEUR")
public class AccountStatus {

	
    @Id
    @Column(name = "AST_CODE", nullable = false)
    private String astCode;

    @Column(name = "AST_LIBELLE", nullable = false)
    private String astLibelle;
    
    @Column(name = "FSBK_CODE")
    private String fsbkCode;

    public String getFsbkCode() {
		return fsbkCode;
	}

	public void setFsbkCode(String fsbkCode) {
		this.fsbkCode = fsbkCode;
	}

	public String getAstCode() {
        return astCode;
    }

    public void setAstCode(String astCode) {
        this.astCode = astCode;
    }

    public String getAstLibelle() {
        return astLibelle;
    }

    public void setAstLibelle(String astLibelle) {
        this.astLibelle = astLibelle;
    }





}
