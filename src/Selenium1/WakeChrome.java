package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WakeChrome {
	
	public void WakeChrome() {
		
		// We will need system property for Gecko driver to invoke Chrome (Chrome 76 and its supporting Chrome Driver) 
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		//// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.spicejet.com/");
		
		//To get title of Website
		System.out.println(driver.getTitle());
				
		//Verification to know whether we are not getting redirected anywhere else. This will print hit URL
		System.out.println(driver.getCurrentUrl());
				
		//Check Radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//Select a item from Static Dropdown 
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(1);
		s.selectByVisibleText("USD"); 
		
		//Handle Dynamic Drop Down
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click(); //Click on Dynamic Dropdown
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click(); //Click on Element of Dynamic Dropdwn
		
		// As drop down is same for both but value will be different, We have added [2] to tell code to select value from next drop down
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		
		//Calender entry selection on continuos popup
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[1]/a")).click();
		
		//Click check_box
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected()); // TO check whether it isselected
	
		
		
		
		
		
		//Close the browser
		//driver.close();
	}
}
