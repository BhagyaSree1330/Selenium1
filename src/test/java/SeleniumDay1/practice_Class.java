package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_Class {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://uncodemy.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	// How to find the element with Link text
	driver.findElement(By.linkText("Placement")).click();
	Thread.sleep(1000);
	// To get Current URL
	String newurl = driver.getCurrentUrl();
	System.out.println(newurl);
	driver.manage().window().minimize();
}
}
