package com.mss.unified.references;

public class IccCurrData {
private String iccCurrType;
	
	private String iccCurrId;
	
	private String iccCurrExp;
	
	public IccCurrData(String iccCurrType,String iccCurrId,String iccCurrExp) 
	{
		this.iccCurrType=iccCurrType;
		this.iccCurrId=iccCurrId;
		this.iccCurrExp=iccCurrExp;
	}

	public String getIccCurrType() {
		return iccCurrType;
	}

	public void setIccCurrType(String iccCurrType) {
		this.iccCurrType = iccCurrType;
	}

	public String getIccCurrId() {
		return iccCurrId;
	}

	public void setIccCurrId(String iccCurrId) {
		this.iccCurrId = iccCurrId;
	}

	public String getIccCurrExp() {
		return iccCurrExp;
	}

	public void setIccCurrExp(String iccCurrExp) {
		this.iccCurrExp = iccCurrExp;
	}


}
