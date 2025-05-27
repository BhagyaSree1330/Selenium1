package MediMention_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class mediMentionProject {
	WebDriver driver;
	@BeforeClass
	@Parameters({"Browser"})
	void setUp(String browser) {
		switch(browser) {
		case"chrome": driver = new ChromeDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	driver.get("https://www.medimention.com/");
	driver.manage().window().maximize();	
	}
	
	@Test(priority = 1)
	void Form1() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='banner-name']")).sendKeys("Bhagya");
		driver.findElement(By.xpath("//input[@id='banner-email']")).sendKeys("bhagya@gmail.com");
		driver.findElement(By.xpath("//input[@id='banner-phone']")).sendKeys("9495538720");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	void Form2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='contact-name']")).sendKeys("Bhagya");
		driver.findElement(By.xpath("//input[@id='contact-email']")).sendKeys("bhagya@gmail.com");
		driver.findElement(By.xpath("//input[@id='contact-phone']")).sendKeys("9495538720");
		driver.findElement(By.xpath("//input[@id='contact-message']")).sendKeys("Hi..");
		Thread.sleep(2000);
	}
	
	@AfterClass
	void close() {
		driver.quit();
	}
}
