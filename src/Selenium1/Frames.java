package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		//Setting property
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
						
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
								
		//Open URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Using below command, we switch to the frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//Need to create Action to Drag from source and drop to target
		Actions a = new Actions(driver);
		
		//Creating two elements, one for source and another for Target
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Perform action of drag and drop using our created action class
		a.dragAndDrop(source, target).build().perform();
		
		//Need to come back from frame, otherwise Selenium will stuck into frame content
		driver.switchTo().defaultContent();
		
	}

}
