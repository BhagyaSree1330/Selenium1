package CheckBoxMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// How to select on a specific check box
		//driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		//Thread.sleep(2000);
		
		List<WebElement> week = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for (int i = 0; i < week.size(); i++) {
			week.get(i).click();
		}
		Thread.sleep(2000);
		for (WebElement i: week){
			if(i.isSelected()== true) {
				i.click();
			}
			else {
				continue;
			}
		}
		
		driver.manage().window().minimize();
		
		
	}

}
