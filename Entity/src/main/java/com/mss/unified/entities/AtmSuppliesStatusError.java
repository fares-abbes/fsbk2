package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_SUP_STA_MAP_ERR",schema = "ATM")
public class AtmSuppliesStatusError {
    @Id
    @Column(name = "ASSME_CODE", nullable = false)
    private String atmSuppliesErrorId;

    @Column(name = "POSITION_0")
    private String atmSuppliesPosition0;

    @Column(name = "POSITION_1")
    private String atmSuppliesPosition1;

    @Column(name = "POSITION_2")
    private String atmSuppliesPosition2;

    @Column(name = "CARD_CAPTURE_BIN")
    private String atmSuppliesCardCapture;

    @Column(name = "CASH_HANDLER_REJECT_BIN")
    private String atmSuppliesCashHandler;

    @Column(name = "DEPOSIT_BIN")
    private String atmSuppliesDepositBin;

    @Column(name = "RECEIPT_PAPER")
    private String atmSuppliesReceiptPaper;

    @Column(name = "JOURNAL_PAPER")
    private String atmSuppliesJournalPaper;

    @Column(name = "POSITION_8")
    private String atmSuppliesPosition8;

    @Column(name = "POSITION_9")
    private String atmSuppliesPosition9;

    @Column(name = "NIGHT_SAFE")
    private String atmSuppliesNightSafe;

    @Column(name = "POSITION_11")
    private String atmSuppliesPosition11;

    @Column(name = "POSITION_12")
    private String atmSuppliesPosition12;

    @Column(name = "POSITION_13")
    private String atmSuppliesPosition13;

    @Column(name = "POSITION_14")
    private String atmSuppliesPosition14;

    @Column(name = "TYPE_1_CURR_CASS")
    private String atmSuppliesCurrCass1;

    @Column(name = "TYPE_2_CURR_CASS")
    private String atmSuppliesCurrCass2;

    @Column(name = "TYPE_3_CURR_CASS")
    private String atmSuppliesCurrCass3;

    @Column(name = "TYPE_4_CURR_CASS")
    private String atmSuppliesCurrCass4;

    @Column(name = "POSITION_19")
    private String atmSuppliesPosition19;

    @Column(name = "POSITION_20")
    private String atmSuppliesPosition20;

    @Column(name = "STATEMENT_PAPER")
    private String atmSuppliesStatementPaper;

    @Column(name = "STATEMENT_RIBON")
    private String atmSuppliesStatementRibon;

    @Column(name = "POSITION_23")
    private String atmSuppliesPosition23;

    @Column(name = "POSITION_24")
    private String atmSuppliesPosition24;

    @Column(name = "ENVELOPE_DISPENSED")
    private String atmSuppliesEnvolopeDispenser;

    public String getAtmSuppliesErrorId() {
        return atmSuppliesErrorId;
    }

    public void setAtmSuppliesErrorId(String atmSuppliesErrorId) {
        this.atmSuppliesErrorId = atmSuppliesErrorId;
    }

    public String getAtmSuppliesPosition0() {
        return atmSuppliesPosition0;
    }

    public void setAtmSuppliesPosition0(String atmSuppliesPosition0) {
        this.atmSuppliesPosition0 = atmSuppliesPosition0;
    }

    public String getAtmSuppliesPosition1() {
        return atmSuppliesPosition1;
    }

    public void setAtmSuppliesPosition1(String atmSuppliesPosition1) {
        this.atmSuppliesPosition1 = atmSuppliesPosition1;
    }

    public String getAtmSuppliesPosition2() {
        return atmSuppliesPosition2;
    }

    public void setAtmSuppliesPosition2(String atmSuppliesPosition2) {
        this.atmSuppliesPosition2 = atmSuppliesPosition2;
    }

    public String getAtmSuppliesCardCapture() {
        return atmSuppliesCardCapture;
    }

    public void setAtmSuppliesCardCapture(String atmSuppliesCardCapture) {
        this.atmSuppliesCardCapture = atmSuppliesCardCapture;
    }

    public String getAtmSuppliesCashHandler() {
        return atmSuppliesCashHandler;
    }

    public void setAtmSuppliesCashHandler(String atmSuppliesCashHandler) {
        this.atmSuppliesCashHandler = atmSuppliesCashHandler;
    }

    public String getAtmSuppliesDepositBin() {
        return atmSuppliesDepositBin;
    }

    public void setAtmSuppliesDepositBin(String atmSuppliesDepositBin) {
        this.atmSuppliesDepositBin = atmSuppliesDepositBin;
    }

    public String getAtmSuppliesReceiptPaper() {
        return atmSuppliesReceiptPaper;
    }

    public void setAtmSuppliesReceiptPaper(String atmSuppliesReceiptPaper) {
        this.atmSuppliesReceiptPaper = atmSuppliesReceiptPaper;
    }

    public String getAtmSuppliesJournalPaper() {
        return atmSuppliesJournalPaper;
    }

