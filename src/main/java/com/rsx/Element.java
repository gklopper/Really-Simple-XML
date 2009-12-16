package com.rsx;

import java.util.List;

/**
 * Represents an xml element.
 */
public interface Element {

    /**
     * Gets the direct child <code>Element</code> of this <code>Element</code> with
     * the name <code>elementName</code>
     * @param elementName the name of the child <code>Element</code> to be returned
     * @return the child <code>Element</code> of this <code>Element</code> with the name <code>elementName</code> or <code>null</code>
     */
    Element element(String elementName);

    /**
     * Gets the direct child <code>Element</code>s of this <code>Element</code> with
     * the name <code>elementName</code>
     * @param elementName the name of the child <code>Element</code>s to be returned
     * @return the child <code>Element</code>s of this <code>Element</code> with the name <code>elementName</code> or an empty <code>List</code>
     */
    List<Element> elements(String elementName);

    /**
     * Gets the {@link Value} of this element. this corresponds to the text inside the element.
     * @return the child <code>Value</code> of this <code>Element</code>
     */
    Value value();

    /**
     * Gets the {@link Value} of the attribute of this element named <code>attributeName</code>
     * @param attributeName the name of the attribute to be returned
     * @return the <code>Value</code> of the requested attribute or <code>null</code>
     */
    Value attribute(String attributeName);
}
