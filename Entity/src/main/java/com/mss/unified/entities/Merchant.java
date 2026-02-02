package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MERCHANT",schema = "POS")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "MerchantSequence")
    @SequenceGenerator(name = "MerchantSequence", sequenceName = "POS.MerchantSequence", allocationSize = 1)
    @Column(name = "MERCHANT_CODE", nullable = false)
    private Integer merchantCode;

    // Computed field: '0' concatenated with PORTEUR.account.acc_num where acc_code = merchant.account
    // Not saved to DB; populated on load
    @Transient
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
    
    
    

  /*@ManyToMany(fetch = FetchType.LAZY)
  @Cascade(CascadeType.ALL)
  @JoinTable(name = "merchant_pos", schema = "POS",
      joinColumns = @JoinColumn(name = "MERCHANT_ID"),
      inverseJoinColumns = @JoinColumn(name = "pOS_ID"))
  private Set<PosTerminal> posTerminals = new HashSet<>();*/



	public String getDetailResiliation() {
		return detailResiliation;
	}

	public void setDetailResiliation(String detailResiliation) {
		this.detailResiliation = detailResiliation;
	}

	public String getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(String idContrat) {
		this.idContrat = idContrat;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
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

	public String getCodeWilaya() {
		return codeWilaya;
	}

	public void setCodeWilaya(String codeWilaya) {
		this.codeWilaya = codeWilaya;
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

	public Boolean getOffshore() {
		return offshore;
	}

	public void setOffshore(Boolean offshore) {
		this.offshore = offshore;
	}

	@OneToMany(mappedBy = "merchantCode", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<PosTerminal> PosTerminal = new HashSet<>();


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

    public Merchant(String merchantStatus, String merchantId, String merchantLibelle,
                    String city, String country, String codeZip, String phone,Date creationDate,String address) {
        this.merchantStatus = merchantStatus;
        this.merchantId = merchantId;
        this.merchantLibelle = merchantLibelle;
        this.city = city;
        this.country = country;
        this.codeZip = codeZip;
        this.phone = phone;
        this.creationDate=creationDate;
        this.address=address;
    }

    public Merchant() {
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public Merchant(String merchantId, String merchantLibelle) {

        this.merchantId = merchantId;
        this.merchantLibelle = merchantLibelle;
    }

    public Integer getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(Integer merchantCode) {
        this.merchantCode = merchantCode;
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

    public String getMerchantLibelle() {
        return merchantLibelle;
    }

    public void setMerchantLibelle(String merchantLibelle) {
        this.merchantLibelle = merchantLibelle;
    }

    public Set<PosTerminal> getPOS_TERMINAL() {
        return PosTerminal;
    }

    public void setPOS_TERMINAL(Set<PosTerminal> pOS_TERMINAL) {
        PosTerminal = pOS_TERMINAL;
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

	@Override
	public String toString() {
		return "Merchant [merchantCode=" + merchantCode + ", merchantStatus=" + merchantStatus + ", merchantId="
				+ merchantId + ", idContrat=" + idContrat + ", merchantLibelle=" + merchantLibelle + ", city=" + city
				+ ", country=" + country + ", codeZip=" + codeZip + ", phone=" + phone + ", creationDate="
				+ creationDate + ", commissionNational=" + commissionNational + ", commissionInternational="
				+ commissionInternational + ", account=" + account + ", address=" + address + ", offshore=" + offshore
				+ ", commissionType=" + commissionType + ", statusBm=" + statusBm + ", statusBs=" + statusBs
				+ ", email=" + email + ", commune=" + commune + ", daira=" + daira + ", codeWilaya=" + codeWilaya
				+ ", nif=" + nif + ", rso=" + rso + ", rc=" + rc + ", revenue=" + revenue + ", mcc=" + mcc
				+ ", siteWeb=" + siteWeb + ", detailResiliation=" + detailResiliation + "]";
	}




	

	
	
	


	


}
