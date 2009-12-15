package com.rsx.impl;

import com.rsx.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;  

public class ReallySimpleXmlTest {

    @Test
    public void shouldParseXml() {

        InputStream xmlStream = getClass().getResourceAsStream("simple.xml");

        Element root = new ReallySimpleXmlImpl().parse(xmlStream);

        String name = root.element("person").value().toString();

        Integer age = root.element("person").attribute("age").toInteger();


        String job = root.element("jobs").elements("job").get(1).value().toString();
        Double wage = root.element("jobs").elements("job").get(0).attribute("wage").toDouble();
        
        Assert.assertEquals("Should load person name", "Peter", name);
        Assert.assertEquals("Should load persons age", 22, age.intValue());
        Assert.assertEquals("Should load persons second job", "Sweeper", job);
        Assert.assertEquals("Should load persons first jobs wage", 12.3, wage, 0.0);

    }

}
