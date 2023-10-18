package utilities.handler;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CommonMethods {
	
	
	
	public void clickOnElement (WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void printListItems(List<WebElement> listItems) {
		for(WebElement element :listItems ) {
			System.out.println(element.getText());
		}
		
	}
	
	public void sendTextToElement(WebElement element , String text) {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void hitEnterOnElement(WebElement element) {
		try {
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
