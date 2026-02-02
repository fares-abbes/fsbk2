package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AtmPrintJournalId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "TRANSACTION_CODE", nullable = false)
    private String atmPrintJournalTransId;

    @Column(name = "NUM_LIGNE", nullable = false)
    private int atmPrintJournalLineId;

    @Column(name = "NUM_COLONNE", nullable = false)
    private int atmPrintJournalColumnId;

    @Column(name = "ATM_JOURNAL_ID", nullable = false)
    private String atmPrintJournalConfigId;

    public String getAtmPrintJournalTransId() {
        return atmPrintJournalTransId;
    }

    public void setAtmPrintJournalTransId(String atmPrintJournalTransId) {
        this.atmPrintJournalTransId = atmPrintJournalTransId;
    }

    public int getAtmPrintJournalLineId() {
        return atmPrintJournalLineId;
    }

    public void setAtmPrintJournalLineId(int atmPrintJournalLineId) {
        this.atmPrintJournalLineId = atmPrintJournalLineId;
    }

    public int getAtmPrintJournalColumnId() {
        return atmPrintJournalColumnId;
    }

    public void setAtmPrintJournalColumnId(int atmPrintJournalColumnId) {
        this.atmPrintJournalColumnId = atmPrintJournalColumnId;
    }

    public String getAtmPrintJournalConfigId() {
        return atmPrintJournalConfigId;
    }

    public void setAtmPrintJournalConfigId(String atmPrintJournalConfigId) {
        this.atmPrintJournalConfigId = atmPrintJournalConfigId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AtmPrintJournalId))
            return false;
        AtmPrintJournalId that = (AtmPrintJournalId) o;
        return Objects.equals(getAtmPrintJournalTransId(), that.getAtmPrintJournalTransId())
                && Objects.equals(getAtmPrintJournalLineId(), that.getAtmPrintJournalLineId())
                && Objects.equals(getAtmPrintJournalColumnId(), that.getAtmPrintJournalColumnId())
                && Objects.equals(getAtmPrintJournalConfigId(), that.getAtmPrintJournalConfigId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmPrintJournalTransId(), getAtmPrintJournalLineId(),getAtmPrintJournalColumnId(),
                getAtmPrintJournalConfigId());
    }

}
