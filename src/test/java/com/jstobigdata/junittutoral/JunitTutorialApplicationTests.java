package com.jstobigdata.junittutoral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JunitTutorialApplicationTests {

	@Test
	void testIsEqual(){
		Assertions.assertEquals(2, 2);
	}

	@Test
	void contextLoads() {
		System.out.println("Hello JUnit");
	}


	@Test
	void testStringEqual(){
		var expected = "jstobigdata";
		var actual = "jstobigdata";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testBoolean(){
		var expected = "jstobigdata"; // reference from pool
		var actual = new String(expected); // reference from Heap
		Assertions.assertTrue(expected == actual);
	}

	@Test
	void testObjectEqual(){
		var expected = "jstobigdata"; // reference from pool
		var actual = new String(expected); // reference from Heap
		Assertions.assertEquals(expected, actual);
	}

}