    public void setAtmSuppliesJournalPaper(String atmSuppliesJournalPaper) {
        this.atmSuppliesJournalPaper = atmSuppliesJournalPaper;
    }

    public String getAtmSuppliesPosition8() {
        return atmSuppliesPosition8;
    }

    public void setAtmSuppliesPosition8(String atmSuppliesPosition8) {
        this.atmSuppliesPosition8 = atmSuppliesPosition8;
    }

    public String getAtmSuppliesPosition9() {
        return atmSuppliesPosition9;
    }

    public void setAtmSuppliesPosition9(String atmSuppliesPosition9) {
        this.atmSuppliesPosition9 = atmSuppliesPosition9;
    }

    public String getAtmSuppliesNightSafe() {
        return atmSuppliesNightSafe;
    }

    public void setAtmSuppliesNightSafe(String atmSuppliesNightSafe) {
        this.atmSuppliesNightSafe = atmSuppliesNightSafe;
    }

    public String getAtmSuppliesPosition11() {
        return atmSuppliesPosition11;
    }

    public void setAtmSuppliesPosition11(String atmSuppliesPosition11) {
        this.atmSuppliesPosition11 = atmSuppliesPosition11;
    }

    public String getAtmSuppliesPosition12() {
        return atmSuppliesPosition12;
    }

    public void setAtmSuppliesPosition12(String atmSuppliesPosition12) {
        this.atmSuppliesPosition12 = atmSuppliesPosition12;
    }

    public String getAtmSuppliesPosition13() {
        return atmSuppliesPosition13;
    }

    public void setAtmSuppliesPosition13(String atmSuppliesPosition13) {
        this.atmSuppliesPosition13 = atmSuppliesPosition13;
    }

    public String getAtmSuppliesPosition14() {
        return atmSuppliesPosition14;
    }

    public void setAtmSuppliesPosition14(String atmSuppliesPosition14) {
        this.atmSuppliesPosition14 = atmSuppliesPosition14;
    }

    public String getAtmSuppliesCurrCass1() {
        return atmSuppliesCurrCass1;
    }

    public void setAtmSuppliesCurrCass1(String atmSuppliesCurrCass1) {
        this.atmSuppliesCurrCass1 = atmSuppliesCurrCass1;
    }

    public String getAtmSuppliesCurrCass2() {
        return atmSuppliesCurrCass2;
    }

    public void setAtmSuppliesCurrCass2(String atmSuppliesCurrCass2) {
        this.atmSuppliesCurrCass2 = atmSuppliesCurrCass2;
    }

    public String getAtmSuppliesCurrCass3() {
        return atmSuppliesCurrCass3;
    }

    public void setAtmSuppliesCurrCass3(String atmSuppliesCurrCass3) {
        this.atmSuppliesCurrCass3 = atmSuppliesCurrCass3;
    }

    public String getAtmSuppliesCurrCass4() {
        return atmSuppliesCurrCass4;
    }

    public void setAtmSuppliesCurrCass4(String atmSuppliesCurrCass4) {
        this.atmSuppliesCurrCass4 = atmSuppliesCurrCass4;
    }

    public String getAtmSuppliesPosition19() {
        return atmSuppliesPosition19;
    }

    public void setAtmSuppliesPosition19(String atmSuppliesPosition19) {
        this.atmSuppliesPosition19 = atmSuppliesPosition19;
    }

    public String getAtmSuppliesPosition20() {
        return atmSuppliesPosition20;
    }

    public void setAtmSuppliesPosition20(String atmSuppliesPosition20) {
        this.atmSuppliesPosition20 = atmSuppliesPosition20;
    }

    public String getAtmSuppliesStatementPaper() {
        return atmSuppliesStatementPaper;
    }

    public void setAtmSuppliesStatementPaper(String atmSuppliesStatementPaper) {
        this.atmSuppliesStatementPaper = atmSuppliesStatementPaper;
    }

    public String getAtmSuppliesStatementRibon() {
        return atmSuppliesStatementRibon;
    }

    public void setAtmSuppliesStatementRibon(String atmSuppliesStatementRibon) {
        this.atmSuppliesStatementRibon = atmSuppliesStatementRibon;
    }

    public String getAtmSuppliesPosition23() {
        return atmSuppliesPosition23;
    }

    public void setAtmSuppliesPosition23(String atmSuppliesPosition23) {
        this.atmSuppliesPosition23 = atmSuppliesPosition23;
    }

    public String getAtmSuppliesPosition24() {
        return atmSuppliesPosition24;
    }

    public void setAtmSuppliesPosition24(String atmSuppliesPosition24) {
        this.atmSuppliesPosition24 = atmSuppliesPosition24;
    }

    public String getAtmSuppliesEnvolopeDispenser() {
        return atmSuppliesEnvolopeDispenser;
    }

    public void setAtmSuppliesEnvolopeDispenser(String atmSuppliesEnvolopeDispenser) {
        this.atmSuppliesEnvolopeDispenser = atmSuppliesEnvolopeDispenser;
    }


}
