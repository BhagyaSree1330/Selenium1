package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement copyText = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		field1.clear();
		field1.sendKeys("Welcome");
		
		Actions ac = new Actions(driver);
	
		Thread.sleep(1000);
		
		ac.doubleClick(copyText).perform();
		
		
	}

}
