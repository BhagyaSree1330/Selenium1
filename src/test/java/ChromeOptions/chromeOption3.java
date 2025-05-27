package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOption3 {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://uncodemy.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
