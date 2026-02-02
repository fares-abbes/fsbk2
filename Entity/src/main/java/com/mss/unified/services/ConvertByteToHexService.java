package com.mss.unified.services;


import org.springframework.stereotype.Service;

@Service
public
class ConvertByteToHexService {

    public String convertToHex(byte[] b1)
    {

        StringBuilder strBuilder = new StringBuilder();
        for(byte val : b1) {
            strBuilder.append(String.format("%02x", val&0xff));
        }
        return strBuilder.toString();
    }
}
