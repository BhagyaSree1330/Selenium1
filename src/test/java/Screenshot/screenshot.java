package Screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		// Full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumMavenPractise\\src\\test\\java\\Screenshot\\Image\\pic.png");
		f.renameTo(path); //Source file to Target file 
		
		driver.manage().window().minimize();
		

	}

}
