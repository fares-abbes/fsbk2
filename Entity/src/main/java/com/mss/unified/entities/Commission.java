package com.mss.unified.entities;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COMMISSION", schema = "PORTEUR")
public class Commission {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "CommissionSequence")
	  @SequenceGenerator(name = "CommissionSequence", sequenceName = "PORTEUR.CommissionSequence", allocationSize = 1)
	  @Column(name = "COMMISSION_CODE", nullable = false)
	  private int commissionCode;

  @Column(name = "ROUTAGE_CODE")
  private Integer transactionSource;
  @Column(name = "PROGRAM_CODE")
  private Integer programCode;

  @Column(name = "FIXED_COMMISSION")
  private String fixedCommission;

  @Column(name = "VARIABLE_COMMISSION")
  private String variableComission;

  @Column(name = "LIBELLE", nullable = false)
  private String libelle;
  @Column(name = "FIXED_COMMISSION_CURRENCY")
  private String currency;
  @ManyToMany(fetch = FetchType.LAZY)
  @Cascade(CascadeType.ALL)
  @JoinTable(name = "TRANS_COMIS",schema = "PORTEUR",
          joinColumns = @JoinColumn(name = "COMMISSION_CODE"),
          inverseJoinColumns = @JoinColumn(name = "CODE_TRANS"))
  private Set<EmvServiceValues> emvServiceValues = new HashSet<>();

  public Commission(Integer transactionSource, String fixedCommission, String variableComission, String libelle, String currency) {
  }


  public Integer getProgramCode() {
    return programCode;
  }

  public void setProgramCode(Integer programCode) {
    this.programCode = programCode;
  }

  public Set<EmvServiceValues> getEmvServiceValues() {
    return emvServiceValues;
  }

  public void setEmvServiceValues(Set<EmvServiceValues> emvServiceValues) {
    this.emvServiceValues = emvServiceValues;
  }

  public Commission(Integer transactionSource,
                    String fixedCommission, String variableComission, String libelle, String currency,int programCode) {
    this.transactionSource = transactionSource;

    this.fixedCommission = fixedCommission;
    this.variableComission = variableComission;
    this.libelle = libelle;
    this.currency = currency;
    this.programCode=programCode;
  }

  public Commission() {

  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getFixedCommission() {
    return fixedCommission;
  }

  public void setFixedCommission(String fixedCommission) {
    this.fixedCommission = fixedCommission;
  }

  public String getVariableComission() {
    return variableComission;
  }

  public void setVariableComission(String variableComission) {
    this.variableComission = variableComission;
  }

  public int getCommissionCode() {
    return commissionCode;
  }

  public void setCommissionCode(int commissionCode) {
    this.commissionCode = commissionCode;
  }

  public Integer getTransactionSource() {
    return transactionSource;
  }

  public void setTransactionSource(Integer transactionSource) {
    this.transactionSource = transactionSource;
  }



  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "Commission{" +
            "commissionCode=" + commissionCode +
            ", transactionSource=" + transactionSource +
            ", fixedCommission='" + fixedCommission + '\'' +
            ", variableComission='" + variableComission + '\'' +
            ", libelle='" + libelle + '\'' +
            ", currency='" + currency + '\'' +
            ", emvServiceValues=" + emvServiceValues +
            '}';
  }
}