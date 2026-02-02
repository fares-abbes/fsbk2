package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "Demande_Action", schema = "PORTEUR")
public class DemandeAction {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DemandeActionSequence")
    @SequenceGenerator(name = "DemandeActionSequence", sequenceName = "PORTEUR.DemandeActionSequence", allocationSize = 1)
    @Column(name = "DEMANDE_CODE", nullable = false)
	private int demandeCode;
	
	@Column(name = "CAR_NUM")
	private String cardNum;
	
	@Column(name = "DEMANDE_TYPE")
	private Integer demandeType;
	
	@Column(name = "DEMANDE_STATUS_CODE")
	private Integer demandeStatusCode;
	
	@Column(name = "MOTIF_OPPOSITION")
	private Integer motifOpposition;
		
	@Column(name = "MOTIF_BLOCK")
	private String motifBlock;
	
	@Column(name = "BLOCK_BY")
	private String blockBy;
	

	
	private Date dateDemande;
	
	private String branchCode;
	private String addedBy;
	
	@Column(name = "WITH_REMPLACEMENT")
	private String withReplacement;
	
	@Column(name = "MOTIF_ANNULATION")
	private String motifAnnulation;
	private String remplacementReason;
	private String nameInCard;
	
	private String accountNumber;
	private String motifDeactivateAccount;

	
	
	public String getMotifDeactivateAccount() {
		return motifDeactivateAccount;
	}

	public void setMotifDeactivateAccount(String motifDeactivateAccount) {
		this.motifDeactivateAccount = motifDeactivateAccount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getRemplacementReason() {
		return remplacementReason;
	}

	public void setRemplacementReason(String remplacementReason) {
		this.remplacementReason = remplacementReason;
	}

	public String getNameInCard() {
		return nameInCard;
	}

	public void setNameInCard(String nameInCard) {
		this.nameInCard = nameInCard;
	}



	public String getMotifAnnulation() {
		return motifAnnulation;
	}

	public void setMotifAnnulation(String motifAnnulation) {
		this.motifAnnulation = motifAnnulation;
	}

	public String getWithReplacement() {
		return withReplacement;
	}

	public void setWithReplacement(String withReplacement) {
		this.withReplacement = withReplacement;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}



	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getMotifBlock() {
		return motifBlock;
	}

	public void setMotifBlock(String motifBlock) {
		this.motifBlock = motifBlock;
	}

	public String getBlockBy() {
		return blockBy;
	}

	public void setBlockBy(String blockBy) {
		this.blockBy = blockBy;
	}

	public Integer getMotifOpposition() {
		return motifOpposition;
	}

	public void setMotifOpposition(Integer motifOpposition) {
		this.motifOpposition = motifOpposition;
	}

	public int getDemandeCode() {
		return demandeCode;
	}

	public void setDemandeCode(int demandeCode) {
		this.demandeCode = demandeCode;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Integer getDemandeType() {
		return demandeType;
	}

	public void setDemandeType(Integer demandeType) {
		this.demandeType = demandeType;
	}

	public Integer getDemandeStatusCode() {
		return demandeStatusCode;
	}

	public void setDemandeStatusCode(Integer demandeStatusCode) {
		this.demandeStatusCode = demandeStatusCode;
	}

	public DemandeAction( String cardNum, Integer demandeType, Integer demandeStatusCode
			,String branchCode,String addedBy,String accountNumber) {
		super();
		this.cardNum = cardNum;
		this.demandeType = demandeType;
		this.demandeStatusCode = demandeStatusCode;
		this.dateDemande=new Date();
		this.branchCode=branchCode;
		this.addedBy=addedBy;
		this.accountNumber=accountNumber;
	}

	public DemandeAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DemandeAction [demandeCode=" + demandeCode + ", cardNum=" + cardNum + ", demandeType=" + demandeType
				+ ", demandeStatusCode=" + demandeStatusCode + ", motifOpposition=" + motifOpposition + ", motifBlock="
				+ motifBlock + ", blockBy=" + blockBy + ", dateDemande=" + dateDemande + ", branchCode=" + branchCode
				+ ", addedBy=" + addedBy + ", withReplacement=" + withReplacement + ", motifAnnulation="
				+ motifAnnulation + "]";
	}

	
	
}
