package DropDownMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//font[text()='Create new account']")).click();
		//Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select sc = new Select(day);
		Thread.sleep(1000);
		
	// Select option from the Drop Down
		sc.selectByValue("2");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sc1 = new Select(month);
		Thread.sleep(1000);
		
		// DropDown using Select by index
		sc1.selectByIndex(3);
		Thread.sleep(1000);
		
		// To find the size of the Drop down
		List<WebElement> count = sc1.getOptions();
		System.out.println(count.size());
		driver.manage().window().minimize();

	}

}
