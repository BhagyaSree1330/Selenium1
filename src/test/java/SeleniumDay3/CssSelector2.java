package SeleniumDay3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medimention.com/#google_vignette");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> number = driver.findElements(By.cssSelector("input.form-control"));
		number.get(0).sendKeys("Bhagya");
		Thread.sleep(2000);
	}

}
