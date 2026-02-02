package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "JOURNAL_GAB",schema = "ATM")
public class JournalGab {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "JOURNALGABSequence")
    @SequenceGenerator(name = "JOURNALGABSequence", sequenceName = "ATM.JOURNALGABSequence", allocationSize = 1)

	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "Card")
	public String card;

	@Column(name = "AuthCode")
	public String authCode;
	
	@Column(name = "UTRNNO")
	public String utrnno;
	
	@Column(name = "ATM")
	public String atm;
	
	@Column(name = "Montant")
	public String montant;

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
	
	@Column(name = "DateTR")
	public String dateTR;
	
	@Column(name = "HeureTR")
	public String heureTR;
	
	@Column(name = "IdTerminal")
	public String idTerminal;
	
	@Column(name = "StatusSmt")
	public String statusSmt;
	
	@Column(name = "StatusDab")
	public String statusDab;

	public int getId() {
		return id;
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

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getUtrnno() {
		return utrnno;
	}

	public void setUtrnno(String utrnno) {
		this.utrnno = utrnno;
	}

	public String getAtm() {
		return atm;
	}

	public void setAtm(String atm) {
		this.atm = atm;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
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

	public String getDateTR() {
		return dateTR;
	}

	public void setDateTR(String dateTR) {
		this.dateTR = dateTR;
	}

	public String getHeureTR() {
		return heureTR;
	}

	public void setHeureTR(String heureTR) {
		this.heureTR = heureTR;
	}

	public String getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}

	public String getStatusSmt() {
		return statusSmt;
	}

	public void setStatusSmt(String statusSmt) {
		this.statusSmt = statusSmt;
	}

	public String getStatusDab() {
		return statusDab;
	}

	public void setStatusDab(String statusDab) {
		this.statusDab = statusDab;
	}

	
	
	

}
