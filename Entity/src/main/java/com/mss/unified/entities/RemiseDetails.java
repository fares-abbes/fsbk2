package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "remise_details",schema="POS")
public class RemiseDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;
	private String card_number;
	private String fid_37;
	private String fid_38;
	private String status;
    private String  currency;
    private String Amount;
    private Date created_at;
    private String old_amount;
    @ManyToOne
	private RemiseTotal identify;
    
    
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getFid_37() {
		return fid_37;
	}
	public void setFid_37(String fid_37) {
		this.fid_37 = fid_37;
	}
	public String getFid_38() {
		return fid_38;
	}
	public void setFid_38(String fid_38) {
		this.fid_38 = fid_38;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RemiseTotal getIdentify() {
		return identify;
	}
	public void setIdentify(RemiseTotal identify) {
		this.identify = identify;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getOld_amount() {
		return old_amount;
	}
	public void setOld_amount(String old_amount) {
		this.old_amount = old_amount;
	}
	
}
