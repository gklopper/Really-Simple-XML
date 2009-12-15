package com.rsx.impl;

import com.rsx.Element;
import com.rsx.ReallySimpleXml;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class ReallySimpleXmlJaxpImpl implements ReallySimpleXml{
    @Override
    public Element parse(InputStream xmlStream) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();
            
            Document doc = db.parse(xmlStream);

            return new ElementJaxpImpl(doc.getDocumentElement());

        } catch (Exception e) {
            throw new ReallySimpleXmlException("Could not parse xml", e);
        } 

    }
}
