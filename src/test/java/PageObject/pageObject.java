package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObject {
	WebDriver driver;
	 pageObject(WebDriver driver) {
		this.driver = driver;

	}
	 By username = By.xpath("//input[@name='username']");
	 By password = By.xpath("//input[@name='password']");
	 By login = By.xpath("//button[@type='submit']");
	 
	 public void setUsername(String user) {
		 driver.findElement(username).sendKeys(user);	 
	 }
	 public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);;
	}
	 public void setLogin() {
		driver.findElement(login).click();
	}
			
}
