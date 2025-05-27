package AssertionTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	@Test
	void softAssertion() {
		System.out.println("Test started.");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(120,130);
		System.out.println("Test End");
		sa.assertAll();
	}
	/*
	 Difference b/w soft and hard assert
	 1. hard assert stop compiling code if it fails but soft assert executes 
	 completely after the fail also.
	 2. We need to import the class and create an object for soft assert whereas 
	 it is not necessary to create a object for hard assert.
*/
	
	
}
