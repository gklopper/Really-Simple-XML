package com.rsx.impl;

import com.rsx.Value;

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
        return null;
    }

    @Override
    public Double toDouble() {
        return Double.parseDouble(this.value);
    }

    @Override
    public Date toDate(SimpleDateFormat format) {
        return null;
    }

    @Override
    public String toString() {
        return value;
    }
}
