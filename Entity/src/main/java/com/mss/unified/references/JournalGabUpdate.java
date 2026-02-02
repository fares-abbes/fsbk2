package com.mss.unified.references;

public class JournalGabUpdate {
	
	private int id;
	private String heuretr;
	private String idTerminal;
	private String timeOut;
	
	public JournalGabUpdate(int id, String heuretr, String idTerminal, String timeOut)
	{
		this.id=id;
		this.heuretr=heuretr;
		this.idTerminal=idTerminal;
		this.timeOut=timeOut;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeuretr() {
		return heuretr;
	}

	public void setHeuretr(String heuretr) {
		this.heuretr = heuretr;
	}

	public String getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	
	
	
}
