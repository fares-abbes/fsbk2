package com.mss.unified.entities;


import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "VISA_SUMMARY",schema = "FRANSABANK")

public class VisaSummary {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  private Integer summaryCode;

  
  @Column(name = "TRANSACTION_CODE")
  private String transactionCode;
  private String processingBin;
  private String processingDate;
  private String settlementDate;
  @Column(name = "Reserved3462")
  private String reserved3462;
  private String releaseNumber;
  private String testOptional;
  private String reserved7176;
  private String outgoingFileId;
  private String reserved80168;
  private String securityCode;
  private String treat;
  private String summary_date;
  private LocalDate dateTraitement;
  @Column(name = "archived", nullable = false, columnDefinition = "int default 0") 
  private int archived;
  
  private Integer treatTransactionList;

  public VisaSummary() {}
  

public VisaSummary(String summary, String summary_date) {
	super();
	this.transactionCode = summary.substring(0, 2);
	this.processingBin = summary.substring(2, 8);
	this.processingDate = summary.substring(8, 13);
	this.settlementDate = summary.substring(19, 24);
	this.reserved3462 = summary.substring(24, 26);
	this.releaseNumber = summary.substring(26, 29);
	this.testOptional = summary.substring(29, 33);
	this.reserved7176 = summary.substring(70, 76);
	this.outgoingFileId = summary.substring(76, 79);
	this.reserved80168 = summary.substring(79, 90);
	this.securityCode = summary.substring(62, 70);
    this.setTreat("M");
	this.summary_date = summary_date;
}


public String getSummary_date() {
	return summary_date;
}

public void setSummary_date(String summary_date) {
	this.summary_date = summary_date;
}

public String getTreat() {
	return treat;
}

public void setTreat(String treat) {
	this.treat = treat;
}

public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public Integer getSummaryCode() {
    return summaryCode;
  }

  public void setSummaryCode(Integer summaryCode) {
    this.summaryCode = summaryCode;
  }

  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  public String getProcessingBin() {
    return processingBin;
  }

  public void setProcessingBin(String processingBin) {
    this.processingBin = processingBin;
  }

  public String getProcessingDate() {
    return processingDate;
  }

  public void setProcessingDate(String processingDate) {
    this.processingDate = processingDate;
  }

  public String getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
  }

  public String getReserved3462() {
    return reserved3462;
  }

  public void setReserved3462(String reserved3462) {
    this.reserved3462 = reserved3462;
  }

  public String getReleaseNumber() {
    return releaseNumber;
  }

  public void setReleaseNumber(String releaseNumber) {
    this.releaseNumber = releaseNumber;
  }

  public String getTestOptional() {
    return testOptional;
  }

  public void setTestOptional(String testOptional) {
    this.testOptional = testOptional;
  }

  public String getReserved7176() {
    return reserved7176;
  }

  public void setReserved7176(String reserved7176) {
    this.reserved7176 = reserved7176;
  }

  public String getOutgoingFileId() {
    return outgoingFileId;
  }

  public void setOutgoingFileId(String outgoingFileId) {
    this.outgoingFileId = outgoingFileId;
  }

  public String getReserved80168() {
    return reserved80168;
  }

  public void setReserved80168(String reserved80168) {
    this.reserved80168 = reserved80168;
  }


public LocalDate getDateTraitement() {
	return dateTraitement;
}


public void setDateTraitement(LocalDate dateTraitement) {
	this.dateTraitement = dateTraitement;
}


public int getArchived() {
	return archived;
}


public void setArchived(int archived) {
	this.archived = archived;
}


public Integer getTreatTransactionList() {
	return treatTransactionList;
}


public void setTreatTransactionList(Integer treatTransactionList) {
	this.treatTransactionList = treatTransactionList;
}
  
}
