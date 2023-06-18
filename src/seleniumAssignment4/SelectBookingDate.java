package seleniumAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectBookingDate {
	
	public  void chooseBookingDate(WebDriver driver) {
		WebElement date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[2]"));
		date.click();
		WebElement from_date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[2]/div/span/div/div/div[2]/table/tbody/tr[3]/td[4]/span"));
		from_date.click();
		WebElement to_date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[2]/div/span/div/div/div[2]/table/tbody/tr[3]/td[6]/span"));
		to_date.click();
	}

}
