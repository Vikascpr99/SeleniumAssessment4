package seleniumAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotel {

	public void searchHotel(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[4]")).click();
	}
}
