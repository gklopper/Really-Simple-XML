package com.rsx;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Value {
    String toString();
    Integer toInteger();
    Long toLong();
    Double toDouble();
    Date toDate(SimpleDateFormat format);
}
