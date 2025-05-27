package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptions {

	public static void main(String[] args) {
		// Chrome Options: 1. Headless=new: All operations performed at the back end. Takes less time.
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://uncodemy.com/");
		String sc = driver.getTitle();
		if(sc.equals("Uncodemy - India's Best IT Training Institute in Noida | Delhi")){
			System.out.println("The test is passed.");
		}
		else {
			System.out.println("The test is failed");
		}
	}

}
