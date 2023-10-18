package utilities.handler;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandler {

	public static WebDriver setupBrowser(String browserName) {

		WebDriver driver = null;
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		return driver;
		
	}
	
	public static void launchApplication(WebDriver driver , String url) {
		driver.get(url);
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
