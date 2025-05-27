package OrangeHRM_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testOrangeHRM {
	WebDriver driver;
	@BeforeClass(groups = {"sanity"})
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1, groups = {"sanity"})
	void Login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority = 2, groups = {"regression"})
	void Admin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		List<WebElement> username = driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']"));
		username.get(1).sendKeys("Admin");
		Actions ac = new Actions(driver);
		List<WebElement> userRole = driver.findElements(By.xpath("//div[@tabindex='0']"));
		userRole.get(0).click();
		ac.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Bhagya");
		WebElement status = driver.findElement(By.xpath("//div[text()='-- Select --']"));
		status.click();
		ac.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
	}
	@Test(priority = 3, groups = {"regression"})
	void PIM() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		}
	@Test(priority = 4, dependsOnMethods = {"PIM"}, groups = {"regression"} )
	void leave() {
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
	}
	@AfterClass(groups = {"sanity"})
	void quit() {
		driver.quit();
	}
}

