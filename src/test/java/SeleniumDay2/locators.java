package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	// How to use Web element to perform multiple action 
		WebElement email = driver.findElement(By.name("email"));
		Thread.sleep(1000);
		
		email.sendKeys("bhagya@gmail.com");
		Thread.sleep(1000);
		
		email.clear();
		Thread.sleep(1000);
		
		email.sendKeys("sree@gmail.com");
	
		driver.findElement(By.name("pass")).sendKeys("bhagya");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		//driver.manage().window().minimize();
		

	}

}
