package com.mss.unified.entities;

import java.math.BigDecimal;

/**
 * Common interface for national transaction entities (UAP052)
 * Used for chargeback and national transaction processing
 */
public interface TransactionNational {

    // Transaction Identification
    String getTypeTransaction();
    String getNumTransaction();
    String getDateTransaction();
    String getHeureTransaction();
    String getNumAutorisation();
    
    // Bank and Account Information
    String getCodeAgence();
    String getCodeBankAcquereur();
    String getNumRIBcommercant();
    String getCodeBin();
    
    // Merchant Information
    String getLibelleCommercant();
    String getReferenceArchivage();
    
    // Transaction Amounts
    BigDecimal getMontantTransaction();
    String getMontantCommission();
    
    // File and Processing Information
    String getFileDate();
    String getFileIntegrationDate();
    String getUapRio();
    String getDone();
    String getDateReglement();
    String getPieceComptableBKM();
    
    // Status Information
    String getAccepted();
    String getNumRIBEmetteur();
     String getTransactionOrigine()  ;



     Integer getIdTransactionOrigine()  ;

    // Chargeback Information
    String getCodeMotifChargeback();
    String getIdChargeback();
    String getNumAutorisationOperationInitiale();
    String getDateOperationInitiale();

    // Setters for processing
    void setDateReglement(String dateReglement);
    void setUapRio(String uapRio);
    void setDone(String done);
    void setPieceComptableBKM(String pieceComptableBKM);
}
