package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {

		//Setting property
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
		
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
				
		//Open URL
		driver.get("https://www.amazon.in");

		//New to create action class variable
		Actions a = new Actions(driver);
		
		//Web element creation
		WebElement AccountnList = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		// Moving mouse cursor to a menu which expands without clicking on it
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		//Right click on any element, using above declared webelement and perform right click
		a.moveToElement(AccountnList).contextClick().build().perform();
		
		
		
		
	}

}
