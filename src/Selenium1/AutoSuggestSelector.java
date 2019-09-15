package Selenium1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestSelector {

	public static void main(String[] args) {
		//Setting property
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
										
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
												
		//Open URL
		driver.get("https://google.com");
		
		//Creating wedriverwait variable in order towait for suggestions to be shown
		WebDriverWait wdw = new WebDriverWait(driver, 5);
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")));
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Java Tutorials");
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
	}

}
