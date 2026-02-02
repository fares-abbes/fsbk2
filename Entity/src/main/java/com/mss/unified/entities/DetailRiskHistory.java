package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DetailRiskHistory",schema = "PORTEUR")
public class DetailRiskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DetailRiskHistorySequence")
    @SequenceGenerator(name = "DetailRiskHistorySequence", sequenceName = "PORTEUR.DetailRiskHistorySequence", allocationSize = 1)
    private int DetailRiskHistoryCode;

    @Column(name = "DRM_TR_AMOUNT_MIN")
    private long minAmount;
    @Column(name = "DRM_TR_code")
    private String transactionCode;
    
    @Column(name = "GLOBAL_CODE")
    private int globalCode;
    @Column(name = "DR_TR_AMOUNT_MAX")
    private long maxAmount;

    @Column(name = "DR_AMOUNT_LIMIT", nullable = false)
    private String drAmountLimit;

    @Column(name = "DR_NUMEBR_LIMIT")
    private long drNumberLimit;


    private int typePeriodicity;

    private int globalhistoryCode;

	public int getDetailRiskHistoryCode() {
		return DetailRiskHistoryCode;
	}

	public void setDetailRiskHistoryCode(int detailRiskHistoryCode) {
		DetailRiskHistoryCode = detailRiskHistoryCode;
	}

	public long getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(long minAmount) {
		this.minAmount = minAmount;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public int getGlobalCode() {
		return globalCode;
	}

	public void setGlobalCode(int globalCode) {
		this.globalCode = globalCode;
	}

	public long getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getDrAmountLimit() {
		return drAmountLimit;
	}

	public void setDrAmountLimit(String drAmountLimit) {
		this.drAmountLimit = drAmountLimit;
	}

	public long getDrNumberLimit() {
		return drNumberLimit;
	}

	public void setDrNumberLimit(long drNumberLimit) {
		this.drNumberLimit = drNumberLimit;
	}

	public int getTypePeriodicity() {
		return typePeriodicity;
	}

	public void setTypePeriodicity(int typePeriodicity) {
		this.typePeriodicity = typePeriodicity;
	}

	public int getGlobalhistoryCode() {
		return globalhistoryCode;
	}

	public void setGlobalhistoryCode(int globalhistoryCode) {
		this.globalhistoryCode = globalhistoryCode;
	}
    


}
