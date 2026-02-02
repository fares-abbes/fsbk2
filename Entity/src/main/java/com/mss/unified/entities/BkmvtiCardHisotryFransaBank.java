package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "BKMVTI_CARD_HISTORY", schema = "FRANSABANK")
public class BkmvtiCardHisotryFransaBank {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newBKMVTI_CARD_HISTORY_sequence")
    @SequenceGenerator(name = "newBKMVTI_CARD_HISTORY_sequence", sequenceName = "FRANSABANK.BKMVTI_CARD_HISTORY_sequencens", allocationSize = 1)

    @Column(name = "ID", nullable = false)

    private int id;


    @Column(name = "age")
    private String agence;

    @Column(name = "dev")
    private String codeDevice;

    @Column(name = "cha")
    private String chapitreComptable;


    @Column(name = "ncp")
    private String numCompte;

    @Column(name = "suf")
    private String suffixeCompte;

    @Column(name = "ope")
    private String codeOperation;

    @Column(name = "mvti")
    private String numMouvement;

    @Column(name = "rgp")
    private String codeRegroupement;

    @Column(name = "uti")
    private String codeUtilisateur;

    @Column(name = "eve")
    private String numEvenement;

    @Column(name = "clc")
    private String cleControleCompte;

    @Column(name = "dco")
    private String dateComptable;

    @Column(name = "ser")
    private String codeService;

    @Column(name = "dva")
    private String dateValeur;

    @Column(name = "mon")
    private String montant;

    @Column(name = "sens")
    private String sens;


    @Column(name = "lib")
    private String libelle;


    @Column(name = "exo")
    private String exonerationcommission;

    @Column(name = "pie")
    private String numPiece;

    @Column(name = "rlet")
    private String referanceLettrage;


    @Column(name = "des1")
    private String codeDesaccord1;

    @Column(name = "des2")
    private String codeDesaccord2;

    @Column(name = "des3")
    private String codeDesaccord3;

    @Column(name = "des4")
    private String codeDesaccord4;

    @Column(name = "des5")
    private String codeDesaccord5;


    @Column(name = "utf")
    private String codeUtilisateur_utf;

    @Column(name = "uta")
    private String codeutilisateurAutorise;

    @Column(name = "tau")
    private String tauxChange;

    @Column(name = "din")
    private String dateIndisponible;

    @Column(name = "tpr")
    private String zoneUtilise;

    @Column(name = "npr")
    private String zoneutiliseespecifiquement;

    @Column(name = "ncc")
    private String numCompteRattachement;

    @Column(name = "suc")
    private String sufficeCompteRattrachement;


    @Column(name = "esi")
    private String zoneUtiliseSpecifiquement;

    @Column(name = "imp")
    private String calculmouvementInteragence;

    @Column(name = "cta")
    private String mouvementAgence;

    @Column(name = "mar")
    private String codeMAJ;

    @Column(name = "dech")
    private String dateEcheance;

    @Column(name = "agsa")
    private String codeAgenceSaisie;

    @Column(name = "agem")
    private String agenceEmettrice;

    @Column(name = "agde")
    private String agenceDestinatrice;
    @Column(name = "devc")
    private String codeDeviceOrigine;

    @Column(name = "mctv")
    private String montantOrigine;
    @Column(name = "pieo")
    private String numPiece1;
    @Column(name = "iden")
    private String codeID;

    @Column(name = "noseq")
    private String numSequential;
    @Column(name = "lang")
    private String codeLangue;

    @Column(name = "libnis")
    private String libelleMouvmeent;


    @Column(name = "modu")
    private String codeModule;

    @Column(name = "refdos")
    private String refDossier;

    @Column(name = "refana")
    private String refAnalytique;

    @Column(name = "label")
    private String labelMouvmeent;
    @Column(name = "nat")
    private String natureTransaction;

    @Column(name = "eta")
    private String codeEtat;

    @Column(name = "codeSchema")
    private String codeSchema;

    @Column(name = "ceticpt")
    private String codeEtiquette;

    @Column(name = "destana")
    private String destinationAnalytique;

    @Column(name = "fusion")
    private String codemouvementFusionne;

    @Column(name = "IDHEADER")
    private String idHeder;
    @Column(
            name = "PieceComptable"
    )
    private String pieceComptable;

    @Column(name = "ReferenceLettrage")
    private String refernceLettrage;


