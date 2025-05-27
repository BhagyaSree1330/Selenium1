package AssertionTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
// Assertion is important in TestNG to check if the Test cases is passed or failed. 
public class hardAssertion {
	WebDriver driver;
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
	}
	@Test
	void title() {
		String expectedTitle = "My title";
		String ActualTitle = driver.getTitle();
		if(expectedTitle.equals(ActualTitle)){
			System.out.println("Test case is passed.");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test case is failed.");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(expectedTitle, ActualTitle);
		}
	@AfterClass
	void close() {
		driver.close();
	} 
}
/*
 By default we are using Hard assertion 
 We have 2 types of assertion
 1. HARD assertion
 2. SOFT assertion
 we have different type of Hard assertion
 1. Assert.assertEquals(123,123): It is passed when both parameter are equal.
 2. Assert.assertNotEquals(123,456): It is passed when both parameter are not equal.
 3. Assert.assertTrue(true/a>b): If the condition is true, it is passed.
 4. Assert.assertFalse(false/a>b): If the condition is false then it is passed.
 5. Assert.assertFail: If all conditions are true it fails the test.
 */
