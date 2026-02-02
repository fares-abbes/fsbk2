package com.mss.unified.entities;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;


import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRODUCT",schema = "PORTEUR")

public
class Product {
    @Id
    @Column(name = "CP_CODE", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productCode;

    @Column(name = "CP_LIBELLE")
    private String libelle;


    @Column(name = "CP_COMM_NEW")
    private int cpCommissionNew;

    @Column(name = "CP_COMM_REPL")
    private int cpCommissionRemplacement;

    @Column(name = "CP_COMM_PIN")
    private int cpCommissionPin;

    @Column(name = "CP_COMM_ANNI")
    private int cpCommissionAnniversary;

    @Column(name = "CP_OPP")
    private int cpCommissionOpposition;
    
    @Column(name = "CP_COMM_MODIF_PLAFOND")
    private Integer cpCommissionModifPlafond;
    
    @Column(name = "CP_CANCELATION")
    private Integer cpCancelation;
    
    @Column(name = "CP_CAPTURED_CARD")
    private Integer cpCapturedCard;
    
    @Column(name = "auto_validation")
    private int autoValidation;
    
    private Integer cpCommissionCreation;
    private Integer cpCommissionAnniversaryAndCreation;
    private String cpTypeCommissionAnniversary;
    
//    private String fsbkProductCode;

    public Integer getCpCommissionCreation() {
		return cpCommissionCreation;
	}

	public void setCpCommissionCreation(Integer cpCommissionCreation) {
		this.cpCommissionCreation = cpCommissionCreation;
	}

	public Integer getCpCommissionAnniversaryAndCreation() {
		return cpCommissionAnniversaryAndCreation;
	}

	public void setCpCommissionAnniversaryAndCreation(Integer cpCommissionAnniversaryAndCreation) {
		this.cpCommissionAnniversaryAndCreation = cpCommissionAnniversaryAndCreation;
	}

	public String getCpTypeCommissionAnniversary() {
		return cpTypeCommissionAnniversary;
	}

	public void setCpTypeCommissionAnniversary(String cpTypeCommissionAnniversary) {
		this.cpTypeCommissionAnniversary = cpTypeCommissionAnniversary;
	}

	@ManyToMany(fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(name = "PACK", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "CP_CODE"),
            inverseJoinColumns = @JoinColumn(name = "CPR_CODE"))
    private Set <Program > programs= new HashSet <>();
    
    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(name = "PRODUCT_ELIGIBLE_ACCOUNTS", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "CP_CODE"),
            inverseJoinColumns = @JoinColumn(name = "eligibleAccountCode"))
    private Set <EligibleAccount > eligibleAccounts= new HashSet <>();
   
    

    public Set<EligibleAccount> getEligibleAccounts() {
		return eligibleAccounts;
	}

	public void setEligibleAccounts(Set<EligibleAccount> eligibleAccounts) {
		this.eligibleAccounts = eligibleAccounts;
	}

	public Set < Program > getPrograms() {

        return programs;
    }

    public int getAutoValidation() {
		return autoValidation;
	}

	public void setAutoValidation(int autoValidation) {
		this.autoValidation = autoValidation;
	}

	public void setPrograms(Set<Program> programs) {
        this.programs = programs;
    }

    public
    Product() {
    }

    public
    int getProductCode() {
        return productCode;
    }

    public
    void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public
    String getLibelle() {
        return libelle;
    }

    public
    void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public
    int getCpCommissionNew() {
        return cpCommissionNew;
    }

    public
    void setCpCommissionNew(int cpCommissionNew) {
        this.cpCommissionNew = cpCommissionNew;
    }

    public
    int getCpCommissionRemplacement() {
        return cpCommissionRemplacement;
    }

    public
    void setCpCommissionRemplacement(int cpCommissionRemplacement) {
        this.cpCommissionRemplacement = cpCommissionRemplacement;
    }

    public
    int getCpCommissionPin() {
        return cpCommissionPin;
    }

    public
    void setCpCommissionPin(int cpCommissionPin) {
        this.cpCommissionPin = cpCommissionPin;
    }

    public
    int getCpCommissionAnniversary() {
        return cpCommissionAnniversary;
    }

    public
    void setCpCommissionAnniversary(int cpCommissionAnniversary) {
        this.cpCommissionAnniversary = cpCommissionAnniversary;
    }

    public
    int getCpCommissionOpposition() {
        return cpCommissionOpposition;
    }

    public
    void setCpCommissionOpposition(int cpCommissionOpposition) {
        this.cpCommissionOpposition = cpCommissionOpposition;
    }

    public
    Product(String libelle , int cpCommissionNew , int cpCommissionRemplacement , int cpCommissionPin ,
    		int cpCommissionAnniversary , int cpCommissionOpposition) {
        this.libelle = libelle;
        this.cpCommissionNew = cpCommissionNew;
        this.cpCommissionRemplacement = cpCommissionRemplacement;
        this.cpCommissionPin = cpCommissionPin;
        this.cpCommissionAnniversary = cpCommissionAnniversary;
        this.cpCommissionOpposition = cpCommissionOpposition;
    }

    

	public Integer getCpCommissionModifPlafond() {
		return cpCommissionModifPlafond;
	}

	public void setCpCommissionModifPlafond(Integer cpCommissionModifPlafond) {
		this.cpCommissionModifPlafond = cpCommissionModifPlafond;
	}
	
	

	public Product(String libelle, int cpCommissionNew, int cpCommissionRemplacement, int cpCommissionPin,
			int cpCommissionAnniversary, int cpCommissionOpposition, Integer cpCommissionModifPlafond,
			Integer cpCancelation,Integer cpCapturedCard, int autoValidation,
			Integer cpCommissionCreation,Integer cpCommissionAnniversaryAndCreation,String cpTypeCommissionAnniversary
			//,String fsbkProductCode
			) {
		super();
		this.libelle = libelle;
		this.cpCommissionNew = cpCommissionNew;
		this.cpCommissionRemplacement = cpCommissionRemplacement;
		this.cpCommissionPin = cpCommissionPin;
		this.cpCommissionAnniversary = cpCommissionAnniversary;
		this.cpCommissionOpposition = cpCommissionOpposition;
		this.cpCommissionModifPlafond = cpCommissionModifPlafond;
		this.cpCancelation=cpCancelation;
		this.cpCapturedCard=cpCapturedCard;
		this.autoValidation=autoValidation;
		this.cpCommissionCreation=cpCommissionCreation;
		this.cpCommissionAnniversaryAndCreation=cpCommissionAnniversaryAndCreation;
		this.cpTypeCommissionAnniversary=cpTypeCommissionAnniversary;
//		this.fsbkProductCode=fsbkProductCode;

	}

	public Integer getCpCancelation() {
		return cpCancelation;
	}

	public void setCpCancelation(Integer cpCancelation) {
		this.cpCancelation = cpCancelation;
	}

	public Integer getCpCapturedCard() {
		return cpCapturedCard;
	}

	public void setCpCapturedCard(Integer cpCapturedCard) {
		this.cpCapturedCard = cpCapturedCard;
	}

//	public String getFsbkProductCode() {
//		return fsbkProductCode;
//	}
//
//	public void setFsbkProductCode(String fsbkProductCode) {
//		this.fsbkProductCode = fsbkProductCode;
//	}

    
}
