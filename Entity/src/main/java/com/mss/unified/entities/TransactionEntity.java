package com.mss.unified.entities;

import java.math.BigDecimal;

/**
 * Common interface for transaction entities that share similar fields
 * Used for generic BkmvtiFransaBank generation
 */
public interface TransactionEntity {

    // Bank and Account Information
    String getCodeBankEmetteur();
    String getNumRIBEmetteur();
    String getNumCartePorteur();
    String getNumRIBAcquereur();
    String getCodeBankAcquereur();
    String getCodeAgence();

    // Transaction Details
    String getTypeTransaction();
    String getDateTransaction();
    String getHeureTransaction();
    BigDecimal getMontantTransaction();
    BigDecimal getMontantSettlement();
    String getLibelleCommercant();
    String getNumtransaction();

    // Identification and Authorization
    String getIdentification();
    String getIdenficationCode();
    String getNumAutorisation();
    String getCodeBin();

    // Merchant Information
    String getIdCommercant();

    // File and Processing Information
    String getFileDate();
    String getPieceComptable();
    String getPieceComptableBkm();
    String getRefernceLettrage();
    String getNumRefTransaction();
    // Summary and Status
    String getSummaryCode();
    String getDone();
    String getDateReglement();
    double getAmountCalculated();

    public BigDecimal getMontantInterchange();

     // Origin tracking (if available)
    default String getOrigin() {
        return null;
    }
}
