package com.mss.unified.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "UAP070FransaBank", schema = "FRANSABANK")
public class UAP070FransaBank implements TransactionEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE", nullable = false)
    private int code;
	@Column(name = "codeBankEmetteur")
	private String codeBankEmetteur;
	@Column(name = "numRIBEmetteur")
	private String numRIBEmetteur;
	@Column(name = "numCartePorteur")
	private String numCartePorteur;
	@Column(name = "numRIBAcquereur")
	private String numRIBAcquereur;
	@Column(name = "codeBankAcquereur")
	private String codeBankAcquereur;
	@Column(name = "CodeAgence")
	private String codeAgence;

	@Column(name = "id_commercant")
	private String idCommercant;
	@Column(name = "type_transaction")
	private String typeTransaction;
	@Column(name = "Datetransaction")
	private String dateTransaction;
	@Column(name = "heureTransaction")
	private String heureTransaction;
	@Column(name = "montant_transaction")
	private BigDecimal montantTransaction;
	@Column(name = "montant_settlement")
	private BigDecimal montantSettlement;
	@Column(name = "libelleCommercant")
	private String libelleCommercant;
	@Column(name = "Numtransaction")
	private String Numtransaction;

	private String summaryCode;
	@Column(name = "identification")
	private String identification;
	private String idenficationCode;
	@Column(name = "numAutorisation")
	private String numAutorisation;
	@Column(name = "codeBin")
	private String codeBin;

	@Column(name = "PieceComptable")
	private String pieceComptable;
	@Column(name = "PieceComptableBKM")
	private String pieceComptableBkm;
	@Column(name = "ReferenceLettrage")
	private String refernceLettrage;

	@Column(name = "FileDate")
	private String fileDate;
	@Column(name = "numRefTransaction")
	private String numRefTransaction;
	private String dateReglement;
	private double amountCalculated;

	@Column(name = "DateRemise")
    private String dateRemise;
    @Column(name = "StatusPaiement")
    private String statusPaiement;
    @Column(name = "StatusTechnique")
    private String statusTechnique;
    @Column(name = "accepted")
    private String accepted;

    
    @Column(name = "FileIntegrationDate")
    private String fileIntegrationDate;
    @Column(name = "UAPRio")
    private String uapRio;
	private String done;

	@Column(name = "tagPaiement")
	private String tagPaiement;

	private BigDecimal montantCommission;
	private BigDecimal montantInterchange;
	private String origin;
	private String numRefArchivage;

	private String idPlateformeMobileBeneficiaire;
	private String idPlateformeMobileDonneur;

	public BigDecimal getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(BigDecimal montantTransaction) {
		this.montantTransaction = montantTransaction;
	}

	public String getIdPlateformeMobileBeneficiaire() {
		return idPlateformeMobileBeneficiaire;
	}

	public void setIdPlateformeMobileBeneficiaire(String idPlateformeMobileBeneficiaire) {
		this.idPlateformeMobileBeneficiaire = idPlateformeMobileBeneficiaire;
	}

	public String getIdPlateformeMobileDonneur() {
		return idPlateformeMobileDonneur;
	}

	public void setIdPlateformeMobileDonneur(String idPlateformeMobileDonneur) {
		this.idPlateformeMobileDonneur = idPlateformeMobileDonneur;
	}
	public String getNumRefArchivage() {
		return numRefArchivage;
	}

	public void setNumRefArchivage(String numRefArchivage) {
		this.numRefArchivage = numRefArchivage;
	}
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public BigDecimal getMontantCommission() {
		return montantCommission;
	}


	public BigDecimal getMontantInterchange() {
		return montantInterchange;
	}

	public void setMontantInterchange(BigDecimal montantInterchange) {
		this.montantInterchange = montantInterchange;
	}

	public void setMontantCommission(BigDecimal montantCommission) {
		this.montantCommission = montantCommission;
	}

	private String copied="false";


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCodeBankEmetteur() {
		return codeBankEmetteur;
	}

	public void setCodeBankEmetteur(String codeBankEmetteur) {
		this.codeBankEmetteur = codeBankEmetteur;
	}

	public String getNumRIBEmetteur() {
		return numRIBEmetteur;
	}

	public void setNumRIBEmetteur(String numRIBEmetteur) {
		this.numRIBEmetteur = numRIBEmetteur;
	}

	public String getNumCartePorteur() {
		return numCartePorteur;
	}

	public void setNumCartePorteur(String numCartePorteur) {
		this.numCartePorteur = numCartePorteur;
	}

	public String getNumRIBAcquereur() {
		return numRIBAcquereur;
	}

	public void setNumRIBAcquereur(String numRIBAcquereur) {
		this.numRIBAcquereur = numRIBAcquereur;
	}

	public String getCodeBankAcquereur() {
		return codeBankAcquereur;
	}

	public void setCodeBankAcquereur(String codeBankAcquereur) {
		this.codeBankAcquereur = codeBankAcquereur;
	}

	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getTagPaiement() {
		return tagPaiement;
	}

	public void setTagPaiement(String tagPaiement) {
		this.tagPaiement = tagPaiement;
	}



	public String getCopied() {
		return copied;
	}

	public void setCopied(String copied) {
		this.copied = copied;
	}

	public String getIdCommercant() {
		return idCommercant;
	}

	public void setIdCommercant(String idCommercant) {
		this.idCommercant = idCommercant;
	}

	public String getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public String getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public String getHeureTransaction() {
		return heureTransaction;
	}

	public void setHeureTransaction(String heureTransaction) {
		this.heureTransaction = heureTransaction;
	}


	public BigDecimal getMontantSettlement() {
		return montantSettlement;
	}

	public void setMontantSettlement(BigDecimal montantSettlement) {
		this.montantSettlement = montantSettlement;
	}

	public String getLibelleCommercant() {
		return libelleCommercant;
	}

	public void setLibelleCommercant(String libelleCommercant) {
		this.libelleCommercant = libelleCommercant;
	}

	public String getNumtransaction() {
		return Numtransaction;
	}

	public void setNumtransaction(String numtransaction) {
		Numtransaction = numtransaction;
	}

	public String getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(String summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getIdenficationCode() {
		return idenficationCode;
	}

	public void setIdenficationCode(String idenficationCode) {
		this.idenficationCode = idenficationCode;
	}

	public String getNumAutorisation() {
		return numAutorisation;
	}

	public void setNumAutorisation(String numAutorisation) {
		this.numAutorisation = numAutorisation;
	}

	public String getCodeBin() {
		return codeBin;
	}

	public void setCodeBin(String codeBin) {
		this.codeBin = codeBin;
	}

	public String getPieceComptable() {
		return pieceComptable;
	}

	public void setPieceComptable(String pieceComptable) {
		this.pieceComptable = pieceComptable;
	}

	public String getPieceComptableBkm() {
		return pieceComptableBkm;
	}

	public void setPieceComptableBkm(String pieceComptableBkm) {
		this.pieceComptableBkm = pieceComptableBkm;
	}

	public String getRefernceLettrage() {
		return refernceLettrage;
	}

	public void setRefernceLettrage(String refernceLettrage) {
		this.refernceLettrage = refernceLettrage;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileIntegrationDate() {
		return fileIntegrationDate;
	}

	public void setFileIntegrationDate(String fileIntegrationDate) {
		this.fileIntegrationDate = fileIntegrationDate;
	}

	public String getUapRio() {
		return uapRio;
	}

	public void setUapRio(String uapRio) {
		this.uapRio = uapRio;
	}

	public String getNumRefTransaction() {
		return numRefTransaction;
	}

	public void setNumRefTransaction(String numRefTransaction) {
		this.numRefTransaction = numRefTransaction;
	}

	public String getDone() {
		return done;
	}

	public void setDone(String done) {
		this.done = done;
	}

	public String getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(String dateReglement) {
		this.dateReglement = dateReglement;
	}



	public double getAmountCalculated() {
		return amountCalculated;
	}

	public void setAmountCalculated(double amountCalculated) {
		this.amountCalculated = amountCalculated;
	}

	public String getDateRemise() {
		return dateRemise;
	}

	public void setDateRemise(String dateRemise) {
		this.dateRemise = dateRemise;
	}

	public String getStatusPaiement() {
		return statusPaiement;
	}

	public void setStatusPaiement(String statusPaiement) {
		this.statusPaiement = statusPaiement;
	}

	public String getStatusTechnique() {
		return statusTechnique;
	}

	public void setStatusTechnique(String statusTechnique) {
		this.statusTechnique = statusTechnique;
	}

	public String getAccepted() {
		return accepted;
	}

	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}
}
