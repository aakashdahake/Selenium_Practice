package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessUntrustedWebpage {

	public static void main(String[] args) {
		// We will need system property for Gecko driver to invoke Chrome (Chrome 76 and its supporting Chrome Driver) 
				System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
				
	    // We have to import Webdriver class from library to create object named driver below
				WebDriver driver = new ChromeDriver();
				
		//Need to create profile variable
				
				
		//Open URL
		driver.get("https://expired.badssl.com/");
				
			

	}

}
