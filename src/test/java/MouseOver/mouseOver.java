package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		
		// It is possible to action without build but sometimes it shows Garbage value
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[@id='categoriesBtn']"))).build().perform();
		
		//We use the build() to create an action and We use perform() to complete an action
		
	}

}
