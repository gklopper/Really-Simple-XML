package com.rsx.impl;

public class ReallySimpleXmlException extends RuntimeException {
    private String message;

    public ReallySimpleXmlException(String message, Exception e) {
        super(e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
