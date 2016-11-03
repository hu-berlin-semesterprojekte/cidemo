package de.huberlin.wbi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class MyClassTest {

    @SuppressWarnings("static-method")
    @Test
    public void testContains() {
	Collection<Integer> list = Arrays.asList(5, 2, 7, 8);
	MyClass myClass = new MyClass();
	
	assertTrue(myClass.contains(list, 2));
	assertFalse(myClass.contains(list, 4));
	
	assertTrue(myClass.contains(list, 5));
	assertTrue(myClass.contains(list, 8));
	assertTrue(myClass.contains(Arrays.asList(5), 5));
	assertFalse(myClass.contains(new ArrayList<Integer>(), 5));
	
	assertFalse(myClass.contains(null, 5));
	assertFalse(myClass.contains(list, null));
	assertFalse(myClass.contains(null, null));
	assertTrue(myClass.contains(Arrays.asList(5, null, 4, 3), 4));
	assertTrue(myClass.contains(Arrays.asList(5, null, 4, 3), null));
    }

}
