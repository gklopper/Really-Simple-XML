package com.rsx.impl;

import com.rsx.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

public class ReallySimpleXmlTest {

    @Test
    public void shouldParseXml() {

        InputStream xmlStream = getClass().getResourceAsStream("simple.xml");

        Element root = new ReallySimpleXmlJaxpImpl().parse(xmlStream);

        String name = root.element("person").value().toString();
        
        Assert.assertEquals("Should load person name", "Peter", name);


    }

}
