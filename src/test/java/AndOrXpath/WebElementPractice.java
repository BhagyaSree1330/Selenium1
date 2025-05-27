package AndOrXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		
		List<WebElement> name= driver.findElements(By.xpath("//input[@name='name']"));
		name.get(0).sendKeys("Bhagya");
		Thread.sleep(3000);
		name.get(1).sendKeys("Sree");
		Thread.sleep(2000);
		
		List<WebElement> email= driver.findElements(By.xpath("//input[@name='email']"));
		email.get(0).sendKeys("bhagya@gmail.com");
		Thread.sleep(3000);
		email.get(1).sendKeys("sree@gmail.com");
		Thread.sleep(2000);
		
		List<WebElement> phone = driver.findElements(By.xpath("//input[@name='phone']"));
		phone.get(0).sendKeys("9496538729");
		Thread.sleep(2000);
		phone.get(1).sendKeys("7907786199");
		Thread.sleep(2000);
		
		//driver.manage().window().minimize();

	}

}
