package com.mss.unified.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CARD", schema = "PORTEUR")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CardSequence")
    @SequenceGenerator(name = "CardSequence", sequenceName = "PORTEUR.CardSequence", allocationSize = 1)
    @Column(name = "CAR_CODE", nullable = false)
    private int cardCode;
    @Column(name = "EXP_DATE")
    private Date expiryDate;
    @Column(name = "STAR_DATE")
    private Date startDate;
    @Column(name = "PRE_DATE")
    private Date preDate;
    @Column(name = "CAR_NUM")
    private String cardNum;
    @Column(name = "ACC_CODE")
    private Integer accCode;
    @Column(name = "GLRISK_CODE")
    private String globalRiskCode;
    @Column(name = "CURR_CODE")
    private Integer currencyCode;
    @Column(name = "CST_CODE")
    private Integer cardStatusCode;
    @Column(name = "TPSC_CODE")
    private Integer thirdPositionCode;
    @Column(name = "SPSC_CODE")
    private Integer secondPositionCode;
    @Column(name = "FPSC_CODE")
    private Integer firtPositionCode;
    @Column(name = "CP_CODE")
    private Integer productCode;
    @Column(name = "ATC")
    private String atc;
    @Column(name = "PROGRAM")
    private Integer programeId;
    @Column(name = "REV_PROGRAM")
    @JsonProperty("rev_program")
    private String revProgram;
    @Column(name = "PIN_TRY_LIMIT")
    private Integer pinTryLimit;
    @Column(name = "NEW_EXP_DATE")
    private Date newExpDate;
    @Column(name = "REV_PRODUCT_CODE")
    private Integer revProductCode;
    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    @JoinTable(name = "CARD_CONTROL", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "CAR_CODE"),
            inverseJoinColumns = @JoinColumn(name = "CONTROL_NUM"))
    public Set<ControlList> controlLists = new HashSet<>();
    @Column(name="TYPE_CARD")
    private Integer typeCard;
    
    @Column(name="PERSO_STATUS")
    private Integer persoStatus;
    
    @Column(name="agency_code")
    private String agencyCode;
    
    @Column(name = "modif_date")
    private Date modifDate;
    
    @Column(name = "card_name")
    private String cardName;
    
    @Column(name = "gender")
    private String gender;

 
    private String randomPin;
    
    private String cardActionsStatus;
    private String lastEmbossingSummaryFile;
    
    private String sequenceNumber;
    
    
    private String raisonSocial;
    private Boolean isFromMobile;
    private String requestCardId;
    private String oldPvv;

    public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getLastEmbossingSummaryFile() {
		return lastEmbossingSummaryFile;
	}

	public void setLastEmbossingSummaryFile(String lastEmbossingSummaryFile) {
		this.lastEmbossingSummaryFile = lastEmbossingSummaryFile;
	}

	public String getCardActionsStatus() {
		return cardActionsStatus;
	}

	public void setCardActionsStatus(String cardActionsStatus) {
		this.cardActionsStatus = cardActionsStatus;
	}

	public Card(Date expiryDate, Date startDate, Date preDate, String cardNum, Integer accCode, String globalRiskCode, Integer currencyCode, Integer thirdPositionCode, Integer secondPositionCode, Integer firtPositionCode,
    		Integer productCode, String atc, Integer revProductCode,Integer cardStatusCode) {
        this.expiryDate = expiryDate;
        this.startDate = startDate;
        this.preDate = preDate;
        this.cardNum = cardNum;
        this.accCode = accCode;
        this.globalRiskCode = globalRiskCode;
        this.currencyCode = currencyCode;
        this.thirdPositionCode = thirdPositionCode;
        this.secondPositionCode = secondPositionCode;
        this.firtPositionCode = firtPositionCode;
        this.productCode = productCode;
        this.atc = atc;
        this.revProductCode=revProductCode;
        this.cardStatusCode=cardStatusCode;
    }

    public Card() {

    }


	public String getRandomPin() {
		return randomPin;
	}

	public void setRandomPin(String randomPin) {
		this.randomPin = randomPin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public Date getModifDate() {
		return modifDate;
	}

	public void setModifDate(Date modifDate) {
		this.modifDate = modifDate;
	}

	public String getClearCardNum(){
        return this.cardNum;
    }

    public Integer getRevProductCode() {
        return revProductCode;
    }

    public void setRevProductCode(Integer revProductCode) {
        this.revProductCode = revProductCode;
    }

    public Date getNewExpDate() {
        return newExpDate;
    }

    public void setNewExpDate(Date newExpDate) {
        this.newExpDate = newExpDate;
    }

    public Integer getPinTryLimit() {
        return pinTryLimit;
    }

    public void setPinTryLimit(Integer pinTryLimit) {
        this.pinTryLimit = pinTryLimit;
    }

    public String getRevProgram() {
        return revProgram;
    }

    public void setRevProgram(String rev_program) {
        this.revProgram = rev_program;
    }

    public Integer getProgrameId() {
        return programeId;
    }

    public void setProgrameId(Integer programeId) {
        this.programeId = programeId;
    }



    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Integer getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Integer currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getCardStatusCode() {
        return cardStatusCode;
    }

    public void setCardStatusCode(Integer cardStatusCode) {
        this.cardStatusCode = cardStatusCode;
    }

    public Integer getThirdPositionCode() {
        return thirdPositionCode;
    }

    public void setThirdPositionCode(Integer thirdPositionCode) {
        this.thirdPositionCode = thirdPositionCode;
    }

    public Integer getSecondPositionCode() {
        return secondPositionCode;
    }

    public void setSecondPositionCode(Integer secondPositionCode) {
        this.secondPositionCode = secondPositionCode;
    }

    public Integer getFirtPositionCode() {
        return firtPositionCode;
    }

    public void setFirtPositionCode(Integer firtPositionCode) {
        this.firtPositionCode = firtPositionCode;
    }


    public String getGlobalRiskCode() {
        return globalRiskCode;
    }

    public void setGlobalRiskCode(String globalRiskCode) {
        this.globalRiskCode = globalRiskCode;
    }

    public Integer getAccCode() {
        return accCode;
    }

    public void setAccCode(Integer accCode) {
        this.accCode = accCode;
    }

    public String getCardNum() {
        //return cardNum.replace(cardNum.substring(6), "xxxxxx"+cardNum.substring(12));
    	return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }



    public int getCardCode() {
        return cardCode;
    }

    public void setCardCode(int cardCode) {
        this.cardCode = cardCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getPreDate() {
        return preDate;
    }

    public void setPreDate(Date preDate) {
        this.preDate = preDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getPersoStatus() {
		return persoStatus;
	}

	public void setPersoStatus(Integer persoStatus) {
		this.persoStatus = persoStatus;
	}

	@Override
    public String toString() {
        return "Card{" +
                "cardCode=" + cardCode +
                ", expiryDate=" + expiryDate +
                ", startDate=" + startDate +
                ", preDate=" + preDate +
                ", cardNum='" + cardNum.replace(cardNum.substring(6), "xxxxxx"+cardNum.substring(12)) + '\'' +
                ", accCode=" + accCode +
                ", globalRiskCode='" + globalRiskCode + '\'' +
                ", currencyCode=" + currencyCode +
                ", cardStatusCode=" + cardStatusCode +
                ", thirdPositionCode=" + thirdPositionCode +
                ", secondPositionCode=" + secondPositionCode +
                ", firtPositionCode=" + firtPositionCode +
                ", productCode=" + productCode +
                '}';
    }

	public Set<ControlList> getControlLists() {
		return controlLists;
	}

	public void setControlLists(Set<ControlList> controlLists) {
		this.controlLists = controlLists;
	}

	public Integer getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(Integer typeCard) {
		this.typeCard = typeCard;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	public Boolean getIsFromMobile() {
		return isFromMobile;
	}

	public void setIsFromMobile(Boolean isFromMobile) {
		this.isFromMobile = isFromMobile;
	}

	public String getRequestCardId() {
		return requestCardId;
	}

	public void setRequestCardId(String requestCardId) {
		this.requestCardId = requestCardId;
	}

	public String getOldPvv() {
		return oldPvv;
	}

	public void setOldPvv(String oldPvv) {
		this.oldPvv = oldPvv;
	}

    
}
