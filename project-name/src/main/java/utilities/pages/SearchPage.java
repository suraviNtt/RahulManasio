package utilities.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.handler.CommonMethods;

public class SearchPage extends CommonMethods{
	
	 WebDriver drive ;
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(xpath = "//*[@id='search']//a//h3")
	List<WebElement> serachResults ;
	
	public SearchPage(WebDriver driver) {
		this.drive=driver;
		PageFactory.initElements(driver , this);
	}
	
	public void serchAnything(String searchText) {
		sendTextToElement(searchBox, searchText);
		hitEnterOnElement(searchBox);
	}
	
	
	public void printSearchResults() {
		printListItems(serachResults);
		
	}

}
