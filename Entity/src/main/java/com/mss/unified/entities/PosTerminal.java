package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Entity
@Table(name = "PosTerminal", schema = "POS")
public class PosTerminal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosTerminalSequence")
	@SequenceGenerator(name = "PosTerminalSequence", sequenceName = "POS.PosTerminalSequence", allocationSize = 1)
	@Column(name = "POS_CODE")
	@JsonProperty("POS_CODE")
	private int posCode;

	@Column(name = "POS_NUM")
	@JsonProperty("POS_NUM")
	private String posNum;

	@Column(name = "POS_LIBELLE")
	@JsonProperty("POS_LIBELLE")
	private String posLibelle;

	@Column(name = "POS_LOCATION")
	@JsonProperty("POS_LOCATION")
	private String posLocation;

	@Column(name = "CITY")
	@JsonProperty("CITY")
	private String city;

	@Column(name = "STATE")
	@JsonProperty("STATE")
	private String state;

	@Column(name = "COUNTRY")
	@JsonProperty("COUNTRY")
	private String country;

	@Column(name = "PHONE")
	@JsonProperty("PHONE")
	private String phone;

	@Column(name = "TERMINAL_OWNER")
	@JsonProperty("TERMINAL_OWNER")
	private String terminalOwner;

	@Column(name = "SERVICE_REP_INFO")
	@JsonProperty("SERVICE_REP_INFO")
	private String serviceRepInfo;

	@Column(name = "TPK_KEY")
	@JsonProperty("TPK_KEY")
	private String tpkKey;

	@Column(name = "MAC_KEY")
	@JsonProperty("MAC_KEY")
	private String macKey;

	@Column(name = "PIN_PAD_CHARACTER")
	@JsonProperty("PIN_PAD_CHARACTER")
	private String pinPadCharacter;

	@Column(name = "TMK_KEY")
	@JsonProperty("TMK_KEY")
	private String tmkKey;

	@Column(name = "REFERRAL_TEL")
	@JsonProperty("REFERRAL_TEL")
	private String referralTel;

	@Column(name = "RETAILER_ID")
	@JsonProperty("RETAILER_ID")

	private String retailerId;
	@Column(name = "POS_CURRENCY")
	@JsonProperty("POS_CURRENCY")

	private String posCurrency;
	@Column(name = "CREATION_DATE")
	@JsonProperty("CREATION_DATE")
	private Date creationDate;
	
	@Column(name = "SERIAL_NUM")
	private String serialNum;
	
	@Column(name = "TYPE_TERMINAL")
	private String typeTerminal;

	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "STATUS_UPDATE")
	private String statusUpdtae;
	@Column(name = "STATUS_SUPPRESSION")
	private String statusSup;
	
	 @Column(name = "STATU_SERIAL")
		private String statuSerial;
	 
	 @Column(name = "FILE_TS")
		private String fileTS;
	 
	 @Column(name = "FILE_TM")
		private String fileTM;
	 
	 
	 @Column(name = "DETAIL_SUPP")
		private String detailSupp;
	 
	 @Column(name = "DETAIL_UPDATE")
		private String detailUpdate;
	@Column(name = "ADRESSE")
	@JsonProperty("ADRESSE")
	private String adresse;
