package com.sample.provider;

import org.smpp.Data;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class SimpleConverter implements IConverter{

    public String convert(String inputMessage) throws UnsupportedEncodingException {
        return new String(inputMessage.getBytes(Data.ENC_GSM7BIT));
    }

}
