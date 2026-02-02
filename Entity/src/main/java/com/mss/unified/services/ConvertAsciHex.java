package com.mss.unified.services;

import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Service
public
class ConvertAsciHex {

    public static Charset encodingType = StandardCharsets.UTF_8;

    public
    String convert(String ascii) {


        byte[] buf = null;
        buf = ascii.getBytes(encodingType);
        char[] hexChars = "0123456789abcdef".toCharArray();
        char[] chars = new char[buf.length];
        for (int i = 0; i < buf.length; ++i)
        {
           chars[i] = hexChars[buf[i] & 0x0F];
        }
        return new String(chars).toUpperCase();    }
}