    @Column(name = "IDENTIFACTION")
    private String identification;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getCodeDevice() {
        return codeDevice;
    }

    public void setCodeDevice(String codeDevice) {
        this.codeDevice = codeDevice;
    }

    public String getChapitreComptable() {
        return chapitreComptable;
    }

    public void setChapitreComptable(String chapitreComptable) {
        this.chapitreComptable = chapitreComptable;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getSuffixeCompte() {
        return suffixeCompte;
    }

    public void setSuffixeCompte(String suffixeCompte) {
        this.suffixeCompte = suffixeCompte;
    }

    public String getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(String codeOperation) {
        this.codeOperation = codeOperation;
    }

    public String getNumMouvement() {
        return numMouvement;
    }

    public void setNumMouvement(String numMouvement) {
        this.numMouvement = numMouvement;
    }

    public String getCodeRegroupement() {
        return codeRegroupement;
    }

    public void setCodeRegroupement(String codeRegroupement) {
        this.codeRegroupement = codeRegroupement;
    }

    public String getCodeUtilisateur() {
        return codeUtilisateur;
    }

    public void setCodeUtilisateur(String codeUtilisateur) {
        this.codeUtilisateur = codeUtilisateur;
    }

    public String getNumEvenement() {
        return numEvenement;
    }

    public void setNumEvenement(String numEvenement) {
        this.numEvenement = numEvenement;
    }

    public String getCleControleCompte() {
        return cleControleCompte;
    }

    public void setCleControleCompte(String cleControleCompte) {
        this.cleControleCompte = cleControleCompte;
    }

    public String getDateComptable() {
        return dateComptable;
    }

    public void setDateComptable(String dateComptable) {
        this.dateComptable = dateComptable;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(String dateValeur) {
        this.dateValeur = dateValeur;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getExonerationcommission() {
        return exonerationcommission;
    }

    public void setExonerationcommission(String exonerationcommission) {
        this.exonerationcommission = exonerationcommission;
    }

    public String getNumPiece() {
        return numPiece;
    }

    public void setNumPiece(String numPiece) {
        this.numPiece = numPiece;
    }

    public String getReferanceLettrage() {
        return referanceLettrage;
    }

    public void setReferanceLettrage(String referanceLettrage) {
        this.referanceLettrage = referanceLettrage;
    }

    public String getCodeDesaccord1() {
        return codeDesaccord1;
    }

    public void setCodeDesaccord1(String codeDesaccord1) {
        this.codeDesaccord1 = codeDesaccord1;
    }

    public String getCodeDesaccord2() {
        return codeDesaccord2;
    }

    public void setCodeDesaccord2(String codeDesaccord2) {
        this.codeDesaccord2 = codeDesaccord2;
    }

    public String getCodeDesaccord3() {
        return codeDesaccord3;
    }

    public void setCodeDesaccord3(String codeDesaccord3) {
        this.codeDesaccord3 = codeDesaccord3;
    }

    public String getCodeDesaccord4() {
        return codeDesaccord4;
    }

    public void setCodeDesaccord4(String codeDesaccord4) {
        this.codeDesaccord4 = codeDesaccord4;
    }

    public String getCodeDesaccord5() {
        return codeDesaccord5;
    }

    public void setCodeDesaccord5(String codeDesaccord5) {
        this.codeDesaccord5 = codeDesaccord5;
    }

    public String getCodeUtilisateur_utf() {
        return codeUtilisateur_utf;
    }

    public void setCodeUtilisateur_utf(String codeUtilisateur_utf) {
        this.codeUtilisateur_utf = codeUtilisateur_utf;
    }

    public String getCodeutilisateurAutorise() {
        return codeutilisateurAutorise;
    }

    public void setCodeutilisateurAutorise(String codeutilisateurAutorise) {
        this.codeutilisateurAutorise = codeutilisateurAutorise;
    }

    public String getTauxChange() {
        return tauxChange;
    }

    public void setTauxChange(String tauxChange) {
        this.tauxChange = tauxChange;
    }

    public String getDateIndisponible() {
        return dateIndisponible;
    }

    public void setDateIndisponible(String dateIndisponible) {
        this.dateIndisponible = dateIndisponible;
    }



    public String getZoneUtilise() {
		return zoneUtilise;
	}

	public void setZoneUtilise(String zoneUtilise) {
		this.zoneUtilise = zoneUtilise;
	}

	public String getZoneutiliseespecifiquement() {
        return zoneutiliseespecifiquement;
    }

    public void setZoneutiliseespecifiquement(String zoneutiliseespecifiquement) {
        this.zoneutiliseespecifiquement = zoneutiliseespecifiquement;
    }

    public String getNumCompteRattachement() {
        return numCompteRattachement;
    }

    public void setNumCompteRattachement(String numCompteRattachement) {
        this.numCompteRattachement = numCompteRattachement;
    }

    public String getSufficeCompteRattrachement() {
        return sufficeCompteRattrachement;
    }

    public void setSufficeCompteRattrachement(String sufficeCompteRattrachement) {
        this.sufficeCompteRattrachement = sufficeCompteRattrachement;
    }

    public String getZoneUtiliseSpecifiquement() {
        return zoneUtiliseSpecifiquement;
    }

    public void setZoneUtiliseSpecifiquement(String zoneUtiliseSpecifiquement) {
        this.zoneUtiliseSpecifiquement = zoneUtiliseSpecifiquement;
    }

    public String getCalculmouvementInteragence() {
        return calculmouvementInteragence;
    }

    public void setCalculmouvementInteragence(String calculmouvementInteragence) {
        this.calculmouvementInteragence = calculmouvementInteragence;
    }

    public String getMouvementAgence() {
        return mouvementAgence;
    }

    public void setMouvementAgence(String mouvementAgence) {
        this.mouvementAgence = mouvementAgence;
    }

    public String getCodeMAJ() {
        return codeMAJ;
    }

    public void setCodeMAJ(String codeMAJ) {
        this.codeMAJ = codeMAJ;
    }

    public String getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String getCodeAgenceSaisie() {
        return codeAgenceSaisie;
    }

    public void setCodeAgenceSaisie(String codeAgenceSaisie) {
        this.codeAgenceSaisie = codeAgenceSaisie;
    }

    public String getAgenceEmettrice() {
        return agenceEmettrice;
    }

    public void setAgenceEmettrice(String agenceEmettrice) {
        this.agenceEmettrice = agenceEmettrice;
    }

    public String getAgenceDestinatrice() {
        return agenceDestinatrice;
    }

    public void setAgenceDestinatrice(String agenceDestinatrice) {
        this.agenceDestinatrice = agenceDestinatrice;
    }

    public String getCodeDeviceOrigine() {
        return codeDeviceOrigine;
    }

    public void setCodeDeviceOrigine(String codeDeviceOrigine) {
        this.codeDeviceOrigine = codeDeviceOrigine;
    }

    public String getMontantOrigine() {
        return montantOrigine;
    }

    public void setMontantOrigine(String montantOrigine) {
        this.montantOrigine = montantOrigine;
    }

    public String getNumPiece1() {
        return numPiece1;
    }

    public void setNumPiece1(String numPiece1) {
        this.numPiece1 = numPiece1;
    }

    public String getCodeID() {
        return codeID;
    }

    public void setCodeID(String codeID) {
        this.codeID = codeID;
    }

    public String getNumSequential() {
        return numSequential;
    }

    public void setNumSequential(String numSequential) {
        this.numSequential = numSequential;
    }

    public String getCodeLangue() {
        return codeLangue;
    }

    public void setCodeLangue(String codeLangue) {
        this.codeLangue = codeLangue;
    }

    public String getLibelleMouvmeent() {
        return libelleMouvmeent;
    }

    public void setLibelleMouvmeent(String libelleMouvmeent) {
        this.libelleMouvmeent = libelleMouvmeent;
    }

    public String getCodeModule() {
        return codeModule;
    }

    public void setCodeModule(String codeModule) {
        this.codeModule = codeModule;
    }

    public String getRefDossier() {
        return refDossier;
    }

    public void setRefDossier(String refDossier) {
        this.refDossier = refDossier;
    }

    public String getRefAnalytique() {
        return refAnalytique;
    }

    public void setRefAnalytique(String refAnalytique) {
        this.refAnalytique = refAnalytique;
    }

    public String getLabelMouvmeent() {
        return labelMouvmeent;
    }

    public void setLabelMouvmeent(String labelMouvmeent) {
        this.labelMouvmeent = labelMouvmeent;
    }

    public String getNatureTransaction() {
        return natureTransaction;
    }

    public void setNatureTransaction(String natureTransaction) {
        this.natureTransaction = natureTransaction;
    }

    public String getCodeEtat() {
        return codeEtat;
    }

    public void setCodeEtat(String codeEtat) {
        this.codeEtat = codeEtat;
    }

    public String getCodeSchema() {
        return codeSchema;
    }

    public void setCodeSchema(String codeSchema) {
        this.codeSchema = codeSchema;
    }

    public String getCodeEtiquette() {
        return codeEtiquette;
    }

    public void setCodeEtiquette(String codeEtiquette) {
        this.codeEtiquette = codeEtiquette;
    }

    public String getDestinationAnalytique() {
        return destinationAnalytique;
    }

    public void setDestinationAnalytique(String destinationAnalytique) {
        this.destinationAnalytique = destinationAnalytique;
    }

    public String getCodemouvementFusionne() {
        return codemouvementFusionne;
    }

    public void setCodemouvementFusionne(String codemouvementFusionne) {
        this.codemouvementFusionne = codemouvementFusionne;
    }

    public String getIdHeder() {
        return idHeder;
    }

    public void setIdHeder(String idHeder) {
        this.idHeder = idHeder;
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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

	@Override
	public String toString() {
		return "BkmvtiFransaBank [id=" + id + ", agence=" + agence + ", codeDevice=" + codeDevice
				+ ", chapitreComptable=" + chapitreComptable + ", numCompte=" + numCompte + ", suffixeCompte="
				+ suffixeCompte + ", codeOperation=" + codeOperation + ", numMouvement=" + numMouvement
				+ ", codeRegroupement=" + codeRegroupement + ", codeUtilisateur=" + codeUtilisateur + ", numEvenement="
				+ numEvenement + ", cleControleCompte=" + cleControleCompte + ", dateComptable=" + dateComptable
				+ ", codeService=" + codeService + ", dateValeur=" + dateValeur + ", montant=" + montant + ", sens="
				+ sens + ", libelle=" + libelle + ", exonerationcommission=" + exonerationcommission + ", numPiece="
				+ numPiece + ", referanceLettrage=" + referanceLettrage + ", codeDesaccord1=" + codeDesaccord1
				+ ", codeDesaccord2=" + codeDesaccord2 + ", codeDesaccord3=" + codeDesaccord3 + ", codeDesaccord4="
				+ codeDesaccord4 + ", codeDesaccord5=" + codeDesaccord5 + ", codeUtilisateur_utf=" + codeUtilisateur_utf
				+ ", codeutilisateurAutorise=" + codeutilisateurAutorise + ", tauxChange=" + tauxChange
				+ ", dateIndisponible=" + dateIndisponible + ", zoneUtilise=" + zoneUtilise
				+ ", zoneutiliseespecifiquement=" + zoneutiliseespecifiquement + ", numCompteRattachement="
				+ numCompteRattachement + ", sufficeCompteRattrachement=" + sufficeCompteRattrachement
				+ ", zoneUtiliseSpecifiquement=" + zoneUtiliseSpecifiquement + ", calculmouvementInteragence="
				+ calculmouvementInteragence + ", mouvementAgence=" + mouvementAgence + ", codeMAJ=" + codeMAJ
				+ ", dateEcheance=" + dateEcheance + ", codeAgenceSaisie=" + codeAgenceSaisie + ", agenceEmettrice="
				+ agenceEmettrice + ", agenceDestinatrice=" + agenceDestinatrice + ", codeDeviceOrigine="
				+ codeDeviceOrigine + ", montantOrigine=" + montantOrigine + ", numPiece1=" + numPiece1 + ", codeID="
				+ codeID + ", numSequential=" + numSequential + ", codeLangue=" + codeLangue + ", libelleMouvmeent="
				+ libelleMouvmeent + ", codeModule=" + codeModule + ", refDossier=" + refDossier + ", refAnalytique="
				+ refAnalytique + ", labelMouvmeent=" + labelMouvmeent + ", natureTransaction=" + natureTransaction
				+ ", codeEtat=" + codeEtat + ", codeSchema=" + codeSchema + ", codeEtiquette=" + codeEtiquette
				+ ", destinationAnalytique=" + destinationAnalytique + ", codemouvementFusionne="
				+ codemouvementFusionne + ", idHeder=" + idHeder + ", pieceComptable=" + pieceComptable
				+ ", refernceLettrage=" + refernceLettrage + ", identification=" + identification + "]";
	}
    
    
}
