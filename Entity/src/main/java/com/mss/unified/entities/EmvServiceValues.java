package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "EMV_SEVRICE_VALUES",schema = "ATM")
public
class EmvServiceValues {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CODE_TRANS")
    private String codeTransaction;


    @Column(name = "LIBELLE_TRANS")
    private String libelle;

    @Column(name = "IDEN_CODE")
    private String idenCode;

    @Column(name = "FINANCIAL")
    private boolean financial;

  
    private boolean ecommerce;
    
    

    public boolean isEcommerce() {
		return ecommerce;
	}

	public void setEcommerce(boolean ecommerce) {
		this.ecommerce = ecommerce;
	}

	public boolean isFinancial() {
        return financial;
    }

    public void setFinancial(boolean financial) {
        this.financial = financial;
    }

    public String getIdenCode() {
        return idenCode;
    }

    public void setIdenCode(String idenCode) {
        this.idenCode = idenCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeTransaction() {
        return codeTransaction;
    }

    public void setCodeTransaction(String codeTransaction) {
        this.codeTransaction = codeTransaction;
    }

    @Override
    public String toString() {
        return "EmvServiceValues{" +
                "codeTransaction='" + codeTransaction + '\'' +
                ", libelle='" + libelle + '\'' +
                ", idenCode='" + idenCode + '\'' +
                ", financial=" + financial +
                '}';
    }
}
