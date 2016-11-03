package de.huberlin.wbi;

import java.util.Collection;

public class MyClass {

    /**
     * A short little method that tests of an element is contained in a
     * collection.
     * 
     * @param collection
     *            the collection that is being searched
     * @param element
     *            the element that is to be searched
     * @return true, if and only if the element is contained in the collection
     */
    @SuppressWarnings("static-method")
    public <T> boolean contains(Collection<T> collection, T element) {
	for (T t : collection) {
	    if (t.equals(element))
		return true;
	}
	return false;
    }

}
