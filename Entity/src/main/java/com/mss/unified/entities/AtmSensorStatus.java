package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_SENSOR_STATUS",schema = "ATM")
public class AtmSensorStatus {

    @Id
    @Column(name = "ATE_ID", nullable = false)
    private String atmSensorId;

    @Column(name = "SUPERIVISOR_MODE")
    private String atmSensorSupervisorMode;

    @Column(name = "VIBRATION_HEAT_SENSOR")
    private String atmSensorVibrationHeat;

    @Column(name = "DOOR_CONTACT_SENSOR")
    private String atmSensorDoorContact;

    @Column(name = "SILENT_SIGNAL_SENSOR")
    private String atmSensorSilentSignal;

    @Column(name = "ELECTRONICS_ENCLISURE")
    private String atmSensorElectronic;

    @Column(name = "DEPOSIT_BIN_OUT")
    private String atmSensorDepositBin;

    @Column(name = "POSITION_8")
    private String atmSensorPosition8;

    @Column(name = "CURRENCY_REJECT_BIN")
    private String atmSensorCurrencyReject;

    @Column(name = "CURR_CASS_IN_POS1")
    private String atmSensorCurrCass1;

    @Column(name = "CURR_CASS_IN_POS2")
    private String atmSensorCurrCass2;

    @Column(name = "CURR_CASS_IN_POS3")
    private String atmSensorCurrCass3;

    @Column(name = "CURR_CASS_IN_POS4")
    private String atmSensorCurrCass4;

    public String getAtmSensorId() {
        return atmSensorId;
    }

    public void setAtmSensorId(String atmSensorId) {
        this.atmSensorId = atmSensorId;
    }

    public String getAtmSensorSupervisorMode() {
        return atmSensorSupervisorMode;
    }

    public void setAtmSensorSupervisorMode(String atmSensorSupervisorMode) {
        this.atmSensorSupervisorMode = atmSensorSupervisorMode;
    }

    public String getAtmSensorVibrationHeat() {
        return atmSensorVibrationHeat;
    }

    public void setAtmSensorVibrationHeat(String atmSensorVibrationHeat) {
        this.atmSensorVibrationHeat = atmSensorVibrationHeat;
    }

    public String getAtmSensorDoorContact() {
        return atmSensorDoorContact;
    }

    public void setAtmSensorDoorContact(String atmSensorDoorContact) {
        this.atmSensorDoorContact = atmSensorDoorContact;
    }

    public String getAtmSensorSilentSignal() {
        return atmSensorSilentSignal;
    }

    public void setAtmSensorSilentSignal(String atmSensorSilentSignal) {
        this.atmSensorSilentSignal = atmSensorSilentSignal;
    }

    public String getAtmSensorElectronic() {
        return atmSensorElectronic;
    }

    public void setAtmSensorElectronic(String atmSensorElectronic) {
        this.atmSensorElectronic = atmSensorElectronic;
    }

    public String getAtmSensorDepositBin() {
        return atmSensorDepositBin;
    }

    public void setAtmSensorDepositBin(String atmSensorDepositBin) {
        this.atmSensorDepositBin = atmSensorDepositBin;
    }

    public String getAtmSensorPosition8() {
        return atmSensorPosition8;
    }

    public void setAtmSensorPosition8(String atmSensorPosition8) {
        this.atmSensorPosition8 = atmSensorPosition8;
    }

    public String getAtmSensorCurrencyReject() {
        return atmSensorCurrencyReject;
    }

    public void setAtmSensorCurrencyReject(String atmSensorCurrencyReject) {
        this.atmSensorCurrencyReject = atmSensorCurrencyReject;
    }

    public String getAtmSensorCurrCass1() {
        return atmSensorCurrCass1;
    }

    public void setAtmSensorCurrCass1(String atmSensorCurrCass1) {
        this.atmSensorCurrCass1 = atmSensorCurrCass1;
    }

    public String getAtmSensorCurrCass2() {
        return atmSensorCurrCass2;
    }

    public void setAtmSensorCurrCass2(String atmSensorCurrCass2) {
        this.atmSensorCurrCass2 = atmSensorCurrCass2;
    }

    public String getAtmSensorCurrCass3() {
        return atmSensorCurrCass3;
    }

    public void setAtmSensorCurrCass3(String atmSensorCurrCass3) {
        this.atmSensorCurrCass3 = atmSensorCurrCass3;
    }

    public String getAtmSensorCurrCass4() {
        return atmSensorCurrCass4;
    }

    public void setAtmSensorCurrCass4(String atmSensorCurrCass4) {
        this.atmSensorCurrCass4 = atmSensorCurrCass4;
    }
}
