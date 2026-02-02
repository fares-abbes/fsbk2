package com.mss.unified.entities;


import javax.persistence.*;


@Entity
@Table(schema = "FRANSABANK", name = "TOTAL_AMOUNT_INTER")
public class TotalAmountInter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code", nullable = false)
	private int code;
	private String type;
	private String fileDate;
	private String Amount;
	private String choix;
	public String getChoix() {
		return choix;
	}
	public void setChoix(String choix) {
		this.choix = choix;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public String getFileDate() {
		return fileDate;
	}
	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	
	
	
	@Override
	public String toString() {
		return "totalAmountInter [code=" + code + ", type=" + type + ", Date=" + fileDate + ", Amount=" + Amount
				+ ", choix=" + choix + "]";
	}
	
	 

  
}
