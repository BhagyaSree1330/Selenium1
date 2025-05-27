package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		
		/* Css Selector Types:
		 1. Tag Id: TagName # Id name
		 2. Tag class: TagName.className
		 3. Tag attribute: TagName[AttributeName='AttributeValue']
		 4. Tag class attribute: 
		 */
		
		driver.findElement(By.cssSelector("input#banner-name")).sendKeys("Bhagyasree");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#banner-email")).sendKeys("bhagyasree@gmail.com");
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
	}

}
