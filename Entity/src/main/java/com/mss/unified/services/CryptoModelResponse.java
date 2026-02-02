package com.mss.unified.services;

public class CryptoModelResponse {

    private  String tpk;
    private String kcv;
    private String keyU;
    
    
    

    public String getKeyU() {
		return keyU;
	}

	public void setKeyU(String keyU) {
		this.keyU = keyU;
	}

	public String getTpk() {
        return tpk;
    }

    public void setTpk(String tpk) {
        this.tpk = tpk;
    }

    public String getKcv() {
        return kcv;
    }

    public void setKcv(String kcv) {
        this.kcv = kcv;
    }
}