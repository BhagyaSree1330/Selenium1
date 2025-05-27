package AlertConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertMessage2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Second method Pop up message
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert myAlert= driver.switchTo().alert(); 
		myAlert.dismiss();
		Thread.sleep(1000);
		
		//Third method Pop up message
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert myAlert2 =driver.switchTo().alert();
		myAlert2.sendKeys("WELCOME");
		Thread.sleep(4000);
		myAlert2.accept();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();

	}

}
