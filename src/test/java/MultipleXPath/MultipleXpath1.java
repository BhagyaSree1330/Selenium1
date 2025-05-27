package MultipleXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleXpath1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?flo=true");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@ type='text'][@name='username']")).sendKeys("Bhagyasree");
		driver.findElement(By.xpath("//input[@ type='password'][@name='password']")).sendKeys("Bhagya");
		Thread.sleep(2000);
		
		driver.manage().window().minimize();

	}

}
