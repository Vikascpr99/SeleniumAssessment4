package seleniumAssignment4;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmenitiesList {

	//Method for getting Amenities List of the first searched Hotel
	@SuppressWarnings("deprecation")
	public void amenitiesList(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/button[1]")).click();
//		Thread.sleep(5000);
		
		for(String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
//		Thread.sleep(5000);
		
		
		List<WebElement> list = driver.findElements(By.className("c-12w6zty"));
		System.out.println("List of Ameneties Provided by Hotel:-");
		for (WebElement amenity_list : list) {
			String Amenity_List = amenity_list.getText();
			System.out.println(Amenity_List);
		}
	}
}
