package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "UAPFransaBankHistory", schema = "FRANSABANK")
public class UAPFransaBankHistory {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newUAPFransaBankSequence")
	@SequenceGenerator(name = "newUAPFransaBankSequence", sequenceName = "FRANSABANK.UAPFransaBankSequencens", allocationSize = 1)
	    @Column(name = "CODE", nullable = false)
	    private int code;
	    @Column(name = "type_transaction")
	    private String typeTransaction;
	    @Column(name = "ReferenceArchivage")
	    private String referenceArchivage;
	    @Column(name = "CodeBankAcquereur")
	    private String codeBankAcquereur;
	    @Column(name = "CodeAgence")
	    private String codeAgence;
	    @Column(name = "TypeRetrait")
	    private String typeRetrait;

	    @Column(name = "codeBin")
	    private String codeBin;
	    @Column(name = "TypeCarteDebit")
	    private String typeCarteDebit;
	    @Column(name = "NumSeq")
	    private String numSeq;
	    @Column(name = "NumOrdre")
	    private String numOrdre;
	    @Column(name = "Cle")
	    private String cle;

	    @Column(name = "codeDebitPorteur")
	    private String codeDebitPorteur;
	    @Column(name = "codeDebitCommercant")
	    private String codeDebitCommercant;
	    @Column(name = "montantCommission")
	    private String montantCommission;
	    @Column(name = "Numtransaction")
	    private String Numtransaction;
	    @Column(name = "Datetransaction")
	    private String dateTransaction;
	    @Column(name = "heureTransaction")
	    private String heureTransaction;
	    @Column(name = "IdentifSystem")
	    private String identifSystem;
	    @Column(name = "IdentifPointRetrait")
	    private String identifPointRetrait;
	    @Column(name = "ModeLectureCarte")
	    private String modeLectureCarte;
	    @Column(name = "MethAuthPorteur")
	    private String methAuthPorteur;
	    @Column(name = "numAutorisation")
	    private String numAutorisation;
	    @Column(name = "DateDebutValiditeCarte")
	    private String dateDebutValiditeCarte;
	    @Column(name = "DateFinValiditeCarte")
	    private String dateFinValiditeCarte;
	    @Column(name = "CryptogramData")
	    private String cryptogramData;
	    @Column(name = "ATC")
	    private String atc;
	    @Column(name = "TVR")
	    private String tvr;
	    @Column(name = "FILTER")
	    private String filter;
	    @Column(name = "StatusPaiement")
	    private String statusPaiement;
	    @Column(name = "StatusTechnique")
	    private String statusTechnique;
	    @Column(name = "accepted")
	    private String accepted;
	    @Column(name = "FileDate")
	    private String fileDate;
	    @Column(name = "FileIntegrationDate")
	    private String fileIntegrationDate;
	    
	    
	    @Column(name = "FileReglementIntegrationDate")
	    private String fileReglementIntegrationDate;

	@Column(name = "UAPRio")
	private String uapRio;
	private String done;
	private String dateReglement;
	private String pieceComptableBKM;
	private String tagRetrait;
	@Column(name = "MontantAComponser")
	private String montantAComponser;
	@Column(name = "MontantRetrait")
	private String montantRetrait;

	private int montantTranasction;;
	private int montantCommissionFSBKHt;
	private int montantCommissionTVA;
	private String copied="false";

 
	public String getCopied() {
		return copied;
	}

	public void setCopied(String copied) {
		this.copied = copied;
	}

	public int getMontantTranasction() {
		return montantTranasction;
	}

	public void setMontantTranasction(int montantTranasction) {
		this.montantTranasction = montantTranasction;
	}

	public int getMontantCommissionFSBKHt() {
		return montantCommissionFSBKHt;
	}

	public void setMontantCommissionFSBKHt(int montantCommissionFSBKHt) {
		this.montantCommissionFSBKHt = montantCommissionFSBKHt;
	}

	public int getMontantCommissionTVA() {
		return montantCommissionTVA;
	}

	public void setMontantCommissionTVA(int montantCommissionTVA) {
		this.montantCommissionTVA = montantCommissionTVA;
	}

	public String getTagRetrait() {
		return tagRetrait;
	}

	public void setTagRetrait(String tagRetrait) {
		this.tagRetrait = tagRetrait;
	}

	public String getPieceComptableBKM() {
		return pieceComptableBKM;
	}

