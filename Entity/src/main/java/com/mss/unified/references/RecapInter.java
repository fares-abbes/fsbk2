package com.mss.unified.references;

public class RecapInter {
	private Double mntSett;
	private Double transactionMnt;

	private long nb;
	private String CurSett;
	private String CurTran;
	public RecapInter(double mntSett, double transactionMnt, long nb, String curSett, String curTran) {
		super();
		this.mntSett =  mntSett;
		this.transactionMnt =  transactionMnt;
		this.nb = nb;
		CurSett = curSett;
		CurTran = curTran;
	}
 
	@Override
	public String toString() {
		return "RecapInter [mntSett=" + mntSett + ", transactionMnt=" + transactionMnt + ", nb=" + nb + ", CurSett="
				+ CurSett + ", CurTran=" + CurTran + "]";
	}

	public double getMntSett() {
		return mntSett;
	}

	public void setMntSett(double mntSett) {
		this.mntSett = mntSett;
	}

	public double getTransactionMnt() {
		return transactionMnt;
	}

	public void setTransactionMnt(double transactionMnt) {
		this.transactionMnt = transactionMnt;
	}

 

	public long getNb() {
		return nb;
	}

	public void setNb(long nb) {
		this.nb = nb;
	}

	public void setMntSett(Double mntSett) {
		this.mntSett = mntSett;
	}

	public void setTransactionMnt(Double transactionMnt) {
		this.transactionMnt = transactionMnt;
	}

	public String getCurSett() {
		return CurSett;
	}

	public void setCurSett(String curSett) {
		CurSett = curSett;
	}

	public String getCurTran() {
		return CurTran;
	}

	public void setCurTran(String curTran) {
		CurTran = curTran;
	}



}