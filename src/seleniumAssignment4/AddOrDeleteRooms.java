package seleniumAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOrDeleteRooms {

	public void addRooms(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/span/div/div[3]/div/div[2]/button")).click();
	}
	public void deleteRooms(WebDriver driver) {
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/span/div/div[3]/div/div[1]/button")).click();
		
	}
	
}