//private int POS_STAT_CODE;
	@Column(name = "POS_STAT_CODE")
	@JsonProperty("POS_STAT_CODE")
	private Integer posStatusCode;

	@ManyToOne
	private PosServiceConf posServiceConf;

	@ManyToOne
	private PosLimitsConf posLimitsConf;

	@ManyToOne
	private PosAllowedTransConf posAllowedTransConf;

	@ManyToOne
	private PosBinConf pbcBinConf;

	@ManyToOne
	private Merchant merchantCode;

	@ManyToOne
	private MccList mccCode;
	
	 @Column(name = "NOM_CONTACT")
	    private String nomC;
	    
	    @Column(name = "TYPE_CONTACT")
	    private String typeC;
	    
	    @Column(name = "TITLE_CONTACT")
	    private String titleC;
	
	    @Column(name = "COMMUNE")
		private String commune;
	    
	    @Column(name = "WEB_SITE")
	    private String siteWeb;
	    @Column(name = "DAIRA")
	   	private String daira;

	    @Column(name = "CODE_ZIP")
	   	private String codeZip;
	    
	    @Column(name = "AGENCE")
	   	private String agence;
	    @Column(name = "FAMILLE_POS_CODE")
	    private int famillePosCode;
	    
	    @Column(name = "TYPE")
	    private int type;
	    
	    
	    @Column(name = "Genration_TM")
	   	private String generationTM;
	    
	    @Column(name = "MONTANT_LOYER")
	    private String montantLoyer;
	    
	    @Column(name = "EMAIL_CHARGE")
	    private String emailCharge;
	    
	    
	    
		public String getEmailCharge() {
			return emailCharge;
		}

		public void setEmailCharge(String emailCharge) {
			this.emailCharge = emailCharge;
		}

		public String getMontantLoyer() {
			return montantLoyer;
		}

		public void setMontantLoyer(String montantLoyer) {
			this.montantLoyer = montantLoyer;
		}

		public String getGenerationTM() {
			return generationTM;
		}

		public void setGenerationTM(String generationTM) {
			this.generationTM = generationTM;
		}

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getFamillePosCode() {
			return famillePosCode;
		}

		public void setFamillePosCode(int famillePosCode) {
			this.famillePosCode = famillePosCode;
		}

		public String getAgence() {
			return agence;
		}

		public void setAgence(String agence) {
			this.agence = agence;
		}

		public String getFileTM() {
			return fileTM;
		}

		public void setFileTM(String fileTM) {
			this.fileTM = fileTM;
		}

		public String getCodeZip() {
			return codeZip;
		}

		public void setCodeZip(String codeZip) {
			this.codeZip = codeZip;
		}

		public String getDaira() {
			return daira;
		}

		public void setDaira(String daira) {
			this.daira = daira;
		}
	    
	    
	public String getSiteWeb() {
			return siteWeb;
		}

		public void setSiteWeb(String siteWeb) {
			this.siteWeb = siteWeb;
		}

	public String getFileTS() {
			return fileTS;
		}

		public void setFileTS(String fileTS) {
			this.fileTS = fileTS;
		}

	public String getDetailUpdate() {
			return detailUpdate;
		}

		public void setDetailUpdate(String detailUpdate) {
			this.detailUpdate = detailUpdate;
		}

	public String getStatuSerial() {
			return statuSerial;
		}

		public void setStatuSerial(String statuSerial) {
			this.statuSerial = statuSerial;
		}

		public String getDetailSupp() {
			return detailSupp;
		}

		public void setDetailSupp(String detailSupp) {
			this.detailSupp = detailSupp;
		}

	public String getCommune() {
			return commune;
		}

		public void setCommune(String commune) {
			this.commune = commune;
		}

	public String getStatusSup() {
			return statusSup;
		}

		public void setStatusSup(String statusSup) {
			this.statusSup = statusSup;
		}

	public String getStatusUpdtae() {
			return statusUpdtae;
		}

		public void setStatusUpdtae(String statusUpdtae) {
			this.statusUpdtae = statusUpdtae;
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

	public String getTypeTerminal() {
		return typeTerminal;
	}

	public void setTypeTerminal(String typeTerminal) {
		this.typeTerminal = typeTerminal;
	}

	public PosTerminal(String posLibelle, String posLocation, String city, String state, String country, String phone, String terminalOwner, String referralTel, Date creationDate, String adresse) {
		this.posLibelle = posLibelle;
		this.posLocation = posLocation;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
		this.terminalOwner = terminalOwner;
		this.referralTel = referralTel;
		this.creationDate = creationDate;
		this.adresse = adresse;
	}

	public int getPosCode() {
		return posCode;
	}

	public void setPosCode(int posCode) {
		this.posCode = posCode;
	}

	public String getPosNum() {
		return posNum;
	}

	public void setPosNum(String posNum) {
		this.posNum = posNum;
	}

	public String getPosLibelle() {
		return posLibelle;
	}

	public void setPosLibelle(String posLibelle) {
		this.posLibelle = posLibelle;
	}

	public String getPosLocation() {
		return posLocation;
	}

	public void setPosLocation(String posLocation) {
		this.posLocation = posLocation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTerminalOwner() {
		return terminalOwner;
	}

	public void setTerminalOwner(String terminalOwner) {
		this.terminalOwner = terminalOwner;
	}

	public String getServiceRepInfo() {
		return serviceRepInfo;
	}

	public void setServiceRepInfo(String serviceRepInfo) {
		this.serviceRepInfo = serviceRepInfo;
	}

	public String getTpkKey() {
		return tpkKey;
	}

	public void setTpkKey(String tpkKey) {
		this.tpkKey = tpkKey;
	}

	public String getMacKey() {
		return macKey;
	}

	public void setMacKey(String macKey) {
		this.macKey = macKey;
	}

	public String getPinPadCharacter() {
		return pinPadCharacter;
	}

	public void setPinPadCharacter(String pinPadCharacter) {
		this.pinPadCharacter = pinPadCharacter;
	}

	public String getTmkKey() {
		return tmkKey;
	}

	public void setTmkKey(String tmkKey) {
		this.tmkKey = tmkKey;
	}

	public String getReferralTel() {
		return referralTel;
	}

	public void setReferralTel(String referralTel) {
		this.referralTel = referralTel;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getPosCurrency() {
		return posCurrency;
	}

	public void setPosCurrency(String posCurrency) {
		this.posCurrency = posCurrency;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public PosServiceConf getPosServiceConf() {
		return posServiceConf;
	}

	public void setPosServiceConf(PosServiceConf posServiceConf) {
		this.posServiceConf = posServiceConf;
	}

	public PosLimitsConf getPosLimitsConf() {
		return posLimitsConf;
	}

	public void setPosLimitsConf(PosLimitsConf posLimitsConf) {
		this.posLimitsConf = posLimitsConf;
	}

	public PosAllowedTransConf getPosAllowedTransConf() {
		return posAllowedTransConf;
	}

	public void setPosAllowedTransConf(PosAllowedTransConf posAllowedTransConf) {
		this.posAllowedTransConf = posAllowedTransConf;
	}

	public PosBinConf getPbcBinConf() {
		return pbcBinConf;
	}

	public void setPbcBinConf(PosBinConf pbcBinConf) {
		this.pbcBinConf = pbcBinConf;
	}

	public Merchant getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(Merchant merchantCode) {
		this.merchantCode = merchantCode;
	}

	public MccList getMccCode() {
		return mccCode;
	}

	public void setMccCode(MccList mccCode) {
		this.mccCode = mccCode;
	}

	public int getPosStatusCode() {
		return posStatusCode;
	}

	public void setPosStatusCode(Integer posStatusCode) {
		this.posStatusCode = posStatusCode;
	}
	
	

	

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public PosTerminal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PosTerminal [posCode=" + posCode + ", posNum=" + posNum + ", posLibelle=" + posLibelle
				+ ", posLocation=" + posLocation + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", phone=" + phone + ", terminalOwner=" + terminalOwner + ", serviceRepInfo=" + serviceRepInfo
				+ ", tpkKey=" + tpkKey + ", macKey=" + macKey + ", pinPadCharacter=" + pinPadCharacter + ", tmkKey="
				+ tmkKey + ", referralTel=" + referralTel + ", retailerId=" + retailerId + ", posCurrency="
				+ posCurrency + ", creationDate=" + creationDate + ", serialNum=" + serialNum + ", typeTerminal="
				+ typeTerminal + ", status=" + status + ", statusUpdtae=" + statusUpdtae + ", statusSup=" + statusSup
				+ ", statuSerial=" + statuSerial + ", fileTS=" + fileTS + ", fileTM=" + fileTM + ", detailSupp="
				+ detailSupp + ", detailUpdate=" + detailUpdate + ", adresse=" + adresse + ", posStatusCode="
				+ posStatusCode + ", posServiceConf=" + posServiceConf + ", posLimitsConf=" + posLimitsConf
				+ ", posAllowedTransConf=" + posAllowedTransConf + ", pbcBinConf=" + pbcBinConf + ", merchantCode="
				+ merchantCode + ", mccCode=" + mccCode + ", nomC=" + nomC + ", typeC=" + typeC + ", titleC=" + titleC
				+ ", commune=" + commune + ", siteWeb=" + siteWeb + ", daira=" + daira + ", codeZip=" + codeZip
				+ ", agence=" + agence + ", famillePosCode=" + famillePosCode + ", type=" + type + ", generationTM="
				+ generationTM + ", montantLoyer=" + montantLoyer + ", emailCharge=" + emailCharge + "]";
	}





}
