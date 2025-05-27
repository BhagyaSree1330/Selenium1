package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Implicit Wait: We use 9 sec as maximum.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		/*
		 Adv: 
		 1. We declare implicit wait single time in a program within a single statement.
		 2. It will not wait for the maximum time if the elements are available before time.
		 3. Applicable for all the elements
		 4. Easy to use
		 Disadvantage:
		 1. If time is not sufficient then it throws exception error.
		 */
	}

}
