package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_PREP", schema = "PORTEUR")
public class ProductPrepayer {
	 @Id
	  @Column(name = "CPP_CODE", nullable = false)
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "ProductPrepSequence")
	  @SequenceGenerator(name = "ProductPrepSequence", sequenceName = "PORTEUR.ProductPrepSequence", allocationSize = 1)
	  public int productCode;

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
	  @Column(name = "program_code")
	  private int program;
	  
	  
	  
	public int getProgram() {
		return program;
	}
	public void setProgram(int program) {
		this.program = program;
	}
	public ProductPrepayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductPrepayer(String libelle, int cpCommissionNew, int cpCommissionRemplacement, int cpCommissionPin,
			int cpCommissionAnniversary, int cpCommissionOpposition,int program) {
		super();
		this.libelle = libelle;
		this.cpCommissionNew = cpCommissionNew;
		this.cpCommissionRemplacement = cpCommissionRemplacement;
		this.cpCommissionPin = cpCommissionPin;
		this.cpCommissionAnniversary = cpCommissionAnniversary;
		this.cpCommissionOpposition = cpCommissionOpposition;
		this.program=program;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getCpCommissionNew() {
		return cpCommissionNew;
	}
	public void setCpCommissionNew(int cpCommissionNew) {
		this.cpCommissionNew = cpCommissionNew;
	}
	public int getCpCommissionRemplacement() {
		return cpCommissionRemplacement;
	}
	public void setCpCommissionRemplacement(int cpCommissionRemplacement) {
		this.cpCommissionRemplacement = cpCommissionRemplacement;
	}
	public int getCpCommissionPin() {
		return cpCommissionPin;
	}
	public void setCpCommissionPin(int cpCommissionPin) {
		this.cpCommissionPin = cpCommissionPin;
	}
	public int getCpCommissionAnniversary() {
		return cpCommissionAnniversary;
	}
	public void setCpCommissionAnniversary(int cpCommissionAnniversary) {
		this.cpCommissionAnniversary = cpCommissionAnniversary;
	}
	public int getCpCommissionOpposition() {
		return cpCommissionOpposition;
	}
	public void setCpCommissionOpposition(int cpCommissionOpposition) {
		this.cpCommissionOpposition = cpCommissionOpposition;
	}


	@Override
	public String toString() {
		return "ProductPrepayer{" +
				"productCode=" + productCode +
				", libelle='" + libelle + '\'' +
				", cpCommissionNew=" + cpCommissionNew +
				", cpCommissionRemplacement=" + cpCommissionRemplacement +
				", cpCommissionPin=" + cpCommissionPin +
				", cpCommissionAnniversary=" + cpCommissionAnniversary +
				", cpCommissionOpposition=" + cpCommissionOpposition +
				", program=" + program +
				'}';
	}
}
