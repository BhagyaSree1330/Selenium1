package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		WebElement loginForm = driver.findElement(By.xpath("//form[@id='login_form']"));
		File sourceFile = loginForm.getScreenshotAs(OutputType.FILE);
		File TargetFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumMavenPractise\\src\\test\\java\\Screenshot\\Image\\form.png");
		sourceFile.renameTo(TargetFile);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		File sourceFile1 = email.getScreenshotAs(OutputType.FILE);
		File TargetFile1 = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumMavenPractise\\src\\test\\java\\Screenshot\\Image\\email.png");
		sourceFile1.renameTo(TargetFile1);
	}

}
