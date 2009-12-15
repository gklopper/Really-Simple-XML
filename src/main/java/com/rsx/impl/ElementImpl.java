package com.rsx.impl;

import com.rsx.Element;
import com.rsx.Value;
import org.w3c.dom.NodeList;

import java.util.List;

public class ElementImpl implements Element {

    private org.w3c.dom.Element element;

    public ElementImpl(org.w3c.dom.Element element) {
    this.element = element;
    }

    @Override
    public Element element(String elementName) {
        NodeList elements = element.getElementsByTagName(elementName);
        System.out.println(elements.getLength());
        org.w3c.dom.Element element = (org.w3c.dom.Element) elements.item(0);
        return new ElementImpl(element);
    }

    @Override
    public List<Element> elements(String elementName) {
        return null;
    }

    @Override
    public Value value() {
        return new ValueImpl(element.getTextContent());
    }

    @Override
    public Value attribute(String attributeName) {
        return null;
    }
}
