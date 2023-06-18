package seleniumAssignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterDetails {
	public void enteringDetails(WebDriver driver) {
		WebElement search_by_city = driver.findElement(By.id("autoComplete__home"));
		search_by_city.sendKeys("Pune");
	}
	public void usingFirstSearchSuggestion(WebDriver driver) {
		WebElement search_by_suggestion = driver.findElement(By.id("autoComplete__home"));
		
		search_by_suggestion.sendKeys(Keys.ARROW_DOWN);
		//search.sendKeys(Keys.ARROW_DOWN);
		search_by_suggestion.sendKeys(Keys.ENTER);
	}
	
}
