package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	
	static WebDriver driver; 
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public static WebElement popitems() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
		
	}
	
	public static WebElement tablink() {
		
		return driver.findElement(By.id("details_16"));
		
	}
	public static WebElement laplink() {
		
		return driver.findElement(By.id("details_10"));
		
	}
			
	public static WebElement spklink() {
		
		return driver.findElement(By.id("details_21"));
		
	}

	public static WebElement detailstext() {
		
		return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	}
	

}
