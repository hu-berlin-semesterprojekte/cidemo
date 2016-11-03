package de.huberlin.wbi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class MyClassTest {

    @Test
    public void testContains() {
	Collection<Integer> list = Arrays.asList(5, 2, 7, 8);
	
	assertTrue(MyClass.contains(list, 2));
	assertFalse(MyClass.contains(list, 4));
	
	assertTrue(MyClass.contains(list, 5));
	assertTrue(MyClass.contains(list, 8));
	assertTrue(MyClass.contains(Arrays.asList(5), 5));
	assertFalse(MyClass.contains(new ArrayList<Integer>(), 5));
	
	assertFalse(MyClass.contains(null, 5));
	assertFalse(MyClass.contains(list, null));
	assertFalse(MyClass.contains(null, null));
	assertTrue(MyClass.contains(Arrays.asList(5, null, 4, 3), 4));
	assertTrue(MyClass.contains(Arrays.asList(5, null, 4, 3), null));
    }

}
