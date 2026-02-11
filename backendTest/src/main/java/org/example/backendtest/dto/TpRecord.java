package org.example.backendtest.dto;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tp_record", schema = "backendtest1")
public class TpRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codeDebit;
    private String codeBin;
    private String codeBank;
    private String numRIBEmetteur;
    private String numCartePorteur;
    private String codeDebitCommercant;
    private String numRIBcommercant;
    private String BinAcquereur;
    private String CodeBankAcquereur;
    private String CodeAgence;
    private String idTerminal;
    private String idCommercant;
    private String typeTransaction;
    private String dateTransaction;
    private String heureTransaction;
    private String montantTransaction;
    private String numFacture;
    private String emetteurFacture;
    private String numRefTransaction;
    private String numAutorisation;
    private String codeDebitPorteur;
    private String commisionPorteur;
    private String codeDebitCommisionCommercant;
    private String commisionCommercant;
    private String commisionInterchange;
    private String fraisOperateurTechnique;
    private String appCryptogram;
    private String cryptogramInfoData;
    private String atc;
    private String terminalVerificationResult;
    private String libelleCommercant;
    private String modeLectureCarte;
    private String methodeVerificationPorteur;
    private String typeDispositifSansContract;
    private String commissionsGestionaireATM;
    private String idChargeback;
    private String codeMotifChargeback;
    private String numAutorisationInitial;
    private String dateOPInitial;
    private String numtransaction;
    private String udf1;
    private String rufAcquereur;
    private String localisationATM;
    private String reseau;
    private String trackId;
    private String rufRetrait;
    private String numTransactionPaiementInternet;
    private String idOriginTransaction;
    private String rufpaiement;
    @Column(name = "`status`")
    private String status;
    private String batchId;
}