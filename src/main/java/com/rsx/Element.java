package com.rsx;

import java.util.List;

public interface Element {
    Element element(String elementName);
    List<Element> elements(String elementName);
    List<Element> elements();
    String name();
    Value value();
    Value attribute(String attributeName);
}
