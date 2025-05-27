package TestNgPackage;

import org.testng.annotations.Test;
//We use test annotation to declare any method at the test cases
public class TestNgPractice2 {
@Test(priority=1)
	void login() {
		System.out.println("System Login");
	}
@Test(priority=3)
	void logout() {
		System.out.println("System logout");
	}
@Test(priority=6)
void AddToCart() {
	System.out.println("Adding the product");
}
@Test(priority=4)
void search() {
	System.out.println("Searching the product");
}

/*
 1. TestNG by default execute the test method based on the 
 alphabetical order.
 2. TestNG execute the test method name starting with the Capital
 letter first if there are any other methods in small letter.
 3. @Test(priority=number) controls the order of the execution.
 4. Once priority is given alphabet order or Capital/Small letters 
 are not considered.
 5. Priority can be in random number no(No consecutive order).
 6. We can disable the test case by commenting out @Test annotation.
 7. If you don't provide any priority, the priority will be 0 by 
 default.
 8. We can make negative priority also.
 9. If the priority is same then it executes by alphabetical order
 10. TestNG executes test method only if they have @Test annotation
 only. 
*/

}
