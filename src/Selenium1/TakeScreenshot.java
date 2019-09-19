package Selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;



public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		// We will need system property for Gecko driver to invoke Chrome (Chrome 76 and its supporting Chrome Driver) 
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
				
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
		
		//open webpage
		driver.get("https://www.spicejet.com/");
		
		//windowsUtils.tryToKill(By.name("notepad.exe"))
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile= new File("D://test.png");
		
		//Copy file from source to destination
		Files.copy(scrFile, DestFile);
		
		
	}

}
