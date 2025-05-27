package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait expilicitWait = new WebDriverWait(driver,Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement user = expilicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		user.sendKeys("Admin");
		WebElement password = expilicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys("admin123");
		WebElement login = expilicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Login ']")));
		login.click();
		
		/*
		 1. It is condition based. it works effectively with condition based.
		 2. Finding element is inclusive (for some conditions)
		 3. It will wait for condition to be true then consider the time.
		 4. We need to write multiple statement for multiple element.
		 
		 */
	}

}
