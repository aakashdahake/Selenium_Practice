package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WakeFirefox {
	public void WakeFirefox() {
		
		
		// We will need system property for Gecko driver to invoke Firefox (Firefox v48+/Selenium 3) 
		System.setProperty("webdriver.gecko.driver","D://geckodriver.exe" );
		
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new FirefoxDriver();
		
		//Open URL
		driver.get("https://technoticle.wordpress.com/");
		
		//To get title of Website
		System.out.println(driver.getTitle());
		
		//Verification to know whether we are not getting redirected anywhere else. This will print hit URL
		System.out.println(driver.getCurrentUrl());
		
		//Close the browser
		driver.close();
		
		
		
		
		
	}
}
