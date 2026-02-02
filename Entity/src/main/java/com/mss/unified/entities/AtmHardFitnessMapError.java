package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_HARD_FIT_MAP_ERR",schema = "ATM")
public class AtmHardFitnessMapError {
    @Id
    @Column(name = "AHFME_CODE", nullable = false)
    private String atmHardFitnessErrorId;

    @Column(name = "TIME_DAY_CLOCK")
    private String atmHardFitnessTimeDay;

    @Column(name = "HIGH_ORDER_COMM")
    private String atmHardFitnessHighOrderCom;

    @Column(name = "SYSTEM_DISK")
    private String atmHardFitnessSystemDisk;

    @Column(name = "CARD_READER")
    private String atmHardFitnessCardReader;

    @Column(name = "CASH_HANDLER")
    private String atmHardFitnessCashHandler;

    @Column(name = "DEPOSITROY")
    private String atmHardFitnessDepository;

    @Column(name = "RECEIPT_PRINTER")
    private String atmHardFitnessReceiptPrinter;

    @Column(name = "JOURNAL_PRINTER")
    private String atmHardFitnessJournalPrinter;

    @Column(name = "POSITION_8")
    private String atmHardFitnessPosition8;

    @Column(name = "POSITION_9")
    private String atmHardFitnessPosition9;

    @Column(name = "NIGHT_SAFE_DEPOSIT")
    private String atmHardFitnessNightSafeDeposit;

    @Column(name = "ENCRYPTOR")
    private String atmHardFitnessEncryptor;

    @Column(name = "SECURITY_CAMERA")
    private String atmHardFitnessSecurityCamera;

    @Column(name = "DOOR_ACCESS")
    private String atmHardFitnessDoorAccess;

    @Column(name = "FLEX_DISK")
    private String atmHardFitnessFlexDisk;

    @Column(name = "CASSETTE_TYPE_1")
    private String atmHardFitnessCassType1;

    @Column(name = "CASSETTE_TYPE_2")
    private String atmHardFitnessCassType2;

    @Column(name = "CASSETTE_TYPE_3")
    private String atmHardFitnessCassType3;

    @Column(name = "CASSETTE_TYPE_4")
    private String atmHardFitnessCassType4;

    @Column(name = "POSITION_19")
    private String atmHardFitnessPosition19;

    @Column(name = "POSITION_20")
    private String atmHardFitnessPosition20;

    @Column(name = "STATEMENT_PRINTER")
    private String atmHardFitnessStatementPrinter;

    @Column(name = "SIGNAGE_DISPLAY")
    private String atmHardFitnessSignageDisplay;

    @Column(name = "POSITION_23")
    private String atmHardFitnessPosition23;

    @Column(name = "POSITION_24")
    private String atmHardFitnessPosition24;

    @Column(name = "SYSTEM_DISPLAY")
    private String atmHardFitnessSystemDisplay;

    @Column(name = "MEDIA_ENTRY_INDI")
    private String atmHardFitnessMediaEntryIndi;

    @Column(name = "ENVELOPE_DISPENSER")
    private String atmHardFitnessEnvelopeDispenser;

    @Column(name = "DOC_PROC_MODULE")
    private String atmHardFitnessDocProcModule;

    @Column(name = "COIN_DISPENSING_MODULE")
    private String atmHardFitnessCoinDispModule;

    @Column(name = "DOC_PROC_TAMP")
    private String atmHardFitnessDocModTamper;

    @Column(name = "POSITION_31")
    private String atmHardFitnessPosition31;

    @Column(name = "VOICE_GUIDE")
    private String atmHardFitnessVoiceGuideSystem;

    @Column(name = "POSITION_33")
    private String atmHardFitnessPosition33;

    @Column(name = "BRUNCH_NOTE_ACCEPTOR")
    private String atmHardFitnessBrunchNoteAcceptor;

    @Column(name = "CHEQUE_PROCESSOR")
    private String atmHardFitnessChequeProcessor;

