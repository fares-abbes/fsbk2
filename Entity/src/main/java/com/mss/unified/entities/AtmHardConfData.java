package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_HARD_CONF_DATA",schema = "ATM")
public class AtmHardConfData {
    @Id
    @Column(name = "ATE_ID", nullable = false)
    private String atmHardConfId;

    @Column(name = "PRODUCT")
    private String atmHardConfProduct;

    @Column(name = "POSITION_1")
    private String atmHardConfPosition1;

    @Column(name = "SYSTEM_DISK")
    private String atmHardConfSystemDisk;

    @Column(name = "CARD_READER")
    private String atmHardConfCardReader;

    @Column(name = "CASH_HANDLER")
    private String atmHardConfCashHandler;

    @Column(name = "ENVELOPE_DEPOSITORY")
    private String atmHardConfEnvelopeDeposit;

    @Column(name = "RECEIPT_PRINTER")
    private String atmHardConfReceiptPrinter;

    @Column(name = "JOURNAL_PRINTER")
    private String atmHardConfJournalPrinter;

    @Column(name = "POSITION_8")
    private String atmHardConfPosition8;

    @Column(name = "POSITION_9")
    private String atmHardConfPosition9;

    @Column(name = "NIGHT_SAFE_DEPO")
    private String atmHardConfNightSafeDepo;

    @Column(name = "ENCRYPTOR")
    private String atmHardConfEncryptor;

    @Column(name = "SECURITY_CAMERA")
    private String atmHardConfSecurityCamera;

    @Column(name = "DOOR_ACCESS")
    private String atmHardConfDoorAccess;

    @Column(name = "FLEX_DISC")
    private String atmHardConfFlexDisc;

    @Column(name = "TAMPER_INDICATION")
    private String atmHardConfTamperIndication;

    @Column(name = "CARDHOLDER_KEYBORD")
    private String atmHardConfCarholderKeybord;

    @Column(name = "OPERTOR_KEYBORD")
    private String atmHardConfOperatorKeybord;

    @Column(name = "CARDHOLDER_DISPLAY_VOICE")
    private String atmHardConfCardHolderDisplayVoice;

    @Column(name = "POSITION_19")
    private String atmHardConfPosition19;

    @Column(name = "POSITION_20")
    private String atmHardConfPosition20;

    @Column(name = "STATEMENT_PRINTER")
    private String atmHardConfStatementPrinter;

    @Column(name = "POSITION_22")
    private String atmHardConfPosition22;

    @Column(name = "POSITION_23")
    private String atmHardConfPosition23;

    @Column(name = "COIN_DISPENSER")
    private String atmHardConfCoinDispenser;

    @Column(name = "SYSTEM_DISPLAY")
    private String atmHardConfSystemDisplay;

    @Column(name = "MEDIA_ENTRY_INDIC")
    private String atmHardConfMediaEntryIndic;

    @Column(name = "ENVELOPE_DISPENSER")
    private String atmHardConfEnvelopeDispenser;

    @Column(name = "DOC_PRO_MODULE")
    private String atmHardConfDocProdModule;

    @Column(name = "COIN_DISPENSING_MODULE")
    private String atmHardConfCoinDispModule;

    @Column(name = "DOC_MOD_TAMP_INDIC")
    private String atmHardConfDocModTampIndic;

    @Column(name = "POSITION_31")
    private String atmHardConfPosition31;

    @Column(name = "VOICE_GUIDANCEC")
    private String atmHardConfVoiceGuidance;

    @Column(name = "POSTION_33")
    private String atmHardConfPosition33;

    @Column(name = "NOTE_ACCEPTOR")
    private String atmHardConfNoteAcceptor;

    @Column(name = "CHEQUE_PROCESSOR")
    private String atmHardConfChequeProcessor;

    @Column(name = "POSITION_36")
    private String atmHardConfPosition36;

    @Column(name = "POSITION_37")
    private String atmHardConfPosition37;

    public String getAtmHardConfId() {
        return atmHardConfId;
    }

    public void setAtmHardConfId(String atmHardConfId) {
        this.atmHardConfId = atmHardConfId;
    }

    public String getAtmHardConfProduct() {
        return atmHardConfProduct;
    }

    public void setAtmHardConfProduct(String atmHardConfProduct) {
        this.atmHardConfProduct = atmHardConfProduct;
    }

    public String getAtmHardConfPosition1() {
        return atmHardConfPosition1;
    }

    public void setAtmHardConfPosition1(String atmHardConfPosition1) {
        this.atmHardConfPosition1 = atmHardConfPosition1;
    }

    public String getAtmHardConfSystemDisk() {
        return atmHardConfSystemDisk;
    }

    public void setAtmHardConfSystemDisk(String atmHardConfSystemDisk) {
        this.atmHardConfSystemDisk = atmHardConfSystemDisk;
    }

