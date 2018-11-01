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

		assertTrue(MyClass.contains(list345, 3));
		assertFalse(MyClass.contains(list345, 6));
	}

}
