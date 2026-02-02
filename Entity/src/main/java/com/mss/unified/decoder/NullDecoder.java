package com.mss.unified.decoder;

import java.util.Collections;
import java.util.List;

public class NullDecoder implements Decoder {
    @Override
    public List<DecodedData> decode(String input, int startIndexInBytes) {
        return Collections.emptyList();
    }

    @Override
    public String validate(String input) {
        return null;
    }

    @Override
    public int getMaxLength() {
        return 0;
    }
}