    public String getAtmHardConfCardReader() {
        return atmHardConfCardReader;
    }

    public void setAtmHardConfCardReader(String atmHardConfCardReader) {
        this.atmHardConfCardReader = atmHardConfCardReader;
    }

    public String getAtmHardConfCashHandler() {
        return atmHardConfCashHandler;
    }

    public void setAtmHardConfCashHandler(String atmHardConfCashHandler) {
        this.atmHardConfCashHandler = atmHardConfCashHandler;
    }

    public String getAtmHardConfEnvelopeDeposit() {
        return atmHardConfEnvelopeDeposit;
    }

    public void setAtmHardConfEnvelopeDeposit(String atmHardConfEnvelopeDeposit) {
        this.atmHardConfEnvelopeDeposit = atmHardConfEnvelopeDeposit;
    }

    public String getAtmHardConfReceiptPrinter() {
        return atmHardConfReceiptPrinter;
    }

    public void setAtmHardConfReceiptPrinter(String atmHardConfReceiptPrinter) {
        this.atmHardConfReceiptPrinter = atmHardConfReceiptPrinter;
    }

    public String getAtmHardConfJournalPrinter() {
        return atmHardConfJournalPrinter;
    }

    public void setAtmHardConfJournalPrinter(String atmHardConfJournalPrinter) {
        this.atmHardConfJournalPrinter = atmHardConfJournalPrinter;
    }

    public String getAtmHardConfPosition8() {
        return atmHardConfPosition8;
    }

    public void setAtmHardConfPosition8(String atmHardConfPosition8) {
        this.atmHardConfPosition8 = atmHardConfPosition8;
    }

    public String getAtmHardConfPosition9() {
        return atmHardConfPosition9;
    }

    public void setAtmHardConfPosition9(String atmHardConfPosition9) {
        this.atmHardConfPosition9 = atmHardConfPosition9;
    }

    public String getAtmHardConfNightSafeDepo() {
        return atmHardConfNightSafeDepo;
    }

    public void setAtmHardConfNightSafeDepo(String atmHardConfNightSafeDepo) {
        this.atmHardConfNightSafeDepo = atmHardConfNightSafeDepo;
    }

    public String getAtmHardConfEncryptor() {
        return atmHardConfEncryptor;
    }

    public void setAtmHardConfEncryptor(String atmHardConfEncryptor) {
        this.atmHardConfEncryptor = atmHardConfEncryptor;
    }

    public String getAtmHardConfSecurityCamera() {
        return atmHardConfSecurityCamera;
    }

    public void setAtmHardConfSecurityCamera(String atmHardConfSecurityCamera) {
        this.atmHardConfSecurityCamera = atmHardConfSecurityCamera;
    }

    public String getAtmHardConfDoorAccess() {
        return atmHardConfDoorAccess;
    }

    public void setAtmHardConfDoorAccess(String atmHardConfDoorAccess) {
        this.atmHardConfDoorAccess = atmHardConfDoorAccess;
    }

    public String getAtmHardConfFlexDisc() {
        return atmHardConfFlexDisc;
    }

    public void setAtmHardConfFlexDisc(String atmHardConfFlexDisc) {
        this.atmHardConfFlexDisc = atmHardConfFlexDisc;
    }

    public String getAtmHardConfTamperIndication() {
        return atmHardConfTamperIndication;
    }

    public void setAtmHardConfTamperIndication(String atmHardConfTamperIndication) {
        this.atmHardConfTamperIndication = atmHardConfTamperIndication;
    }

    public String getAtmHardConfCarholderKeybord() {
        return atmHardConfCarholderKeybord;
    }

    public void setAtmHardConfCarholderKeybord(String atmHardConfCarholderKeybord) {
        this.atmHardConfCarholderKeybord = atmHardConfCarholderKeybord;
    }

    public String getAtmHardConfOperatorKeybord() {
        return atmHardConfOperatorKeybord;
    }

    public void setAtmHardConfOperatorKeybord(String atmHardConfOperatorKeybord) {
        this.atmHardConfOperatorKeybord = atmHardConfOperatorKeybord;
    }

    public String getAtmHardConfCardHolderDisplayVoice() {
        return atmHardConfCardHolderDisplayVoice;
    }

    public void setAtmHardConfCardHolderDisplayVoice(String atmHardConfCardHolderDisplayVoice) {
        this.atmHardConfCardHolderDisplayVoice = atmHardConfCardHolderDisplayVoice;
    }

    public String getAtmHardConfPosition19() {
        return atmHardConfPosition19;
    }

    public void setAtmHardConfPosition19(String atmHardConfPosition19) {
        this.atmHardConfPosition19 = atmHardConfPosition19;
    }

    public String getAtmHardConfPosition20() {
        return atmHardConfPosition20;
    }

