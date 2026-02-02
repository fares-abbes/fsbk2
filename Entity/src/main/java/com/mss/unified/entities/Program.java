package com.mss.unified.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PROGRAM", schema = "PORTEUR")
public
class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ProgramSequence")
    @SequenceGenerator(name = "ProgramSequence", sequenceName = "PORTEUR.ProgramSequence", allocationSize = 1)
    @Column(name = "CPR_CODE", nullable = false)

    private Integer programCode;
    @Column(name = "CPR_LIBELLE")
    private String libelle;

    @Column(name = "CPR_LIFE_CYCLE")
    private int cprLifeCycle;

    @Column(name = "CPR_RENEWEL")
    private boolean cprRenewl;

    @Column(name = "CPR_CONTACTLESS")
    private boolean cprContacless;

    @Column(name = "CPR_CHIP")
    private boolean cprChip;

    @Column(name = "CPR_TR_RISK_AMOUNT_MIN")
    private int cprRiskAmountMin;

    @Column(name = "CPR_TR_RISK_AMOUNT_MAX")
    private int cprRiskAmountMax;

    @Column(name = "CPR_RISK_AMOUNT")
    private int cprRiskAmount;
    @Column(name = "CVR")
    private Integer cvr;
    @Column(name = "TVR")
    private Integer tvr;

    private Date startDate;
    @Column(name = "BOU_CODE")
    private int binOnUsCode;



    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    @JoinTable(name = "ACTION_CONTROL", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "CPR_CODE"),
            inverseJoinColumns = @JoinColumn(name = "CONTROL_NUM"))
    private Set<ControlList> controlLists = new HashSet<>();



    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(name = "TRANS_ALLOWED", schema = "ATM",
            joinColumns = @JoinColumn(name = "CPR_CODE"),
            inverseJoinColumns = @JoinColumn(name = "CODE_TRANS"))
        private Set<EmvServiceValues> emvServiceValues = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(name = "TypesPosEntryActivated", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "CodeProgram"),
            inverseJoinColumns = @JoinColumn(name = "PosEntryModeType"))
    private Set<PosEntryModeTypes> posEntryModeTypes = new HashSet<>();

    @Column(name = "risk_periodicity")
    public int riskPeriodicity;
    public int firstPosition;
    public int secondPosition;
    public int thirdPosition;
    @JsonProperty("GlNumber")
    public int glNumber;
    
    private String cmsCardType;
    private String cardvisualCode;
    @Column(columnDefinition = "integer default 0")
    private int daysNumberBeforeObliterate;
    
    @Column(columnDefinition = "VARCHAR(3) default '012'")
    private String currency;
    
    public int getDaysNumberBeforeObliterate() {
		return daysNumberBeforeObliterate;
	}


	public void setDaysNumberBeforeObliterate(int daysNumberBeforeObliterate) {
		this.daysNumberBeforeObliterate = daysNumberBeforeObliterate;
	}


	public String getCardvisualCode() {
		return cardvisualCode;
	}


	public void setCardvisualCode(String cardvisualCode) {
		this.cardvisualCode = cardvisualCode;
	}


	public String getCmsCardType() {
		return cmsCardType;
	}


	public void setCmsCardType(String cmsCardType) {
		this.cmsCardType = cmsCardType;
	}



	@ManyToMany(fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(name = "ProgramCountriesControl", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "CodeProgram"),
            inverseJoinColumns = @JoinColumn(name = "Country"))
    private Set<Country> countriesControl = new HashSet<>();
    
    
    
    public Program(String libelle, int cprLifeCycle, boolean cprRenewl, boolean cprContacless,
                   boolean cprChip, int cprRiskAmountMin, int cprRiskAmountMax, int cprRiskAmount,
                   int binOnUsCode, int riskPeriodicity, int firstPosition, int SecondPosition, int ThirdPosition, int GlNumber, Date StartDate) {
        this.libelle = libelle;
        this.cprLifeCycle = cprLifeCycle;
        this.cprRenewl = cprRenewl;
        this.cprContacless = cprContacless;
        this.cprChip = cprChip;
        this.cprRiskAmountMin = cprRiskAmountMin;
        this.cprRiskAmountMax = cprRiskAmountMax;
        this.cprRiskAmount = cprRiskAmount;
        this.binOnUsCode = binOnUsCode;
        this.riskPeriodicity = riskPeriodicity;
        this.firstPosition = firstPosition;
        this.secondPosition = SecondPosition;
        this.thirdPosition = ThirdPosition;
        this.glNumber = GlNumber;
        this.startDate = StartDate;
    }


    public Set<Country> getCountriesControl() {
		return countriesControl;
	}


	public void setCountriesControl(Set<Country> countriesControl) {
		this.countriesControl = countriesControl;
	}


	public Integer getCvr() {
        return cvr;
    }

    public void setCvr(Integer cvr) {
        this.cvr = cvr;
    }

    public Integer getTvr() {
        return tvr;
    }

    public void setTvr(Integer tvr) {
        this.tvr = tvr;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getGlNumber() {
        return glNumber;
    }

    public void setGlNumber(int glNumber) {
    	this.glNumber = glNumber;
    }

    public Program() {
    }

    public Integer getProgramCode() {
        return programCode;
    }

    public void setProgramCode(Integer programCode) {
        this.programCode = programCode;
    }


    public int getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(int firstPosition) {
        this.firstPosition = firstPosition;
    }

    public int getSecondPosition() {
        return secondPosition;
    }

    public void setSecondPosition(int secondPosition) {
        this.secondPosition = secondPosition;
    }

    public int getThirdPosition() {
        return thirdPosition;
    }

    public void setThirdPosition(int thirdPosition) {
        this.thirdPosition = thirdPosition;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCprLifeCycle() {
        return cprLifeCycle;
    }

    public void setCprLifeCycle(int cprLifeCycle) {
        this.cprLifeCycle = cprLifeCycle;
    }

    public boolean isCprRenewl() {
        return cprRenewl;
    }

    public void setCprRenewl(boolean cprRenewl) {
        this.cprRenewl = cprRenewl;
    }

    public boolean isCprContacless() {
        return cprContacless;
    }

    public void setCprContacless(boolean cprContacless) {
        this.cprContacless = cprContacless;
    }

    public boolean isCprChip() {
        return cprChip;
    }

    public void setCprChip(boolean cprChip) {
        this.cprChip = cprChip;
    }

    public int getCprRiskAmountMin() {
        return cprRiskAmountMin;
    }

    public void setCprRiskAmountMin(int cprRiskAmountMin) {
        this.cprRiskAmountMin = cprRiskAmountMin;
    }

    public int getCprRiskAmountMax() {
        return cprRiskAmountMax;
    }

    public void setCprRiskAmountMax(int cprRiskAmountMax) {
        this.cprRiskAmountMax = cprRiskAmountMax;
    }

    public int getCprRiskAmount() {
        return cprRiskAmount;
    }

    public void setCprRiskAmount(int cprRiskAmount) {
        this.cprRiskAmount = cprRiskAmount;
    }


    public int getBinOnUsCode() {
        return binOnUsCode;
    }

    public void setBinOnUsCode(int binOnUsCode) {
        this.binOnUsCode = binOnUsCode;
    }

    public Set<ControlList> getControlLists() {
        return controlLists;
    }

    public void setControlLists(Set<ControlList> controlLists) {
        this.controlLists = controlLists;
    }

    public Set<EmvServiceValues> getEmvServiceValues() {
        return emvServiceValues;
    }

    public void setEmvServiceValues(
            Set<EmvServiceValues> emvServiceValues) {
        this.emvServiceValues = emvServiceValues;
    }

    public Set<PosEntryModeTypes> getPosEntryModeTypes() {
        return posEntryModeTypes;
    }

    public void setPosEntryModeTypes(Set<PosEntryModeTypes> posEntryModeTypes) {
        this.posEntryModeTypes = posEntryModeTypes;
    }

    public int getRiskPeriodicity() {
        return riskPeriodicity;
    }



    public void setRiskPeriodicity(int riskPeriodicity) {
        this.riskPeriodicity = riskPeriodicity;
    }



    public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	@Override
    public String toString() {
        return "Program{" +
                "programCode=" + programCode +
                ", libelle='" + libelle + '\'' +
                ", cprLifeCycle=" + cprLifeCycle +
                ", cprRenewl=" + cprRenewl +
                ", cprContacless=" + cprContacless +
                ", cprChip=" + cprChip +
                ", cprRiskAmountMin=" + cprRiskAmountMin +
                ", cprRiskAmountMax=" + cprRiskAmountMax +
                ", cprRiskAmount=" + cprRiskAmount +
                ", StartDate=" + startDate +
                ", binOnUsCode=" + binOnUsCode +
                ", controlLists=" + controlLists +
                ", emvServiceValues=" + emvServiceValues +
                ", cprRismNumber=" + riskPeriodicity +
                ", firstPosition=" + firstPosition +
                ", SecondPosition=" + secondPosition +
                ", ThirdPosition=" + thirdPosition +
                ", GlNumber=" + glNumber +
                '}';
    }
}
