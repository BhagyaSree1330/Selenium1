package NavigationConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationMethod {

	public static void main(String[] args) throws InterruptedException {
		/* Name of the navigation method
		   1. navigation().to (url)
		   2. navigation().back() 
		   3. navigation().forward()
		   4. navigation().refresh() 
		 */
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().minimize();
		
	}

}