    @Column(name = "BIOMETRIC_PROC")
    private String atmHardFitnessBiometricCapture;

    @Column(name = "POSITION_37")
    private String atmHardFitnessPosition37;

    public String getAtmHardFitnessErrorId() {
        return atmHardFitnessErrorId;
    }

    public void setAtmHardFitnessErrorId(String atmHardFitnessErrorId) {
        this.atmHardFitnessErrorId = atmHardFitnessErrorId;
    }

    public String getAtmHardFitnessTimeDay() {
        return atmHardFitnessTimeDay;
    }

    public void setAtmHardFitnessTimeDay(String atmHardFitnessTimeDay) {
        this.atmHardFitnessTimeDay = atmHardFitnessTimeDay;
    }

    public String getAtmHardFitnessHighOrderCom() {
        return atmHardFitnessHighOrderCom;
    }

    public void setAtmHardFitnessHighOrderCom(String atmHardFitnessHighOrderCom) {
        this.atmHardFitnessHighOrderCom = atmHardFitnessHighOrderCom;
    }

    public String getAtmHardFitnessSystemDisk() {
        return atmHardFitnessSystemDisk;
    }

    public void setAtmHardFitnessSystemDisk(String atmHardFitnessSystemDisk) {
        this.atmHardFitnessSystemDisk = atmHardFitnessSystemDisk;
    }

    public String getAtmHardFitnessCardReader() {
        return atmHardFitnessCardReader;
    }

    public void setAtmHardFitnessCardReader(String atmHardFitnessCardReader) {
        this.atmHardFitnessCardReader = atmHardFitnessCardReader;
    }

    public String getAtmHardFitnessCashHandler() {
        return atmHardFitnessCashHandler;
    }

    public void setAtmHardFitnessCashHandler(String atmHardFitnessCashHandler) {
        this.atmHardFitnessCashHandler = atmHardFitnessCashHandler;
    }

    public String getAtmHardFitnessDepository() {
        return atmHardFitnessDepository;
    }

    public void setAtmHardFitnessDepository(String atmHardFitnessDepository) {
        this.atmHardFitnessDepository = atmHardFitnessDepository;
    }

    public String getAtmHardFitnessReceiptPrinter() {
        return atmHardFitnessReceiptPrinter;
    }

    public void setAtmHardFitnessReceiptPrinter(String atmHardFitnessReceiptPrinter) {
        this.atmHardFitnessReceiptPrinter = atmHardFitnessReceiptPrinter;
    }

    public String getAtmHardFitnessJournalPrinter() {
        return atmHardFitnessJournalPrinter;
    }

    public void setAtmHardFitnessJournalPrinter(String atmHardFitnessJournalPrinter) {
        this.atmHardFitnessJournalPrinter = atmHardFitnessJournalPrinter;
    }

    public String getAtmHardFitnessPosition8() {
        return atmHardFitnessPosition8;
    }

    public void setAtmHardFitnessPosition8(String atmHardFitnessPosition8) {
        this.atmHardFitnessPosition8 = atmHardFitnessPosition8;
    }

    public String getAtmHardFitnessPosition9() {
        return atmHardFitnessPosition9;
    }

    public void setAtmHardFitnessPosition9(String atmHardFitnessPosition9) {
        this.atmHardFitnessPosition9 = atmHardFitnessPosition9;
    }

    public String getAtmHardFitnessNightSafeDeposit() {
        return atmHardFitnessNightSafeDeposit;
    }

    public void setAtmHardFitnessNightSafeDeposit(String atmHardFitnessNightSafeDeposit) {
        this.atmHardFitnessNightSafeDeposit = atmHardFitnessNightSafeDeposit;
    }

    public String getAtmHardFitnessEncryptor() {
        return atmHardFitnessEncryptor;
    }

    public void setAtmHardFitnessEncryptor(String atmHardFitnessEncryptor) {
        this.atmHardFitnessEncryptor = atmHardFitnessEncryptor;
    }

