package Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// To check if any image is present or not using isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']"));
		System.out.println(logo.isDisplayed());
		
		// To check if we are type inside the text box using isEnabled()
		boolean firstName = driver.findElement(By.xpath("//input[@name='firstname']")).isEnabled();
		System.out.println(firstName);
		
		// // To check if the radio button is click able using isSelected()
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
		System.out.println(radioButton.isSelected());
		radioButton.click();
		System.out.println(radioButton.isSelected());
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		
		

	}

}
