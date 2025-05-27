package MultipleXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFinder {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("bhagyasree@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bhagya");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		
	}

}