	public void setPieceComptableBKM(String pieceComptableBKM) {
		this.pieceComptableBKM = pieceComptableBKM;
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

		public int getCode() {
			return code;
		}


		public void setCode(int code) {
			this.code = code;
		}


		public String getTypeTransaction() {
			return typeTransaction;
		}


		public void setTypeTransaction(String typeTransaction) {
			this.typeTransaction = typeTransaction;
		}


		public String getReferenceArchivage() {
			return referenceArchivage;
		}


		public void setReferenceArchivage(String referenceArchivage) {
			this.referenceArchivage = referenceArchivage;
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


		public String getTypeRetrait() {
			return typeRetrait;
		}


		public void setTypeRetrait(String typeRetrait) {
			this.typeRetrait = typeRetrait;
		}


		public String getCodeBin() {
			return codeBin;
		}


		public void setCodeBin(String codeBin) {
			this.codeBin = codeBin;
		}


		public String getTypeCarteDebit() {
			return typeCarteDebit;
		}


		public void setTypeCarteDebit(String typeCarteDebit) {
			this.typeCarteDebit = typeCarteDebit;
		}


		public String getNumSeq() {
			return numSeq;
		}


		public void setNumSeq(String numSeq) {
			this.numSeq = numSeq;
		}


		public String getNumOrdre() {
			return numOrdre;
		}


		public void setNumOrdre(String numOrdre) {
			this.numOrdre = numOrdre;
		}


		public String getCle() {
			return cle;
		}


		public void setCle(String cle) {
			this.cle = cle;
		}


		public String getMontantAComponser() {
			return montantAComponser;
		}


		public void setMontantAComponser(String montantAComponser) {
			this.montantAComponser = montantAComponser;
		}


		public String getMontantRetrait() {
			return montantRetrait;
		}


		public void setMontantRetrait(String montantRetrait) {
			this.montantRetrait = montantRetrait;
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


		public String getMontantCommission() {
			return montantCommission;
		}


		public void setMontantCommission(String montantCommission) {
			this.montantCommission = montantCommission;
		}


		public String getNumtransaction() {
			return Numtransaction;
		}


		public void setNumtransaction(String numtransaction) {
			Numtransaction = numtransaction;
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


		public String getIdentifSystem() {
			return identifSystem;
		}


		public void setIdentifSystem(String identifSystem) {
			this.identifSystem = identifSystem;
		}


		public String getIdentifPointRetrait() {
			return identifPointRetrait;
		}


		public void setIdentifPointRetrait(String identifPointRetrait) {
			this.identifPointRetrait = identifPointRetrait;
		}


		public String getModeLectureCarte() {
			return modeLectureCarte;
		}


		public void setModeLectureCarte(String modeLectureCarte) {
			this.modeLectureCarte = modeLectureCarte;
		}


		public String getMethAuthPorteur() {
			return methAuthPorteur;
		}


		public void setMethAuthPorteur(String methAuthPorteur) {
			this.methAuthPorteur = methAuthPorteur;
		}


		public String getNumAutorisation() {
			return numAutorisation;
		}


		public void setNumAutorisation(String numAutorisation) {
			this.numAutorisation = numAutorisation;
		}


		public String getDateDebutValiditeCarte() {
			return dateDebutValiditeCarte;
		}


		public void setDateDebutValiditeCarte(String dateDebutValiditeCarte) {
			this.dateDebutValiditeCarte = dateDebutValiditeCarte;
		}


		public String getDateFinValiditeCarte() {
			return dateFinValiditeCarte;
		}


		public void setDateFinValiditeCarte(String dateFinValiditeCarte) {
			this.dateFinValiditeCarte = dateFinValiditeCarte;
		}


		public String getCryptogramData() {
			return cryptogramData;
		}


		public void setCryptogramData(String cryptogramData) {
			this.cryptogramData = cryptogramData;
		}


		public String getAtc() {
			return atc;
		}


		public void setAtc(String atc) {
			this.atc = atc;
		}


		public String getTvr() {
			return tvr;
		}


		public void setTvr(String tvr) {
			this.tvr = tvr;
		}


		public String getFilter() {
			return filter;
		}


		public void setFilter(String filter) {
			this.filter = filter;
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


		public String getFileReglementIntegrationDate() {
			return fileReglementIntegrationDate;
		}


		public void setFileReglementIntegrationDate(String fileReglementIntegrationDate) {
			this.fileReglementIntegrationDate = fileReglementIntegrationDate;
		}
	    
	public String getUapRio() {
		return uapRio;
	}
	    
	public void setUapRio(String uapRio) {
		this.uapRio = uapRio;
	}
	    
	@Override
	public String toString() {
		return "UAPFransaBank [code=" + code + ", typeTransaction=" + typeTransaction + ", referenceArchivage="
				+ referenceArchivage + ", codeBankAcquereur=" + codeBankAcquereur + ", codeAgence=" + codeAgence
				+ ", typeRetrait=" + typeRetrait + ", codeBin=" + codeBin + ", typeCarteDebit=" + typeCarteDebit
				+ ", numSeq=" + numSeq + ", numOrdre=" + numOrdre + ", cle=" + cle + ", montantAComponser="
				+ montantAComponser + ", montantRetrait=" + montantRetrait + ", codeDebitPorteur=" + codeDebitPorteur
				+ ", codeDebitCommercant=" + codeDebitCommercant + ", montantCommission=" + montantCommission
				+ ", Numtransaction=" + Numtransaction + ", dateTransaction=" + dateTransaction + ", heureTransaction="
				+ heureTransaction + ", identifSystem=" + identifSystem + ", identifPointRetrait=" + identifPointRetrait
				+ ", modeLectureCarte=" + modeLectureCarte + ", methAuthPorteur=" + methAuthPorteur
				+ ", numAutorisation=" + numAutorisation + ", dateDebutValiditeCarte=" + dateDebutValiditeCarte
				+ ", dateFinValiditeCarte=" + dateFinValiditeCarte + ", cryptogramData=" + cryptogramData + ", atc="
				+ atc + ", tvr=" + tvr + ", filter=" + filter + ", statusPaiement=" + statusPaiement
				+ ", statusTechnique=" + statusTechnique + ", accepted=" + accepted + ", fileDate=" + fileDate
				+ ", fileIntegrationDate=" + fileIntegrationDate + ", fileReglementIntegrationDate="
				+ fileReglementIntegrationDate + ", uapRio=" + uapRio + "]";
	}

}
