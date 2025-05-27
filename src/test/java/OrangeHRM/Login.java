package OrangeHRM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='button'and@role='none']")).click();
		Thread.sleep(3000);
		
		List<WebElement> admin = driver.findElements(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
		admin.get(0).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		//Thread.sleep(2000);
		
		admin.get(1).click();
		Thread.sleep(2000);
		
		
	}

}
