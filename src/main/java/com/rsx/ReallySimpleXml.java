package com.rsx;

import java.io.InputStream;

public interface ReallySimpleXml {
    Element parse(InputStream xmlStream);
}
