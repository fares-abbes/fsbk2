package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BATCH_EXEC", schema = "FRANSABANK")
public class BatchExec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "batchExecSeq")
    @SequenceGenerator(
        name = "batchExecSeq",
        sequenceName = "FRANSABANK.BATCH_EXEC_SEQ",
        allocationSize = 1
    )
    @Column(name = "BATCH_EXEC_ID", nullable = false)
    private Long batchExecId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_DATE")
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_DATE")
    private Date endDate;

    public Long getBatchExecId() {
    return batchExecId;
}

public void setBatchExecId(Long batchExecId) {
    this.batchExecId = batchExecId;
}

public Date getStartDate() {
    return startDate;
}

public void setStartDate(Date startDate) {
    this.startDate = startDate;
}

public Date getEndDate() {
    return endDate;
}

public void setEndDate(Date endDate) {
    this.endDate = endDate;
}

}
