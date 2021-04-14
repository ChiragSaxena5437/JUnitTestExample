package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		JUnitFunction junit = new  JUnitFunction();
		int result =junit.addNumbers(100, 300);
		assertEquals(400, result);
	}

}
