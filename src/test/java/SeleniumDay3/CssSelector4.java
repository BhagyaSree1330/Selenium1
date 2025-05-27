package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector4 {

public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com");
		driver.manage().window().maximize();
		// How to use CssSelector Tag class attribute
		// Syntax: Tag.ClassName[AttributeName = 'AttributeValue'];
		
driver.findElement(By.cssSelector("input.form-control[id='banner-phone']")).sendKeys("bhagya@gmail.com");
Thread.sleep(1000);
	}

}
