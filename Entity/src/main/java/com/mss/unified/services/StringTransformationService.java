package com.mss.unified.services;

public class StringTransformationService {
    private static StringTransformationService instance;

    private StringTransformationService() {
    }

    public static StringTransformationService getInstance() {
        if (instance == null) {
            instance = new StringTransformationService();
        }
        return instance;
    }

    public String hideCardNumber(String cardNumber) {
        return cardNumber.replace(cardNumber.substring(6), "******" + cardNumber.substring(12));
    }

}