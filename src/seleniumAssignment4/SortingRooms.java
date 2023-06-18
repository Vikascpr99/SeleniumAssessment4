package seleniumAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortingRooms {
	// Method for sorting hotel by Guest-Rating
	public void sortByGuestRating(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[1]/div[1]/div[2]/div/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[1]/div[1]/div[2]/div/span[2]/ul/li[2]")).click();
	}
	
	
	//Method for getting Hotel Name and Rating given by Visited Guest
	public void gettingDetailsOfFirstSortedHotel(WebDriver driver) {
		WebElement hotel_name = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div/a/h3"));
		System.out.println("Hotel you Selected \n"+hotel_name.getText());
		WebElement rating = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/div/span[1]/span[1]"));
		System.out.println("Rating of hotel:- \n"+rating.getText());
		
	}
	/*
	// Method for sorting hotel by Price Low to High
		public void sortByPriceLowToHigh(WebDriver driver) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[1]/div[1]/div[2]/div/span[2]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[1]/div[1]/div[2]/div/span[2]/ul/li[3]")).click();
			
		}
		
		// Method for sorting hotel by Price Low to High
				public void sortByPriceHighToLow(WebDriver driver) {
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[1]/div[1]/div[2]/div/span[2]")).click();
					
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/section/div/div[1]/div[1]/div[2]/div/span[2]/ul/li[4]")).click();
					
				}
				*/

}
