package com.rsx.impl;

import com.rsx.Element;
import com.rsx.ReallySimpleXml;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

public class ReallySimpleXmlImpl implements ReallySimpleXml{
    @Override
    public Element parse(InputStream xmlStream) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlStream);

            return new ElementImpl(doc.getDocumentElement());
        } catch (Exception e) {
            throw new ReallySimpleXmlException("Could not parse xml", e);
        } 
    }
}
