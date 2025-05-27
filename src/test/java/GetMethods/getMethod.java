package GetMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Set<String> createAcc = driver.getWindowHandles();
		System.out.println(createAcc);
		

	}

}
