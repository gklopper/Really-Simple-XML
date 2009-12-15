package com.rsx.impl;

public class ReallySimpleXmlException extends RuntimeException {
    public ReallySimpleXmlException(String message, Exception e) {
        super(message, e);
    }
}
