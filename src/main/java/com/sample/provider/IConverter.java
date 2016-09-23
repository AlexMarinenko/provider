package com.sample.provider;

import java.io.UnsupportedEncodingException;

public interface IConverter {
    String convert(String inputMessage) throws UnsupportedEncodingException;
}