    public String getAtmHardFitnessSecurityCamera() {
        return atmHardFitnessSecurityCamera;
    }

    public void setAtmHardFitnessSecurityCamera(String atmHardFitnessSecurityCamera) {
        this.atmHardFitnessSecurityCamera = atmHardFitnessSecurityCamera;
    }

    public String getAtmHardFitnessDoorAccess() {
        return atmHardFitnessDoorAccess;
    }

    public void setAtmHardFitnessDoorAccess(String atmHardFitnessDoorAccess) {
        this.atmHardFitnessDoorAccess = atmHardFitnessDoorAccess;
    }

    public String getAtmHardFitnessFlexDisk() {
        return atmHardFitnessFlexDisk;
    }

    public void setAtmHardFitnessFlexDisk(String atmHardFitnessFlexDisk) {
        this.atmHardFitnessFlexDisk = atmHardFitnessFlexDisk;
    }

    public String getAtmHardFitnessCassType1() {
        return atmHardFitnessCassType1;
    }

    public void setAtmHardFitnessCassType1(String atmHardFitnessCassType1) {
        this.atmHardFitnessCassType1 = atmHardFitnessCassType1;
    }

    public String getAtmHardFitnessCassType2() {
        return atmHardFitnessCassType2;
    }

    public void setAtmHardFitnessCassType2(String atmHardFitnessCassType2) {
        this.atmHardFitnessCassType2 = atmHardFitnessCassType2;
    }

    public String getAtmHardFitnessCassType3() {
        return atmHardFitnessCassType3;
    }

    public void setAtmHardFitnessCassType3(String atmHardFitnessCassType3) {
        this.atmHardFitnessCassType3 = atmHardFitnessCassType3;
    }

    public String getAtmHardFitnessCassType4() {
        return atmHardFitnessCassType4;
    }

    public void setAtmHardFitnessCassType4(String atmHardFitnessCassType4) {
        this.atmHardFitnessCassType4 = atmHardFitnessCassType4;
    }

    public String getAtmHardFitnessPosition19() {
        return atmHardFitnessPosition19;
    }

    public void setAtmHardFitnessPosition19(String atmHardFitnessPosition19) {
        this.atmHardFitnessPosition19 = atmHardFitnessPosition19;
    }

    public String getAtmHardFitnessPosition20() {
        return atmHardFitnessPosition20;
    }

    public void setAtmHardFitnessPosition20(String atmHardFitnessPosition20) {
        this.atmHardFitnessPosition20 = atmHardFitnessPosition20;
    }

    public String getAtmHardFitnessStatementPrinter() {
        return atmHardFitnessStatementPrinter;
    }

    public void setAtmHardFitnessStatementPrinter(String atmHardFitnessStatementPrinter) {
        this.atmHardFitnessStatementPrinter = atmHardFitnessStatementPrinter;
    }

    public String getAtmHardFitnessSignageDisplay() {
        return atmHardFitnessSignageDisplay;
    }

    public void setAtmHardFitnessSignageDisplay(String atmHardFitnessSignageDisplay) {
        this.atmHardFitnessSignageDisplay = atmHardFitnessSignageDisplay;
    }

    public String getAtmHardFitnessPosition23() {
        return atmHardFitnessPosition23;
    }

    public void setAtmHardFitnessPosition23(String atmHardFitnessPosition23) {
        this.atmHardFitnessPosition23 = atmHardFitnessPosition23;
    }

    public String getAtmHardFitnessPosition24() {
        return atmHardFitnessPosition24;
    }

    public void setAtmHardFitnessPosition24(String atmHardFitnessPosition24) {
        this.atmHardFitnessPosition24 = atmHardFitnessPosition24;
    }

    public String getAtmHardFitnessSystemDisplay() {
        return atmHardFitnessSystemDisplay;
    }

