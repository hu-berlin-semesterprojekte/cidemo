package de.huberlin.wbi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class MyClassTest {

    @Test
    public void testContains() {
	Collection<Integer> list345 = Arrays.asList(3, 4, 5);
	MyClass myClass = new MyClass();
	
	// "Normalfaelle"
	assertTrue(myClass.contains(list345, 4));
	assertFalse(myClass.contains(list345, 6));
	assertTrue(myClass.contains(Arrays.asList("a", "cc", "ba"), "cc"));
	assertFalse(myClass.contains(Arrays.asList("a", "cc", "ba"), "c"));
	
	// Randbedingungen
	assertTrue(myClass.contains(list345, 3));
	assertTrue(myClass.contains(list345, 5));
	assertFalse(myClass.contains(new ArrayList<Integer>(), 6));
	
	// Spezialfaelle
	assertTrue(myClass.contains(Arrays.asList(3, null, 5), null));
	assertFalse(myClass.contains(null, null));
	assertFalse(myClass.contains(null, 5));
	assertFalse(myClass.contains(list345, null));
	assertTrue(myClass.contains(Arrays.asList(3, null, 5), 5));
    }

}
