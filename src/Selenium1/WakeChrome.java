package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WakeChrome {
	
	public void WakeChrome() {
		
		// We will need system property for Gecko driver to invoke Chrome (Chrome 76 and its supporting Chrome Driver) 
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
		
		//// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.spicejet.com/");
		
		//To get title of Website
		System.out.println(driver.getTitle());
				
		//Verification to know whether we are not getting redirected anywhere else. This will print hit URL
		System.out.println(driver.getCurrentUrl());
		
		//Enter Username
		//driver.findElement(By.xpath("//Input[@name='email']")).sendKeys("aakashdahake");
		
		//Enter Password
		//driver.findElement(By.name("pass")).sendKeys("testpassword");
		
		//Click L0gin button
		//driver.findElement(By.xpath("//Input[@value='Log In']")).click();
				
		//Select a item from Static Dropdown 
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(1);
		s.selectByVisibleText("USD"); 
		
		
		
		
		
		
		//Close the browser
		//driver.close();
	}
}
