package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name = "Request_Card", schema = "PORTEUR")
public class RequestCard {
	
	@Id
	@Column(name = "CODE", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "RequestCardSequence")
    @SequenceGenerator(name = "RequestCardSequence", sequenceName = "PORTEUR.RequestCardSequence", allocationSize = 1)
	private   int code;
	private String accountNumber;
	private String accountNumberAttached;
	private String userName;
	private String city;
	private String country;
	private String zipCode;
	private String phone;
	private String nameInCard;
	private int cardStatus;
	private String creationDate;
	private String cin;
	private int product;
	@Column(name = "IdentificationType")
	@JsonProperty("IdentificationType")
	private int identificationType;
	@Column(name = "CustomerStatus")
	@JsonProperty("CustomerStatus")
	private int customerStatus;
	@Column(name = "AccountStatus")
	@JsonProperty("AccountStatus")
	private int accountStatus;
	@JsonProperty("Address")
	@Column(name = "Address")
	private String address;
	private String currency;
	private String accountAttachedCurrency;

	private Integer requestStatus;
    private Integer idAgence;
    private Integer preValidation;
    private String motifRejet;
    private String gender;
    private String lastName;
    private String firstName;
    private String girlName;
    private String birthDate;
    private String birthPlace;
    private String email;
    private String homePhone;
    private int ceilingsModificationRequest;
	private int newCprRiskAmount;
	private int newGlNumber;
	private int newCprRiskAmountMin;
	private int newCprRiskAmountMax;
    private int ceilingsModificationResponse;
    
    private String epaymentphone;
   
    private String radical;
    @Column(columnDefinition = "integer default 0")
    private int newCprPurchaseMax;
    @Column(columnDefinition = "integer default 0")
	private int newCprWithdrawalMax;
    @Column(columnDefinition = "integer default 0")
    private int income;
    @Column(columnDefinition = "integer default 0")
  	private int newCprEcommerceMax;
    
    private String raisonSocial;
    private String siegeSocial;
    private String capital;
    private String registreDeCommerce;
    private String etablieLe;
    private String etabliePar;
    private String codeNif;
    private String representeePar;
    
    private Boolean isFromMobile;

    
	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public String getSiegeSocial() {
		return siegeSocial;
	}

	public void setSiegeSocial(String siegeSocial) {
		this.siegeSocial = siegeSocial;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegistreDeCommerce() {
		return registreDeCommerce;
	}

	public void setRegistreDeCommerce(String registreDeCommerce) {
		this.registreDeCommerce = registreDeCommerce;
	}

	public String getEtablieLe() {
		return etablieLe;
	}

	public void setEtablieLe(String etablieLe) {
		this.etablieLe = etablieLe;
	}

	public String getEtabliePar() {
		return etabliePar;
	}

	public void setEtabliePar(String etabliePar) {
		this.etabliePar = etabliePar;
	}

	public String getCodeNif() {
		return codeNif;
	}

	public void setCodeNif(String codeNif) {
		this.codeNif = codeNif;
	}

	public String getRepresenteePar() {
		return representeePar;
	}

	public void setRepresenteePar(String representeePar) {
		this.representeePar = representeePar;
	}

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	public int getNewCprEcommerceMax() {
		return newCprEcommerceMax;
	}

	public void setNewCprEcommerceMax(int newCprEcommerceMax) {
		this.newCprEcommerceMax = newCprEcommerceMax;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getEpaymentphone() {
		return epaymentphone;
	}

	public void setEpaymentphone(String epaymentphone) {
		this.epaymentphone = epaymentphone;
	}

	public int getNewCprPurchaseMax() {
		return newCprPurchaseMax;
	}

	public void setNewCprPurchaseMax(int newCprPurchaseMax) {
		this.newCprPurchaseMax = newCprPurchaseMax;
	}

	public int getNewCprWithdrawalMax() {
		return newCprWithdrawalMax;
	}

	public void setNewCprWithdrawalMax(int newCprWithdrawalMax) {
		this.newCprWithdrawalMax = newCprWithdrawalMax;
	}

	public int getCeilingsModificationRequest() {
		return ceilingsModificationRequest;
	}

	public void setCeilingsModificationRequest(int ceilingsModificationRequest) {
		this.ceilingsModificationRequest = ceilingsModificationRequest;
	}

	public int getCeilingsModificationResponse() {
		return ceilingsModificationResponse;
	}

	public void setCeilingsModificationResponse(int ceilingsModificationResponse) {
		this.ceilingsModificationResponse = ceilingsModificationResponse;
	}

	public int getNewCprRiskAmount() {
		return newCprRiskAmount;
	}

	public void setNewCprRiskAmount(int newCprRiskAmount) {
		this.newCprRiskAmount = newCprRiskAmount;
	}

	public int getNewGlNumber() {
		return newGlNumber;
	}

	public void setNewGlNumber(int newGlNumber) {
		this.newGlNumber = newGlNumber;
	}

	public int getNewCprRiskAmountMin() {
		return newCprRiskAmountMin;
	}

	public void setNewCprRiskAmountMin(int newCprRiskAmountMin) {
		this.newCprRiskAmountMin = newCprRiskAmountMin;
	}

	public int getNewCprRiskAmountMax() {
		return newCprRiskAmountMax;
	}

	public void setNewCprRiskAmountMax(int newCprRiskAmountMax) {
		this.newCprRiskAmountMax = newCprRiskAmountMax;
	}

	public String getGirlName() {
		return girlName;
	}

	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getPreValidation() {
		return preValidation;
	}

	public void setPreValidation(Integer preValidation) {
		this.preValidation = preValidation;
	}

	public String getMotifRejet() {
		return motifRejet;
	}

	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public String getNameInCard() {
		return nameInCard;
	}

	public void setNameInCard(String nameInCard) {
		this.nameInCard = nameInCard;
	}

	public int getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(int cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(int identificationType) {
		this.identificationType = identificationType;
	}

	public int getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(int customerStatus) {
		this.customerStatus = customerStatus;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(Integer requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Integer getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Integer idAgence) {
		this.idAgence = idAgence;
	}

	public Boolean getIsFromMobile() {
		return isFromMobile;
	}

	public void setIsFromMobile(Boolean isFromMobile) {
		this.isFromMobile = isFromMobile;
	}

	public String getAccountNumberAttached() {
		return accountNumberAttached;
	}

	public void setAccountNumberAttached(String accountNumberAttached) {
		this.accountNumberAttached = accountNumberAttached;
	}

	public String getAccountAttachedCurrency() {
		return accountAttachedCurrency;
	}

	public void setAccountAttachedCurrency(String accountAttachedCurrency) {
		this.accountAttachedCurrency = accountAttachedCurrency;
	}

	
}
