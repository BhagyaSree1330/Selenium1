package AndOrXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'and@role='button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhagya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sree");
		WebElement email = driver.findElement(By.xpath("//input[@type='text'and@name='reg_email__']"));
		email.sendKeys("bhagya@gmail.com");
		email.clear();
		Thread.sleep(3000);
		email.sendKeys("9496538729");
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
	

	}

}
