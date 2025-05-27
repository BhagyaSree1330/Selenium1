package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickMouseOver {
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
	WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions ac = new Actions(driver);
	ac.contextClick(right).perform();
	
	
}
}
