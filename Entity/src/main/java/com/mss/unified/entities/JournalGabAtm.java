package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "JOURNAL_GAB_ATM",schema = "ATM")
public class JournalGabAtm {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "JOURNALGABATMSequence")
    @SequenceGenerator(name = "JOURNALGABATMSequence", sequenceName = "ATM.JOURNALGABATMSequence", allocationSize = 1)

	@Column(name = "Id")
	private int id;
	
	@Column(name = "Card")
	public String card;

	@Column(name = "RRN")
	public String rrn;
	
	@Column(name = "Date")
	public String date;
	
	@Column(name = "GAB")
	public String gab;
	
	@Column(name = "Time")
	public String time;

	@Column(name = "Cassette1")
	public String cassette1;

	@Column(name = "Cassette2")
	public String cassette2;

	@Column(name = "Cassette3")
	public String cassette3;

	@Column(name = "Cassette4")
	public String cassette4;
	
	@Column(name = "RejectedT1")
	public String rejectedT1;
	
	@Column(name = "RejectedT2")
	public String rejectedT2;
	
	@Column(name = "RejectedT3")
	public String rejectedT3;
	
	@Column(name = "RejectedT4")
	public String rejectedT4;
	
	@Column(name = "RemainingT1")
	public String remainingT1;
	
	@Column(name = "RemainingT2")
	public String remainingT2;
	
	@Column(name = "RemainingT3")
	public String remainingT3;
	
	@Column(name = "RemainingT4")
	public String remainingT4;
	
	@Column(name = "DispensedT1")
	public String dispensedT1;
	
	@Column(name = "DispensedT2")
	public String dispensedT2;
	
	@Column(name = "DispensedT3")
	public String dispensedT3;
	
	@Column(name = "DispensedT4")
	public String dispensedT4;
	
	@Column(name = "message", columnDefinition = "NVARCHAR(MAX)") 
	public String message;
	
	@Column(name = "Response")
	public String response;
	
	@Column(name = "Montant")
	public String montant;
	
	@Column(name = "TRX")
	public String trx;
	
	@Column(name = "STATUS_DAB")
	public String statusDab;
	
	@Column(name = "STATUS_SATIM")
	public String statusSatim;

	public String statusSpark;
	public String isExtourne;

	public int getId() {
		return id;
	}

	public String getStatusDab() {
		return statusDab;
	}

	public void setStatusDab(String statusDab) {
		this.statusDab = statusDab;
	}

	public String getStatusSatim() {
		return statusSatim;
	}

	public void setStatusSatim(String statusSatim) {
		this.statusSatim = statusSatim;
	}

	public String getStatusSpark() {
		return statusSpark;
	}

	public void setStatusSpark(String statusSpark) {
		this.statusSpark = statusSpark;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGab() {
		return gab;
	}

	public void setGab(String gab) {
		this.gab = gab;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCassette1() {
		return cassette1;
	}

	public void setCassette1(String cassette1) {
		this.cassette1 = cassette1;
	}

	public String getCassette2() {
		return cassette2;
	}

	public void setCassette2(String cassette2) {
		this.cassette2 = cassette2;
	}

	public String getCassette3() {
		return cassette3;
	}

	public void setCassette3(String cassette3) {
		this.cassette3 = cassette3;
	}

	public String getCassette4() {
		return cassette4;
	}

	public void setCassette4(String cassette4) {
		this.cassette4 = cassette4;
	}

	public String getRejectedT1() {
		return rejectedT1;
	}

	public void setRejectedT1(String rejectedT1) {
		this.rejectedT1 = rejectedT1;
	}

	public String getRejectedT2() {
		return rejectedT2;
	}

	public void setRejectedT2(String rejectedT2) {
		this.rejectedT2 = rejectedT2;
	}

	public String getRejectedT3() {
		return rejectedT3;
	}

	public void setRejectedT3(String rejectedT3) {
		this.rejectedT3 = rejectedT3;
	}

	public String getRejectedT4() {
		return rejectedT4;
	}

	public void setRejectedT4(String rejectedT4) {
		this.rejectedT4 = rejectedT4;
	}

	public String getRemainingT1() {
		return remainingT1;
	}

	public void setRemainingT1(String remainingT1) {
		this.remainingT1 = remainingT1;
	}

	public String getRemainingT2() {
		return remainingT2;
	}

	public void setRemainingT2(String remainingT2) {
		this.remainingT2 = remainingT2;
	}

	public String getRemainingT3() {
		return remainingT3;
	}

	public void setRemainingT3(String remainingT3) {
		this.remainingT3 = remainingT3;
	}

	public String getRemainingT4() {
		return remainingT4;
	}

	public void setRemainingT4(String remainingT4) {
		this.remainingT4 = remainingT4;
	}

	public String getDispensedT1() {
		return dispensedT1;
	}

	public void setDispensedT1(String dispensedT1) {
		this.dispensedT1 = dispensedT1;
	}

	public String getDispensedT2() {
		return dispensedT2;
	}

	public void setDispensedT2(String dispensedT2) {
		this.dispensedT2 = dispensedT2;
	}

	public String getDispensedT3() {
		return dispensedT3;
	}

	public void setDispensedT3(String dispensedT3) {
		this.dispensedT3 = dispensedT3;
	}

	public String getDispensedT4() {
		return dispensedT4;
	}

	public void setDispensedT4(String dispensedT4) {
		this.dispensedT4 = dispensedT4;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getTrx() {
		return trx;
	}

	public void setTrx(String trx) {
		this.trx = trx;
	}



	public String getIsExtourne() {
		return isExtourne;
	}

	public void setIsExtourne(String isExtourne) {
		this.isExtourne = isExtourne;
	}

	@Override
	public String toString() {
		return "JournalGabAtm [id=" + id + ", card=" + card + ", rrn=" + rrn + ", date=" + date + ", gab=" + gab
				+ ", time=" + time + ", cassette1=" + cassette1 + ", cassette2=" + cassette2 + ", cassette3="
				+ cassette3 + ", cassette4=" + cassette4 + ", rejectedT1=" + rejectedT1 + ", rejectedT2=" + rejectedT2
				+ ", rejectedT3=" + rejectedT3 + ", rejectedT4=" + rejectedT4 + ", remainingT1=" + remainingT1
				+ ", remainingT2=" + remainingT2 + ", remainingT3=" + remainingT3 + ", remainingT4=" + remainingT4
				+ ", dispensedT1=" + dispensedT1 + ", dispensedT2=" + dispensedT2 + ", dispensedT3=" + dispensedT3
				+ ", dispensedT4=" + dispensedT4 +  ", response=" + response + ", montant="
				+ montant + ", trx=" + trx + ", statusDab=" + statusDab + ", statusSatim=" + statusSatim
				+ ", statusSpark=" + statusSpark + ", isExtourne=" + isExtourne + "]";
	}
	
	

	
}
