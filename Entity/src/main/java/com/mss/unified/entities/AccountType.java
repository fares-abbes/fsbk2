package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_TYPE", schema = "PORTEUR")
public class AccountType {


    @Id
    @Column(name = "AT_CODE", nullable = false)
    private Integer accountCode;

    @Column(name = "AT_LIBELLE", nullable = false)
    private String accountLibelle;


    public Integer getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountLibelle() {
        return accountLibelle;
    }

    public void setAccountLibelle(String accountLibelle) {
        this.accountLibelle = accountLibelle;
    }



}

