package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WakeWeb1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
		
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
				
		//Open URL
		driver.get("https://in.hotels.com");
		
		//Enter data in field
		driver.findElement(By.xpath("//*[@id=\"qf-0q-destination\"]")).sendKeys("Nagpur");
		
		//Send Enter
		driver.findElement(By.xpath("//*[@id=\"qf-0q-destination\"]")).sendKeys(Keys.ENTER);
		
		//Implicit wait to load the page, useful when webpage loads for long
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Explicit wait to be applied to driver
		WebDriverWait d = new WebDriverWait(driver,5); // Need to declare this mandatorily
		
		//d.until(ExpectedConditions. have many other useful methods)
		d.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Radisson Blu Hotel Nagpur")));
		d.until(ExpectedConditions.elementToBeClickable(By.linkText("Radisson Blu Hotel Nagpur")));
		
		//Click hotel link before actually page loads fully
		driver.findElement(By.linkText("Radisson Blu Hotel Nagpur")).click();
	
		 
		
		
		
		
		//Synchronizatin in Selenium
		
		
		
	}

}