    public void setAtmHardFitnessSystemDisplay(String atmHardFitnessSystemDisplay) {
        this.atmHardFitnessSystemDisplay = atmHardFitnessSystemDisplay;
    }

    public String getAtmHardFitnessMediaEntryIndi() {
        return atmHardFitnessMediaEntryIndi;
    }

    public void setAtmHardFitnessMediaEntryIndi(String atmHardFitnessMediaEntryIndi) {
        this.atmHardFitnessMediaEntryIndi = atmHardFitnessMediaEntryIndi;
    }

    public String getAtmHardFitnessEnvelopeDispenser() {
        return atmHardFitnessEnvelopeDispenser;
    }

    public void setAtmHardFitnessEnvelopeDispenser(String atmHardFitnessEnvelopeDispenser) {
        this.atmHardFitnessEnvelopeDispenser = atmHardFitnessEnvelopeDispenser;
    }

    public String getAtmHardFitnessDocProcModule() {
        return atmHardFitnessDocProcModule;
    }

    public void setAtmHardFitnessDocProcModule(String atmHardFitnessDocProcModule) {
        this.atmHardFitnessDocProcModule = atmHardFitnessDocProcModule;
    }

    public String getAtmHardFitnessCoinDispModule() {
        return atmHardFitnessCoinDispModule;
    }

    public void setAtmHardFitnessCoinDispModule(String atmHardFitnessCoinDispModule) {
        this.atmHardFitnessCoinDispModule = atmHardFitnessCoinDispModule;
    }

    public String getAtmHardFitnessDocModTamper() {
        return atmHardFitnessDocModTamper;
    }

    public void setAtmHardFitnessDocModTamper(String atmHardFitnessDocModTamper) {
        this.atmHardFitnessDocModTamper = atmHardFitnessDocModTamper;
    }

    public String getAtmHardFitnessPosition31() {
        return atmHardFitnessPosition31;
    }

    public void setAtmHardFitnessPosition31(String atmHardFitnessPosition31) {
        this.atmHardFitnessPosition31 = atmHardFitnessPosition31;
    }

    public String getAtmHardFitnessVoiceGuideSystem() {
        return atmHardFitnessVoiceGuideSystem;
    }

    public void setAtmHardFitnessVoiceGuideSystem(String atmHardFitnessVoiceGuideSystem) {
        this.atmHardFitnessVoiceGuideSystem = atmHardFitnessVoiceGuideSystem;
    }

    public String getAtmHardFitnessPosition33() {
        return atmHardFitnessPosition33;
    }

    public void setAtmHardFitnessPosition33(String atmHardFitnessPosition33) {
        this.atmHardFitnessPosition33 = atmHardFitnessPosition33;
    }

    public String getAtmHardFitnessBrunchNoteAcceptor() {
        return atmHardFitnessBrunchNoteAcceptor;
    }

    public void setAtmHardFitnessBrunchNoteAcceptor(String atmHardFitnessBrunchNoteAcceptor) {
        this.atmHardFitnessBrunchNoteAcceptor = atmHardFitnessBrunchNoteAcceptor;
    }

    public String getAtmHardFitnessChequeProcessor() {
        return atmHardFitnessChequeProcessor;
    }

    public void setAtmHardFitnessChequeProcessor(String atmHardFitnessChequeProcessor) {
        this.atmHardFitnessChequeProcessor = atmHardFitnessChequeProcessor;
    }

    public String getAtmHardFitnessBiometricCapture() {
        return atmHardFitnessBiometricCapture;
    }

    public void setAtmHardFitnessBiometricCapture(String atmHardFitnessBiometricCapture) {
        this.atmHardFitnessBiometricCapture = atmHardFitnessBiometricCapture;
    }

    public String getAtmHardFitnessPosition37() {
        return atmHardFitnessPosition37;
    }

    public void setAtmHardFitnessPosition37(String atmHardFitnessPosition37) {
        this.atmHardFitnessPosition37 = atmHardFitnessPosition37;
    }

}
