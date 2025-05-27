package TestNgPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

class TestNGPractice3 {
	/*
	 @BeforeMethod: with the help of this method we perform any actions before test method
	 without declaring many time.
	 
	 @AfterMethod: With the help of this method we perform any action after test method
	 without declaring it.
	 
	 @BeforeClass: We perform any action before class multiple time without declaring it.
	 
	 @AfterClass: We perform any action after class multiple time without declaring it.
	 
	 @BeforeTest: We perform any action before test method without declaring it multiple times.
	 
	 @AfterTest: We perform any actions after test cases without declaring it multiple times.
	 
	 @AfterSuite: We perform any actions after suite without declaring it multiple times.
	 
	 @BeforeSuite: We perform any actions before suite without declaring it multiple times.
	 
	 @Test: We use this method to declare any methods as a test cases.
	   
	 */
	 @org.testng.annotations.BeforeSuite
	 void BeforeSuite() {
		 System.out.println("Before Suite");
	 }
	 @org.testng.annotations.AfterSuite
	 void AfterSuite() {
		 System.out.println("After Suite");
	 }
	 @org.testng.annotations.BeforeClass
	 void BeforeClass() {
		 System.out.println("Before class");
	 }
	 @AfterClass
	 void Afterclass() {
		 System.out.println("After Class");
	 }
	 @org.testng.annotations.BeforeTest
	 void BeforeTest() {
		 System.out.println("Before Test");
	 }
	 @org.testng.annotations.AfterTest
	 void AfterTest() {
		 System.out.println("After test");
	 }
	 @Test
	 void Test1() {
		 System.out.println("Test1");
	 }
	 @Test
	 void Test2() {
		 System.out.println("Test2");
	 }
}
