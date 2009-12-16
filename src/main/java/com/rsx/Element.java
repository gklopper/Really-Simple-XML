package com.rsx;

import java.util.List;

public interface Element {
    Element element(String elementName);
    List<Element> elements(String elementName);
    Value value();
    Value attribute(String attributeName);
}
