package com.mss.unified.projection;

import javax.persistence.Column;
import java.util.Date;

public class MerchantAccountribDto {
    private Integer merchantCode;

    // Computed field: '0' concatenated with PORTEUR.account.acc_num where acc_code = merchant.account
    // Not saved to DB; populated by query
    private String accountrib;

    @Column(name = "MERSTAT_CODE")
    private String merchantStatus;

    @Column(name = "MERCHANT_ID")
    private String merchantId;

    @Column(name = "CONTRAT_ID")
    private String idContrat;

    @Column(name = "MERCHANT_LIBELLE")
    private String merchantLibelle;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CODE_ZIP")
    private String codeZip;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "COMMISSION_NATIONAL")
    private String commissionNational;

    @Column(name = "COMMISSION_INTERNATIONAL")
    private String commissionInternational;

    @Column(name = "account")
    private int account;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ISOFFSHORE")
    private Boolean offshore;

    @Column(name = "commission_type")
    private Integer commissionType;

    @Column(name = "STATUS_BM")
    private String statusBm;

    @Column(name = "STATUS_BS")
    private String statusBs;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "COMMUNE")
    private String commune;

    @Column(name = "DAIRA")
    private String daira;

    @Column(name = "CODE_WILAYA")
    private String codeWilaya;

    @Column(name = "NIF")
    private String nif;

    @Column(name = "RSO")
    private String rso;

    @Column(name = "RC")
    private String rc;

    @Column(name = "REVENUE")
    private String revenue;

    @Column(name = "MCC")
    private String mcc;

    @Column(name = "WEB_SITE")
    private String siteWeb;

    @Column(name = "DETAIL_RESILIATION")
    private String detailResiliation;

    // No-args constructor required for frameworks/serialization
    public MerchantAccountribDto() {}

    // All-args constructor used by JPQL constructor expression
    public MerchantAccountribDto(
            Integer merchantCode,
            String merchantStatus,
            String merchantId,
            String idContrat,
            String merchantLibelle,
            String city,
            String country,
            String codeZip,
            String phone,
            Date creationDate,
            String commissionNational,
            String commissionInternational,
            int account,
            String address,
            Boolean offshore,
            Integer commissionType,
            String statusBm,
            String statusBs,
            String email,
            String commune,
            String daira,
            String codeWilaya,
            String nif,
            String rso,
            String rc,
            String revenue,
            String mcc,
            String siteWeb,
            String detailResiliation,
            String accountrib
    ) {
        this.merchantCode = merchantCode;
        this.merchantStatus = merchantStatus;
        this.merchantId = merchantId;
        this.idContrat = idContrat;
        this.merchantLibelle = merchantLibelle;
        this.city = city;
        this.country = country;
        this.codeZip = codeZip;
        this.phone = phone;
        this.creationDate = creationDate;
        this.commissionNational = commissionNational;
        this.commissionInternational = commissionInternational;
        this.account = account;
        this.address = address;
        this.offshore = offshore;
        this.commissionType = commissionType;
        this.statusBm = statusBm;
        this.statusBs = statusBs;
        this.email = email;
        this.commune = commune;
        this.daira = daira;
        this.codeWilaya = codeWilaya;
        this.nif = nif;
        this.rso = rso;
        this.rc = rc;
        this.revenue = revenue;
        this.mcc = mcc;
        this.siteWeb = siteWeb;
        this.detailResiliation = detailResiliation;
        this.accountrib = accountrib;
    }

    public String getMerchantLibelle() {
        return merchantLibelle;
    }

    public void setMerchantLibelle(String merchantLibelle) {
        this.merchantLibelle = merchantLibelle;
    }

    public Integer getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(Integer merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getAccountrib() {
        return accountrib;
    }

    public void setAccountrib(String accountrib) {
        this.accountrib = accountrib;
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(String idContrat) {
        this.idContrat = idContrat;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCommissionNational() {
        return commissionNational;
    }

    public void setCommissionNational(String commissionNational) {
        this.commissionNational = commissionNational;
    }

    public String getCommissionInternational() {
        return commissionInternational;
    }

    public void setCommissionInternational(String commissionInternational) {
        this.commissionInternational = commissionInternational;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getOffshore() {
        return offshore;
    }

    public void setOffshore(Boolean offshore) {
        this.offshore = offshore;
    }

    public Integer getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Integer commissionType) {
        this.commissionType = commissionType;
    }

    public String getStatusBm() {
        return statusBm;
    }

    public void setStatusBm(String statusBm) {
        this.statusBm = statusBm;
    }

    public String getStatusBs() {
        return statusBs;
    }

    public void setStatusBs(String statusBs) {
        this.statusBs = statusBs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCodeWilaya() {
        return codeWilaya;
    }

    public void setCodeWilaya(String codeWilaya) {
        this.codeWilaya = codeWilaya;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getRso() {
        return rso;
    }

    public void setRso(String rso) {
        this.rso = rso;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getDetailResiliation() {
        return detailResiliation;
    }

    public void setDetailResiliation(String detailResiliation) {
        this.detailResiliation = detailResiliation;
    }
}
