package UploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFiles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement singleFile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		//singleFile.click();
		singleFile.sendKeys("C:\\Users\\hp\\Desktop\\Bhagya Sreekumar_May_2025_QA_Resume.pdf");
	}

}
