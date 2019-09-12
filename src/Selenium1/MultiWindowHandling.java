package Selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {

	public static void main(String[] args) {
		//Setting property
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
				
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
						
		//Open URL
		driver.get("https://www.hdfcbank.com");
		
		//Click on element that will open new browser window
		driver.findElement(By.cssSelector("a[id='loginsubmit']")).click();
		//Set command will create a set data structure of string, this set will store identities of windows (Parent and children)
		//We will need this ids for switching through windows
		Set<String> ids = driver.getWindowHandles();
		
		//Interface to iterate over collection
		Iterator<String> it = ids.iterator();
		
	
		//Extracting parent id
		String parentid = it.next();
		//Printing title of parent window
		System.out.println(driver.getTitle());
		
		
		//Extracting child window id
		String childid = it.next();
		//Giving child id to switch
		driver.switchTo().window(childid);
		//Printing title of child window
		System.out.println(driver.getTitle());
		
		
		
				

	}

}
