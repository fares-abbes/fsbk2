package com.mss.unified.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "UAP052FransaBank", schema = "FRANSABANK")
public class UAP052FransaBank implements TransactionNational {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE", nullable = false)
    private int code;
    @Column(name = "type_transaction")
    private String typeTransaction;
    @Column(name = "type_paiement")
    private String typePaiement;
    @Column(name = "ReferenceArchivage")
    private String referenceArchivage;
    @Column(name = "Indicateur")
    private String indicateur;
    @Column(name = "numRIBcommercant")
    private String numRIBcommercant;
    @Column(name = "prefixeIBAN")
    private String prefixeIBAN;
    @Column(name = "libelleCommercant")
    private String libelleCommercant;
    @Column(name = "adresseCommercant")
    private String adresseCommercant;
    @Column(name = "telephoneCommercant")
    private String telephoneCommercant;
    @Column(name = "numContratAccepteur")
    private String numContratAccepteur;
    @Column(name = "codeActivite")
    private String codeActivite;
    @Column(name = "reserved")
    private String reserved;
    @Column(name = "codeBin")
    private String codeBin;
    @Column(name = "typeCarte")
    private String typeCarte;
    @Column(name = "NumSeq")
    private String numSeq;
    @Column(name = "NumOrdre")
    private String numOrdre;
    @Column(name = "Cle")
    private String cle;
    @Column(name = "MontantAComponser")
    private String montantAComponser;
    @Column(name = "MontantRetrait")
    private String montantRetrait;

    @Column(name = "codeDebitPorteur")
    private String codeDebitPorteur;
    @Column(name = "codeDebitCommercant")
    private String codeDebitCommercant;
    @Column(name = "montantCommission")
    private String montantCommission;
    @Column(name = "Numtransaction")
    private String numTransaction;
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
    @Column(name = "DateRemise")
    private String dateRemise;
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
    @Column(name = "UAPRio")
    private String uapRio;
	private String done;
	@Column(name = "DateReglement")
	private String dateReglement;
	private String pieceComptableBKM;
	@Column(name = "CodeAgence")
	private String codeAgence;
	@Column(name = "tagPaiement")
	private String tagPaiement;

	private BigDecimal montantTransaction;;
	private int montantCommissionConf;
	private String copied="false";
	private String  CodeMotifChargeback;
	private String  IdChargeback;
	@Column(name = "codeBank")
	private String codeBank;

	@Column(name = "CodeBankAcquereur")
	private String CodeBankAcquereur;
	@Column(name = "numRIBEmetteur")
	private String numRIBEmetteur;
	private String CodeBanqueEmitteur;

	private String numAutorisationOperationInitiale;

	private String dateOperationInitiale;
	private String transactionOrigine;
	private Integer idTransactionOrigine  ;

	public String getTransactionOrigine() {
		return transactionOrigine;
	}

	public void setTransactionOrigine(String transactionOrigine) {
		this.transactionOrigine = transactionOrigine;
	}

	public Integer getIdTransactionOrigine() {
		return idTransactionOrigine;
	}

	public void setIdTransactionOrigine(Integer idTransactionOrigine) {
		this.idTransactionOrigine = idTransactionOrigine;
	}

	public String getCodeBanqueEmitteur() {
		return CodeBanqueEmitteur;
	}

	public void setCodeBanqueEmitteur(String codeBanqueEmitteur) {
		CodeBanqueEmitteur = codeBanqueEmitteur;
	}

	public String getNumAutorisationOperationInitiale() {
		return numAutorisationOperationInitiale;
	}

	public void setNumAutorisationOperationInitiale(String numAutorisationOperationInitiale) {
		this.numAutorisationOperationInitiale = numAutorisationOperationInitiale;
	}

	public String getDateOperationInitiale() {
		return dateOperationInitiale;
	}

	public void setDateOperationInitiale(String dateOperationInitiale) {
		this.dateOperationInitiale = dateOperationInitiale;
	}

	public String getNumRIBEmetteur() {
		return numRIBEmetteur;
	}

	public void setNumRIBEmetteur(String numRIBEmetteur) {
		this.numRIBEmetteur = numRIBEmetteur;
	}

	public String getCodeBankAcquereur() {
		return CodeBankAcquereur;
	}

	public void setCodeBankAcquereur(String codeBankAcquereur) {
		CodeBankAcquereur = codeBankAcquereur;
	}

	public String getCodeBank() {
		return codeBank;
	}

	public void setCodeBank(String codeBank) {
		this.codeBank = codeBank;
	}

	public String getCodeMotifChargeback() {
		return CodeMotifChargeback;
	}

	public void setCodeMotifChargeback(String codeMotifChargeback) {
		CodeMotifChargeback = codeMotifChargeback;
	}

	public String getIdChargeback() {
		return IdChargeback;
	}

	public void setIdChargeback(String idChargeback) {
		IdChargeback = idChargeback;
	}

	public String getCopied() {
		return copied;
	}

	public void setCopied(String copied) {
		this.copied = copied;
	}

	public int getMontantCommissionConf() {
		return montantCommissionConf;
	}

	public void setMontantCommissionConf(int montantCommissionConf) {
		this.montantCommissionConf = montantCommissionConf;
	}

	@Override
	public BigDecimal getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(BigDecimal montantTransaction) {
		this.montantTransaction = montantTransaction;
	}

	public String getTagPaiement() {
		return tagPaiement;
	}

	public void setTagPaiement(String tagPaiement) {
		this.tagPaiement = tagPaiement;
	}

	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
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
	public String getTypePaiement() {
		return typePaiement;
	}
	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}
	public String getReferenceArchivage() {
		return referenceArchivage;
	}
	public void setReferenceArchivage(String referenceArchivage) {
		this.referenceArchivage = referenceArchivage;
	}
	public String getIndicateur() {
		return indicateur;
	}
	public void setIndicateur(String indicateur) {
		this.indicateur = indicateur;
	}
	public String getNumRIBcommercant() {
		return numRIBcommercant;
	}
	public void setNumRIBcommercant(String numRIBcommercant) {
		this.numRIBcommercant = numRIBcommercant;
	}
	public String getPrefixeIBAN() {
		return prefixeIBAN;
	}
	public void setPrefixeIBAN(String prefixeIBAN) {
		this.prefixeIBAN = prefixeIBAN;
	}
	public String getLibelleCommercant() {
		return libelleCommercant;
	}
	public void setLibelleCommercant(String libelleCommercant) {
		this.libelleCommercant = libelleCommercant;
	}
	public String getAdresseCommercant() {
		return adresseCommercant;
	}
	public void setAdresseCommercant(String adresseCommercant) {
		this.adresseCommercant = adresseCommercant;
	}
	public String getTelephoneCommercant() {
		return telephoneCommercant;
	}
	public void setTelephoneCommercant(String telephoneCommercant) {
		this.telephoneCommercant = telephoneCommercant;
	}
	public String getNumContratAccepteur() {
		return numContratAccepteur;
	}
	public void setNumContratAccepteur(String numContratAccepteur) {
		this.numContratAccepteur = numContratAccepteur;
	}
	public String getCodeActivite() {
		return codeActivite;
	}
	public void setCodeActivite(String codeActivite) {
		this.codeActivite = codeActivite;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	public String getCodeBin() {
		return codeBin;
	}
	public void setCodeBin(String codeBin) {
		this.codeBin = codeBin;
	}
	public String getTypeCarte() {
		return typeCarte;
	}
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
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
	public String getNumTransaction() {
		return numTransaction;
	}
	public void setNumTransaction(String numTransaction) {
		this.numTransaction = numTransaction;
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

}
