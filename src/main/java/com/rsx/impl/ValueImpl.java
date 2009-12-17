package com.rsx.impl;

import com.rsx.ReallySimpleXmlException;
import com.rsx.Value;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValueImpl implements Value {
    private String value;

    public ValueImpl(String value){
        this.value = value;
    }

    @Override
    public Integer toInteger() {
        return Integer.parseInt(this.value);
    }

    @Override
    public Long toLong() {
        return Long.parseLong(this.value);
    }

    @Override
    public Double toDouble() {
        return Double.parseDouble(this.value);
    }

    @Override
    public Date toDate(SimpleDateFormat format) {
        try {
            return format.parse(this.value);
        } catch (ParseException e) {
            throw new ReallySimpleXmlException("Unable to parse date: " + this.value, e);
        }
    }

    @Override
    public Boolean toBoolean() {
        return Boolean.parseBoolean(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
