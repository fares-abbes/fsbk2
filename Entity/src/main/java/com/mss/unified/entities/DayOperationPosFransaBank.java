package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "day_operation_pos_fransaBank", schema = "FRANSABANK")
public class DayOperationPosFransaBank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newday_operation_pos_fransaBank_sequence")
	@SequenceGenerator(name = "newday_operation_pos_fransaBank_sequence", sequenceName = "FRANSABANK.day_operation_pos_fransaBank_sequencens", allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private int id;
	@Column(name = "codeBank")
	private String codeBank;
	@Column(name = "numRIBEmetteur")
	private String numRIBEmetteur;
	@Column(name = "numCartePorteur")
	private String numCartePorteur;
	@Column(name = "numRIBcommercant")
	private String numRIBcommercant;
	@Column(name = "CodeBankAcquereur")
	private String CodeBankAcquereur;
	@Column(name = "CodeAgence")
	private String codeAgence;
	@Column(name = "id_Terminal")
	private String idTerminal;
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
	private String montantSettlement;
	@Column(name = "libelleCommercant")
	private String libelleCommercant;
	@Column(name = "Numtransaction")
	private String Numtransaction;
	@Column(name = "compte_debit")
	private String compteDebit;
	@Column(name = "compte_credit")
	private String compteCredit;
	@Column(name = "IDHEADER")
	private String idHeder;
	@Column(name = "identification")
	private String idenfication;
	@Column(name = "numAutorisation")
	private String numAutorisation;
	@Column(name = "codeBin")
	private String codeBin;
	@Column(name = "codeDebitPorteur")
	private String codeDebitPorteur;
	@Column(name = "codeDebitCommercant")
	private String codeDebitCommercant;
	@Column(name = "PieceComptable")
	private String pieceComptable;
	@Column(name = "PieceComptableBKM")
	private String pieceComptableBkm;
	@Column(name = "ReferenceLettrage")
	private String refernceLettrage;
	
	@Column(name = "FileDate")
	private String fileDate;
	
	private String status;
	@Column(name = "numRefTransaction")
	private String numRefTransaction;
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPieceComptableBkm() {
		return pieceComptableBkm;
	}

	public void setPieceComptableBkm(String pieceComptableBkm) {
		this.pieceComptableBkm = pieceComptableBkm;
	}

	public DayOperationPosFransaBank() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodeBank() {
		return codeBank;
	}

	public void setCodeBank(String codeBank) {
		this.codeBank = codeBank;
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

	public String getNumRIBcommercant() {
		return numRIBcommercant;
	}

	public void setNumRIBcommercant(String numRIBcommercant) {
		this.numRIBcommercant = numRIBcommercant;
	}

	public String getCodeBankAcquereur() {
		return CodeBankAcquereur;
	}

	public void setCodeBankAcquereur(String codeBankAcquereur) {
		CodeBankAcquereur = codeBankAcquereur;
	}



	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
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

	public String getMontantSettlement() {
		return montantSettlement;
	}

	public void setMontantSettlement(String montantSettlement) {
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

	public String getCompteDebit() {
		return compteDebit;
	}

	public void setCompteDebit(String compteDebit) {
		this.compteDebit = compteDebit;
	}

	public String getCompteCredit() {
		return compteCredit;
	}

	public void setCompteCredit(String compteCredit) {
		this.compteCredit = compteCredit;
	}

	public String getIdHeder() {
		return idHeder;
	}

	public void setIdHeder(String idHeder) {
		this.idHeder = idHeder;
	}

	public String getIdenfication() {
		return idenfication;
	}

	public void setIdenfication(String idenfication) {
		this.idenfication = idenfication;
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

	public String getCodeDebitPorteur() {
		return codeDebitPorteur;
	}

	public void setCodeDebitPorteur(String codeDebitPorteur) {
		this.codeDebitPorteur = codeDebitPorteur;
	}

	public String getCodeDebitCommercant() {
		return codeDebitCommercant;
	}

	public void setCodeDebitCommercant(String codeDebitCommercant) {
		this.codeDebitCommercant = codeDebitCommercant;
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
	
}
