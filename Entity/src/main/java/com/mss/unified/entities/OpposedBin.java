package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "OPPOSED_BIN",schema = "PORTEUR")
public
class OpposedBin {

    @Id
    @Column(name = "OPBIN_CODE", nullable = false)
    private int oppBinCode;

    @Column(name = "OPBIN_NUM", nullable = false)
    private String opBinNumber;

    @Column(name = "OPBIN_MOTIF", nullable = false)
    private String motifOpposition;

    @Column(name = "OPBIN_STAR_DATE", nullable = false)
    private Date startDateOpposition;

    @Column(name = "OPBIN_END_DATE", nullable = false)
    private Date endDateOpposition;


    public
    int getOppBinCode() {
        return oppBinCode;
    }

    public
    void setOppBinCode(int oppBinCode) {
        this.oppBinCode = oppBinCode;
    }

    public
    String getOpBinNumber() {
        return opBinNumber;
    }

    public
    void setOpBinNumber(String opBinNumber) {
        this.opBinNumber = opBinNumber;
    }

    public
    String getMotifOpposition() {
        return motifOpposition;
    }

    public
    void setMotifOpposition(String motifOpposition) {
        this.motifOpposition = motifOpposition;
    }

    public
    Date getStartDateOpposition() {
        return startDateOpposition;
    }

    public
    void setStartDateOpposition(Date startDateOpposition) {
        this.startDateOpposition = startDateOpposition;
    }

    public
    Date getEndDateOpposition() {
        return endDateOpposition;
    }

    public
    void setEndDateOpposition(Date endDateOpposition) {
        this.endDateOpposition = endDateOpposition;
    }
}
