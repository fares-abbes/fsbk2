package com.mss.unified.entities;


import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT",schema = "PORTEUR")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AccountSequence")
    @SequenceGenerator(name = "AccountSequence", sequenceName = "PORTEUR.AccountSequence", allocationSize = 1)
    @Column(name = "ACC_CODE", nullable = false)
    private int accountCode;

    @Column(name = "GLRISK_CODE")
    private String globalRiskMangCode;

    @Column(name = "ACC_NUM")
    private String accountNum;


    @Column(name = "AST_CODE")
    private Integer astCode;

    @Column(name = "CUS_CODE", nullable = true)
    private String customerCode;
    
    @Column(name = "ACC_NUM_ATT")
    private String accountNumAttached;
    @Column(name = "ACC_NAME")
    private String accountName;

    @Column(name = "ACC_AVAILABE")
    private BigInteger accountAvailable;
    @Column(name = "ACC_BILL")
    private BigInteger accountBilling;
    @Column(name = "ACC_AUTH")
    private BigInteger accountAuthorize;
    @Column(name = "ACC_REVOL_LIMIT")
    private BigInteger accountRevolvingLimit;
    
    @Column(name = "CURRENCY")
    private String currency;
    
    @Column(name = "ACCOUNT_TYPE")
    private Integer accountType;
    
    @Column(name = "Creation_Date")
    private Date creationDate;
    
    @Column(name = "ID_AGENCE")
    private Integer idAgence;
    
    private BigInteger accountBalance;
    private BigInteger accountExceeding;
    private BigInteger preauthAmount;
    private BigInteger refundAmount;
    

    
    public BigInteger getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigInteger refundAmount) {
		this.refundAmount = refundAmount;
	}

	public BigInteger getPreauthAmount() {
		return preauthAmount;
	}

	public void setPreauthAmount(BigInteger preauthAmount) {
		this.preauthAmount = preauthAmount;
	}

	public BigInteger getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigInteger accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BigInteger getAccountExceeding() {
		return accountExceeding;
	}

	public void setAccountExceeding(BigInteger accountExceeding) {
		this.accountExceeding = accountExceeding;
	}

	public Account(String globalRiskMangCode, String accountNum, Integer astCode, String customerCode,
                   String accountNumAttached, String accountName, BigInteger accountAvailable, BigInteger accountBilling,
                   BigInteger accountAuthorize,
                   BigInteger
                           accountRevolvingLimit, String currency,Date creationDate) {

        this.globalRiskMangCode = globalRiskMangCode;
        this.accountNum = accountNum;
        this.astCode = astCode;
        this.customerCode = customerCode;
        this.accountNumAttached = accountNumAttached;
        this.accountName = accountName;
        this.accountAvailable = accountAvailable;
        this.accountBilling = accountBilling;
        this.accountAuthorize = accountAuthorize;
        this.accountRevolvingLimit = accountRevolvingLimit;
        this.currency = currency;
        this.creationDate=creationDate;
    }

    public Account(String globalRiskMangCode, String accountNum, Integer astCode, String customerCode,
                   String accountNumAttached, String accountName, BigInteger accountAvailable, BigInteger accountBilling,
                   BigInteger accountAuthorize,
                   BigInteger accountRevolvingLimit, String currency,Date creationDate,Integer accountType,Integer idAgence) {

        this.globalRiskMangCode = globalRiskMangCode;
        this.accountNum = accountNum;
        this.astCode = astCode;
        this.customerCode = customerCode;
        this.accountNumAttached = accountNumAttached;
        this.accountName = accountName;
        this.accountAvailable = accountAvailable;
        this.accountBilling = accountBilling;
        this.accountAuthorize = accountAuthorize;
        this.accountRevolvingLimit = accountRevolvingLimit;
        this.currency = currency;
        this.creationDate=creationDate;
        this.accountType=accountType;
        this.idAgence=idAgence;
    }
    public Account(String globalRiskMangCode, String accountNum, Integer astCode, String customerCode,
                   String accountNumAttached, String accountName, BigInteger accountAvailable, BigInteger accountBilling, BigInteger accountAuthorize,
                   BigInteger accountRevolvingLimit, String currency,Integer idAgence) {

        this.globalRiskMangCode = globalRiskMangCode;
        this.accountNum = accountNum;
        this.astCode = astCode;
        this.customerCode = customerCode;
        this.accountNumAttached = accountNumAttached;
        this.accountName = accountName;
        this.accountAvailable = accountAvailable;
        this.accountBilling = accountBilling;
        this.accountAuthorize = accountAuthorize;
        this.accountRevolvingLimit = accountRevolvingLimit;
        this.currency = currency;
        this.idAgence=idAgence;
    }

    public Integer getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(Integer idAgence) {
        this.idAgence = idAgence;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public Integer getAstCode() {
		return astCode;
	}

	public void setAstCode(Integer astCode) {
		this.astCode = astCode;
	}

	public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public int getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(int accountCode) {
        this.accountCode = accountCode;
    }

    public String getGlobalRiskMangCode() {
        return globalRiskMangCode;
    }

    public void setGlobalRiskMangCode(String globalRiskMangCode) {
        this.globalRiskMangCode = globalRiskMangCode;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

	public String getAccountNumAttached() {
		return accountNumAttached;
	}

	public void setAccountNumAttached(String accountNumAttached) {
		this.accountNumAttached = accountNumAttached;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public BigInteger getAccountAvailable() {
		return accountAvailable;
	}

	public void setAccountAvailable(BigInteger accountAvailable) {
		this.accountAvailable = accountAvailable;
	}

	public BigInteger getAccountBilling() {
		return accountBilling;
	}

	public void setAccountBilling(BigInteger accountBilling) {
		this.accountBilling = accountBilling;
	}

	public BigInteger getAccountAuthorize() {
		return accountAuthorize;
	}

	public void setAccountAuthorize(BigInteger accountAuthorize) {
		this.accountAuthorize = accountAuthorize;
	}

	public BigInteger getAccountRevolvingLimit() {
		return accountRevolvingLimit;
	}

	public void setAccountRevolvingLimit(BigInteger accountRevolvingLimit) {
		this.accountRevolvingLimit = accountRevolvingLimit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

    public Account() {
    }
}
