package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_JOURNAL_VALUE",schema = "ATM")
public class AtmPrintJournal {
    @EmbeddedId
    private AtmPrintJournalId atmPrintJournalId;

    @Column(name = "TEXT")
    private String atmPrintJournalStaticText;

    @Column(name = "VARIABLE")
    private String atmPrintJournalValue;

    public AtmPrintJournalId getAtmPrintJournalId() {
        return atmPrintJournalId;
    }

    public void setAtmPrintJournalId(AtmPrintJournalId atmPrintJournalId) {
        this.atmPrintJournalId = atmPrintJournalId;
    }

    public String getAtmPrintJournalStaticText() {
        return atmPrintJournalStaticText;
    }

    public void setAtmPrintJournalStaticText(String atmPrintJournalStaticText) {
        this.atmPrintJournalStaticText = atmPrintJournalStaticText;
    }

    public String getAtmPrintJournalValue() {
        return atmPrintJournalValue;
    }

    public void setAtmPrintJournalValue(String atmPrintJournalValue) {
        this.atmPrintJournalValue = atmPrintJournalValue;
    }
}