    public void setAtmHardConfPosition20(String atmHardConfPosition20) {
        this.atmHardConfPosition20 = atmHardConfPosition20;
    }

    public String getAtmHardConfStatementPrinter() {
        return atmHardConfStatementPrinter;
    }

    public void setAtmHardConfStatementPrinter(String atmHardConfStatementPrinter) {
        this.atmHardConfStatementPrinter = atmHardConfStatementPrinter;
    }

    public String getAtmHardConfPosition22() {
        return atmHardConfPosition22;
    }

    public void setAtmHardConfPosition22(String atmHardConfPosition22) {
        this.atmHardConfPosition22 = atmHardConfPosition22;
    }

    public String getAtmHardConfPosition23() {
        return atmHardConfPosition23;
    }

    public void setAtmHardConfPosition23(String atmHardConfPosition23) {
        this.atmHardConfPosition23 = atmHardConfPosition23;
    }

    public String getAtmHardConfCoinDispenser() {
        return atmHardConfCoinDispenser;
    }

    public void setAtmHardConfCoinDispenser(String atmHardConfCoinDispenser) {
        this.atmHardConfCoinDispenser = atmHardConfCoinDispenser;
    }

    public String getAtmHardConfSystemDisplay() {
        return atmHardConfSystemDisplay;
    }

    public void setAtmHardConfSystemDisplay(String atmHardConfSystemDisplay) {
        this.atmHardConfSystemDisplay = atmHardConfSystemDisplay;
    }

    public String getAtmHardConfMediaEntryIndic() {
        return atmHardConfMediaEntryIndic;
    }

    public void setAtmHardConfMediaEntryIndic(String atmHardConfMediaEntryIndic) {
        this.atmHardConfMediaEntryIndic = atmHardConfMediaEntryIndic;
    }

    public String getAtmHardConfEnvelopeDispenser() {
        return atmHardConfEnvelopeDispenser;
    }

    public void setAtmHardConfEnvelopeDispenser(String atmHardConfEnvelopeDispenser) {
        this.atmHardConfEnvelopeDispenser = atmHardConfEnvelopeDispenser;
    }

    public String getAtmHardConfDocProdModule() {
        return atmHardConfDocProdModule;
    }

    public void setAtmHardConfDocProdModule(String atmHardConfDocProdModule) {
        this.atmHardConfDocProdModule = atmHardConfDocProdModule;
    }

    public String getAtmHardConfCoinDispModule() {
        return atmHardConfCoinDispModule;
    }

    public void setAtmHardConfCoinDispModule(String atmHardConfCoinDispModule) {
        this.atmHardConfCoinDispModule = atmHardConfCoinDispModule;
    }

    public String getAtmHardConfDocModTampIndic() {
        return atmHardConfDocModTampIndic;
    }

    public void setAtmHardConfDocModTampIndic(String atmHardConfDocModTampIndic) {
        this.atmHardConfDocModTampIndic = atmHardConfDocModTampIndic;
    }

    public String getAtmHardConfPosition31() {
        return atmHardConfPosition31;
    }

    public void setAtmHardConfPosition31(String atmHardConfPosition31) {
        this.atmHardConfPosition31 = atmHardConfPosition31;
    }

    public String getAtmHardConfVoiceGuidance() {
        return atmHardConfVoiceGuidance;
    }

    public void setAtmHardConfVoiceGuidance(String atmHardConfVoiceGuidance) {
        this.atmHardConfVoiceGuidance = atmHardConfVoiceGuidance;
    }

    public String getAtmHardConfPosition33() {
        return atmHardConfPosition33;
    }

    public void setAtmHardConfPosition33(String atmHardConfPosition33) {
        this.atmHardConfPosition33 = atmHardConfPosition33;
    }

    public String getAtmHardConfNoteAcceptor() {
        return atmHardConfNoteAcceptor;
    }

    public void setAtmHardConfNoteAcceptor(String atmHardConfNoteAcceptor) {
        this.atmHardConfNoteAcceptor = atmHardConfNoteAcceptor;
    }

    public String getAtmHardConfChequeProcessor() {
        return atmHardConfChequeProcessor;
    }

    public void setAtmHardConfChequeProcessor(String atmHardConfChequeProcessor) {
        this.atmHardConfChequeProcessor = atmHardConfChequeProcessor;
    }

    public String getAtmHardConfPosition36() {
        return atmHardConfPosition36;
    }

    public void setAtmHardConfPosition36(String atmHardConfPosition36) {
        this.atmHardConfPosition36 = atmHardConfPosition36;
    }

    public String getAtmHardConfPosition37() {
        return atmHardConfPosition37;
    }

    public void setAtmHardConfPosition37(String atmHardConfPosition37) {
        this.atmHardConfPosition37 = atmHardConfPosition37;
    }
}
