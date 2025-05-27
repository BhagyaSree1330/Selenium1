package SeleniumDay2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		/*driver.findElement(By.partialLinkText("cement")).click();
		Thread.sleep(1000);*/
		
		// How to find element using class name
		List<WebElement> email =  driver.findElements(By.className("form-control"));
		//email.get(0).sendKeys("bhagyasree@gmail.com");
		System.out.println(email.size());
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
	}

}
