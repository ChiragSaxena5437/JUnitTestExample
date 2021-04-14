package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		JUnitFunction junit1 = new  JUnitFunction();
		String result =junit1.addStrings("Chirag", "Saxena");
		assertEquals("ChiragSaxena", result);
	}

}
