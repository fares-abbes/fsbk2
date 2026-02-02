package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "ATM", name = "Electoric_Journal")
public class ElectoricJournal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "JournalSequence")
	@SequenceGenerator(name = "JournalSequence", sequenceName = "ATM.JournalSequence", allocationSize = 1)
	@Column(name = "JOURNAL_ID", nullable = false)
	private int journalId;
	
	
	private String card;
	private String dateDab;

	private String timeDab;
	private String dateTr;
	private String heureTr;
	private String numTr;
	private String atm;
	private String num_carte;
	private String montant;
	private String cassette1;
	private String cassette2;
	private String cassette3;
	private String cassette4;
	
	@Column(name = "rejected_T1")
	private String rejectedT1;
	
	@Column(name = "rejected_T2")
	private String rejectedT2;
	
	@Column(name = "rejected_T3")
	private String rejectedT3;
	
	@Column(name = "rejected_T4")
	private String rejectedT4;
	
	@Column(name = "remaining_T1")
	private String remainingT1;
	
	@Column(name = "remaining_T2")
	private String remainingT2;
	@Column(name = "remaining_T3")
	private String remainingT3;

	@Column(name = "remaining_T4")
	private String remainingT4;
	private String timeout;
	private String dateTo;
	private String de38;
	private String transaction_date;
	private String transaction_time;
	private String pan;
	private String responseCode;
	private String mti;
	private String sequenceNumber;
	private String fiidIssuer;
	private String numEnregistrement;
	private String codeAction;
	private String message;
	private String transactionAmount;
	public int getJournalId() {
		return journalId;
	}
	public void setJournalId(int journalId) {
		this.journalId = journalId;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getDateDab() {
		return dateDab;
	}
	public void setDateDab(String dateDab) {
		this.dateDab = dateDab;
	}
	public String getTimeDab() {
		return timeDab;
	}
	public void setTimeDab(String timeDab) {
		this.timeDab = timeDab;
	}
	public String getDateTr() {
		return dateTr;
	}
	public void setDateTr(String dateTr) {
		this.dateTr = dateTr;
	}
	public String getHeureTr() {
		return heureTr;
	}
	public void setHeureTr(String heureTr) {
		this.heureTr = heureTr;
	}
	public String getNumTr() {
		return numTr;
	}
	public void setNumTr(String numTr) {
		this.numTr = numTr;
	}
	public String getAtm() {
		return atm;
	}
	public void setAtm(String atm) {
		this.atm = atm;
	}
	public String getNum_carte() {
		return num_carte;
	}
	public void setNum_carte(String num_carte) {
		this.num_carte = num_carte;
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
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getDe38() {
		return de38;
	}
	public void setDe38(String de38) {
		this.de38 = de38;
	}
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getTransaction_time() {
		return transaction_time;
	}
	public void setTransaction_time(String transaction_time) {
		this.transaction_time = transaction_time;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getMti() {
		return mti;
	}
	public void setMti(String mti) {
		this.mti = mti;
	}
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getFiidIssuer() {
		return fiidIssuer;
	}
	public void setFiidIssuer(String fiidIssuer) {
		this.fiidIssuer = fiidIssuer;
	}
	public String getNumEnregistrement() {
		return numEnregistrement;
	}
	public void setNumEnregistrement(String numEnregistrement) {
		this.numEnregistrement = numEnregistrement;
	}
	public String getCodeAction() {
		return codeAction;
	}
	public void setCodeAction(String codeAction) {
		this.codeAction = codeAction;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}



}
