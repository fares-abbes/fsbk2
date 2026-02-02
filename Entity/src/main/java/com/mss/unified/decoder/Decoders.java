package com.mss.unified.decoder;

public class Decoders {
    public static final Decoder PRIMITIVE = new NullDecoder();
    public static final Decoder CVM_LIST = new CVMListDecoder();
    public static final Decoder CVM_RESULTS = new CVMResultsDecoder();
    public static final Decoder TVR = new TVRDecoder();

}
