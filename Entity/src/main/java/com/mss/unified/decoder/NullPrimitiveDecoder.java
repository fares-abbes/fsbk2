package com.mss.unified.decoder;

public class NullPrimitiveDecoder implements PrimitiveDecoder {
    @Override
    public String decode(String hexString) {
        return hexString;
    }
}
