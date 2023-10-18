package testcases;

import org.openqa.selenium.WebDriver;
import utilities.handler.BrowserHandler;
import utilities.handler.WaitHandler;
import utilities.pages.SearchPage;

public class GoogleSearchTest {
	
	static String url = "https://www.google.com/";

	public static void main(String[] args) {
		
	WebDriver driver = BrowserHandler.setupBrowser("chrome");
	BrowserHandler.launchApplication(driver,url );
	SearchPage searchPage = new SearchPage(driver);
		searchPage.serchAnything("Selenium");
		WaitHandler.gethardWait();
		searchPage.printSearchResults();
		
		BrowserHandler.closeBrowser(driver);
	}
	
}
