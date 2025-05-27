package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/#google_vignette");
		driver.manage().window().maximize();
		//How to use attribute in Css Selector
		driver.findElement(By.cssSelector("input[id = 'banner-email']")).sendKeys("bhagya@gmail.com");
	}

}
