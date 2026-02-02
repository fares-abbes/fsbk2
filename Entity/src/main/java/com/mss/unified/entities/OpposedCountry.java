package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "OPPOSED_COUNTRY",schema = "PORTEUR")
public
class OpposedCountry {


    @Id
    @Column(name = "OPCOUN_CODE", nullable = false)
    private String opcountryCode;

    @Column(name = "OPCOUN_NUM")
    private long opCountryNumber;
    @Column(name = "OPCOUN_STAR_DATE")
    private Date opCountryStartDate;

    @Column(name = "OPCOUN_END_DATE", nullable = false)
    private Date opCountryEndDate;

    @Column(name = "OPCOUN_MOTIF")
    private long opCountryMotif;

    public
    String getOpcountryCode() {
        return opcountryCode;
    }

    public
    void setOpcountryCode(String opcountryCode) {
        this.opcountryCode = opcountryCode;
    }

    public
    long getOpCountryNumber() {
        return opCountryNumber;
    }

    public
    void setOpCountryNumber(long opCountryNumber) {
        this.opCountryNumber = opCountryNumber;
    }

    public
    Date getOpCountryStartDate() {
        return opCountryStartDate;
    }

    public
    void setOpCountryStartDate(Date opCountryStartDate) {
        this.opCountryStartDate = opCountryStartDate;
    }

    public
    Date getOpCountryEndDate() {
        return opCountryEndDate;
    }

    public
    void setOpCountryEndDate(Date opCountryEndDate) {
        this.opCountryEndDate = opCountryEndDate;
    }

    public
    long getOpCountryMotif() {
        return opCountryMotif;
    }

    public
    void setOpCountryMotif(long opCountryMotif) {
        this.opCountryMotif = opCountryMotif;
    }
}
