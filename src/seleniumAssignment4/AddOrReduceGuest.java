package seleniumAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOrReduceGuest {
	public void addGuest(WebDriver driver) {
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/span/div/div[2]/div/div/div[2]/span[3]")).click();
		
	}
	public void reduceGuestNumber(WebDriver driver) {
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/span/div/div[2]/div/div/div[2]/span[1]")).click();
	}
	public void addGuestFromSecondRoom(WebDriver driver) {
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/span/div/div[2]/div[2]/div/div[2]/span[3]")).click();
	}
	public void deleteGuestFromSecondRoom(WebDriver driver) {
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[3]/div/span/div/div[2]/div[2]/div/div[2]/span[1]/svg/use")).click();
	}

}
