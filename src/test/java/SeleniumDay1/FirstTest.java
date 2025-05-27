package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	// How to open any browser with Selenium
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	// We use .get() to open the Website with the help of URL
		driver.get("https://www.facebook.com/");
	// How to minimize and maximize the window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
	// How to find element the with Id locator
		driver.findElement(By.id("email")).sendKeys("bhagyasreeskumar@gmail.com");
		Thread.sleep(1000);
	// How to find element using name locator
		driver.findElement(By.name("pass")).sendKeys("ammuskumar1330");
	}

}
