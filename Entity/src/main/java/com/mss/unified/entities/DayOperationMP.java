package com.mss.unified.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity

@Table(name = "day_operation_MP", schema = "FRANSABANK")

public class DayOperationMP  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
 	@Column(name = "iddays", nullable = false)
	private Long iddays;
	@Column(name = "codeBankEmetteur")
	private String codeBankEmetteur;
	@Column(name = "numRIBEmetteur")
	private String numRIBEmetteur;
	@Column(name = "numCartePorteur")
	private String numCartePorteur;
	@Column(name = "numRIBAcquereur")
	private String numRIBAcquereur;
	@Column(name = "CodeBankAcquereur")
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
	private String montantTransaction;
	@Column(name = "montant_settlement")
	private BigDecimal montantSettlement;
	@Column(name = "libelleCommercant")
	private String libelleCommercant;
	@Column(name = "Numtransaction")
	private String Numtransaction;

 	private Integer summaryCode;
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
	private String done;
	private String dateReglement;
 	private double amountCalculated;
	 private String origin;
	private String idPlateformeMobileBeneficiaire;
	private String idPlateformeMobileDonneur;

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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getAmountCalculated() {
		return amountCalculated;
	}

	public void setAmountCalculated(double amountCalculated) {
		this.amountCalculated = amountCalculated;
	}

	public String getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(String dateReglement) {
		this.dateReglement = dateReglement;
	}

	public String getDone() {
		return done;
	}

	public void setDone(String done) {
		this.done = done;
	}

	public String getPieceComptableBkm() {
		return pieceComptableBkm;
	}

	public void setPieceComptableBkm(String pieceComptableBkm) {
		this.pieceComptableBkm = pieceComptableBkm;
	}

	public DayOperationMP() {
		super();
	}

	public DayOperationMP(FileContentM fileContentM,SettelementFransaBank settelementFransaBank,String origin) {
		super();
		this.summaryCode = fileContentM.getSummaryCode();
		this.typeTransaction = fileContentM.getTypeTransaction();
		this.dateTransaction = fileContentM.getDateTransaction();
		this.heureTransaction = fileContentM.getHeureTransaction();
		this.montantTransaction = fileContentM.getMontantTransaction();
		this.numAutorisation = fileContentM.getNumAutorisation();
		this.numRefTransaction = fileContentM.getReferenceTransaction();
		this.Numtransaction = fileContentM.getReferenceTransaction(); // Using reference as transaction number
		
		this.numRIBEmetteur = fileContentM.getRibRipDonneur();
		this.numCartePorteur = ""; // Using phone as card number for mobile
		this.identification = fileContentM.getIdPlateformeMobileDonneur();
		this.idenficationCode =settelementFransaBank.getIdentificationbh();
		
		this.numRIBAcquereur = fileContentM.getRibRipBeneficiaire();
		this.idCommercant = "";
		this.libelleCommercant = fileContentM.getNumTelBeneficiaire(); // Using beneficiary phone as merchant label

		this.codeBankEmetteur = fileContentM.getRibRipDonneur() != null && fileContentM.getRibRipDonneur().length() >= 3
				? fileContentM.getRibRipDonneur().substring(0,3)
				: ""; // Extract bank code from donor RIB
		this.codeBankAcquereur = fileContentM.getRibRipBeneficiaire() != null && fileContentM.getRibRipBeneficiaire().length() >= 3
				? fileContentM.getRibRipBeneficiaire().substring(0,3)
				: ""; // Extract bank code from beneficiary RIB		this.fileDate = fileContentM.getDateCompensation();
		
		this.done = "N"; // Not processed initially
		this.montantSettlement = new BigDecimal(fileContentM.getMontantTransaction()); // Will be calculated later
		this.amountCalculated = 0.0;
		this.idPlateformeMobileDonneur=fileContentM.getIdPlateformeMobileDonneur();
		this.idPlateformeMobileBeneficiaire=fileContentM.getIdPlateformeMobileBeneficiaire();
		this.origin = origin;
	}


	public Long getIddays() {
		return iddays;
	}

	public void setIddays(Long iddays) {
		this.iddays = iddays;
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

	public String getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(String montantTransaction) {
		this.montantTransaction = montantTransaction;
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


	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String idenfication) {
		this.identification = idenfication;
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

	public String getNumRefTransaction() {
		return numRefTransaction;
	}

	public void setNumRefTransaction(String numRefTransaction) {
		this.numRefTransaction = numRefTransaction;

	}

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getIdenficationCode() {
		return idenficationCode;
	}

	public void setIdenficationCode(String idenficationCode) {
		this.idenficationCode = idenficationCode;
	}

	public String getCodeBankEmetteur() {
		return codeBankEmetteur;
	}

	public void setCodeBankEmetteur(String codeBankEmetteur) {
		this.codeBankEmetteur = codeBankEmetteur;
	}

	public String getNumRIBAcquereur() {
		return numRIBAcquereur;
	}

	public void setNumRIBAcquereur(String numRIBAcquereur) {
		this.numRIBAcquereur = numRIBAcquereur;
	}

	@Override
	public String toString() {
		return "DayOperationMP{" +
				"iddays=" + iddays +
				", codeBankEmetteur='" + codeBankEmetteur + '\'' +
				", numRIBEmetteur='" + numRIBEmetteur + '\'' +
				", numCartePorteur='" + numCartePorteur + '\'' +
				", numRIBAcquereur='" + numRIBAcquereur + '\'' +
				", CodeBankAcquereur='" + codeBankAcquereur + '\'' +
				", codeAgence='" + codeAgence + '\'' +
				", idCommercant='" + idCommercant + '\'' +
				", typeTransaction='" + typeTransaction + '\'' +
				", dateTransaction='" + dateTransaction + '\'' +
				", heureTransaction='" + heureTransaction + '\'' +
				", montantTransaction='" + montantTransaction + '\'' +
				"," +
				" montantSettlement=" + montantSettlement +
				", libelleCommercant='" + libelleCommercant + '\'' +
				", Numtransaction='" + Numtransaction + '\'' +
				", summaryCode='" + summaryCode + '\'' +
				", idenfication='" + identification + '\'' +
				", idenficationCode='" + idenficationCode + '\'' +
				", numAutorisation='" + numAutorisation + '\'' +
				", codeBin='" + codeBin + '\'' +
				", pieceComptable='" + pieceComptable + '\'' +
				", pieceComptableBkm='" + pieceComptableBkm + '\'' +
				", refernceLettrage='" + refernceLettrage + '\'' +
				", fileDate='" + fileDate + '\'' +
				", numRefTransaction='" + numRefTransaction + '\'' +
				", done='" + done + '\'' +
				", dateReglement='" + dateReglement + '\'' +
				", amountCalculated=" + amountCalculated +
				'}';
	}

}
