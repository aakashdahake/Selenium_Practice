package Selenium1;

import java.awt.List;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
			// We will need system property for Gecko driver to invoke Chrome (Chrome 76 and its supporting Chrome Driver) 
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
				
			// We have to import Webdriver class from library to create object named driver below
			WebDriver driver = new ChromeDriver();
			
			//Open URL
			driver.get("https://www.espncricinfo.com/series/19553/scorecard/1200441/malaysia-vs-canada-4th-match-cwc-challenge-league-group-a-2019-2021-22");
			
			WebElement table = driver.findElement(By.id("gp-inning-00"));
			
			//finding rows in table
			List<WebElement> = table.findElements(By.className("flex-row"));
			
			
				
	}

}
