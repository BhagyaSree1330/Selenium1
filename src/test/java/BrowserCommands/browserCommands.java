package BrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.medimention.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-facebook']")).click();
		Thread.sleep(1000);
		
		// close() method used to close a single window
		//driver.close();
		
		// quit() method used to multiple window
		driver.quit();
	}

}
