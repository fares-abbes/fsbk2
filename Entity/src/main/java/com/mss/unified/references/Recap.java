package com.mss.unified.references;

public class Recap {
	private Double totalTrans;

	public Double getTotalTrans() {
		return totalTrans;
	}

	public void setTotalTrans(Double totalTrans) {
		this.totalTrans = totalTrans;
	}

	private Double total;
	private Long nb;
	private String bank;
	private String fileDate;

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Long getNb() {
		return nb;
	}

	public void setNb(Long nb) {
		this.nb = nb;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Recap(Double total, Long nb, Double totalTrans) {
		if (total == null) {
			total = 0.0;
		}
		if (totalTrans == null) {
			totalTrans = 0.0;
		}
		this.totalTrans = totalTrans;
		this.total = total;
		this.nb = nb;
	}

	public Recap(Double total, Long nb) {
		if (total == null) {
			total = 0.0;
		}
		totalTrans = 0.0;
		this.total = total;
		this.nb = nb;
	}

	public Recap(Double total, Long nb, String fileDate) {
		if (total == null) {
			total = 0.0;
		}
		totalTrans = 0.0;
		this.total = total;
		this.nb = nb;
		this.fileDate = fileDate;
	}

	public Recap(String bank, Double total, Long nb) {
		if (total == null) {
			total = 0.0;
		}
		totalTrans = 0.0;
		this.total = total;
		this.nb = nb;
		this.bank = bank;
	}

	public Recap(Double totalTrans, Double total, Long nb, String bank) {
		super();
		this.totalTrans = totalTrans;
		this.total = total;
		this.nb = nb;
		this.bank = bank;
		this.fileDate = fileDate;
	}

	@Override
	public String toString() {
		return "Recap [totalTrans=" + totalTrans + ", total=" + total + ", nb=" + nb + ", bank=" + bank + ", fileDate="
				+ fileDate + "]";
	}

}