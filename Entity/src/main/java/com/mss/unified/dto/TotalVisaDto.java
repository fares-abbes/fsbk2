package com.mss.unified.dto;

public class TotalVisaDto {
	
	private Double secondAmount;
    private Double thirdAmount;


    public TotalVisaDto(Double secondAmount, Double thirdAmount) {
        this.secondAmount = secondAmount != null ? secondAmount : 0;
        this.thirdAmount = thirdAmount != null ? thirdAmount : 0;
    }

    
    public Double getSecondAmount() {
        return secondAmount;
    }

    public void setSecondAmount(Double secondAmount) {
        this.secondAmount = secondAmount;
    }

    public Double getThirdAmount() {
        return thirdAmount;
    }

    public void setThirdAmount(Double thirdAmount) {
        this.thirdAmount = thirdAmount;
    }

    public boolean isTotalNul(){
        return this.secondAmount == 0 && this.thirdAmount == 0;
    }
}
