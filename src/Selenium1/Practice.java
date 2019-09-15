package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args)  {
		//Setting property
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
								
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
										
		//Open URL
		driver.get("https://www.amazon.in");
		
		//------------------------------------------------------------------
		//Finding links in footer section
		//Links in footer may change tommorrow, so in case if we want to find a specific link
		
		//Creating footer variable in order to only focus on links under footer section
		WebElement footer = driver.findElement(By.xpath("//*[@id='navFooter']/div[1]/div"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		//To Get links from specific column of footer
		//Create a column object
		WebElement coloumn = driver.findElement(By.xpath("//*[@id=\'navFooter\']/div[1]/div/div[1]"));
		
		
		for(int i=0; i<coloumn.findElements(By.tagName("a")).size(); i++) 
		{	
			System.out.println(coloumn.findElements(By.tagName("a")).get(i).getText());
			
		}
		
		
		
		
		
		

	}

}
