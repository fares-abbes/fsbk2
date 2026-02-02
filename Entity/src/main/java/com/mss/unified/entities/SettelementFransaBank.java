package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "settelement_operation_code", schema = "FRANSABANK")
public class SettelementFransaBank {
    @Id
    private int code;
    private String typeOperation;

    @Column(name = "DEBIT_ACOUNT")
    private String debitAccount;
    @Column(name = "CREDIT_ACCOUNT")
    private String creditAccount;
    @Column(name = "IDENTIFICATION")
    private String identificationbh;
    private String categorie;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getIdentificationbh() {
        return identificationbh;
    }

    public void setIdentificationbh(String identificationbh) {
        this.identificationbh = identificationbh;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }


    public String getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

}
