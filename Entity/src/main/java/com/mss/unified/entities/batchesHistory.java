package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BATCHES_HISTORY", schema = "FRANSABANK")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BatchesHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "batchHistorySeq")
    @SequenceGenerator(
            name = "batchHistorySeq",
            sequenceName = "FRANSABANK.BATCHES_HISTORY_SEQ",
            allocationSize = 1
    )
    @Column(name = "BATCH_H_ID", nullable = false)
    private Long batchHId;

    /* ========================
       Relation to BATCHESFC
       ======================== */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BATCH_ID", nullable = true)
    @JsonIgnore
    private BatchesFC batch;

    /* ========================
       Synced from BATCHESFC
       ======================== */
    @Column(name = "BATCH_NAME")
    private String batchName;

    @Column(name = "BATCH_TYPE")
    private String batchType;

    @Column(name = "BATCH_LAST_EXEC")
    private Date batchLastExecution;

    /* ========================
       Execution-specific data
       ======================== */
    @Column(name = "BATCH_H_STARTDATE")
    private Date batchHStartDate;

    @Column(name = "BATCH_H_ENDDATE")
    private Date batchHEndDate;

    @Column(name = "SELECTED_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date selectedStartDate;

    @Column(name = "SELECTED_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date selectedEndDate;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "EXCEPTION", length = 1000)
    private String exception;

    @Column(name = "ERREUR", length = 1000)
    private String erreur;

    @Column(name = "BYPASS_STATUS")
    private Integer bypassStatus;

    @Column(name = "CREATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    /* ========================
       Lifecycle hooks
       ======================== */
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    /* ========================
       Getters & Setters
       ======================== */

    public Long getBatchHId() {
        return batchHId;
    }

    public void setBatchHId(Long batchHId) {
        this.batchHId = batchHId;
    }

    public BatchesFC getBatch() {
        return batch;
    }

    public void setBatch(BatchesFC batch) {
        this.batch = batch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchType() {
        return batchType;
    }

    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }

    public Date getBatchLastExecution() {
        return batchLastExecution;
    }

    public void setBatchLastExecution(Date batchLastExecution) {
        this.batchLastExecution = batchLastExecution;
    }

    public Date getBatchHStartDate() {
        return batchHStartDate;
    }

    public void setBatchHStartDate(Date batchHStartDate) {
        this.batchHStartDate = batchHStartDate;
    }

    public Date getBatchHEndDate() {
        return batchHEndDate;
    }

    public void setBatchHEndDate(Date batchHEndDate) {
        this.batchHEndDate = batchHEndDate;
    }

    public Date getSelectedStartDate() {
        return selectedStartDate;
    }

    public void setSelectedStartDate(Date selectedStartDate) {
        this.selectedStartDate = selectedStartDate;
    }

    public Date getSelectedEndDate() {
        return selectedEndDate;
    }

    public void setSelectedEndDate(Date selectedEndDate) {
        this.selectedEndDate = selectedEndDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getErreur() {
        return erreur;
    }

    public void setErreur(String erreur) {
        this.erreur = erreur;
    }

    public Integer getBypassStatus() {
        return bypassStatus;
    }

    public void setBypassStatus(Integer bypassStatus) {
        this.bypassStatus = bypassStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    /* ========================
       toString (safe)
       ======================== */
    @Override
    public String toString() {
        return "BatchesHistory{" +
                "batchHId=" + batchHId +
                ", batchName='" + batchName + '\'' +
                ", batchType='" + batchType + '\'' +
                ", status=" + status +
                ", batchHStartDate=" + batchHStartDate +
                ", batchHEndDate=" + batchHEndDate +
                '}';
    }
}
