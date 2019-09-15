package Selenium1;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CelenderDatePicker {

	public static void main(String[] args) {
		//Setting property
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe" );
										
		// We have to import Webdriver class from library to create object named driver below
		WebDriver driver = new ChromeDriver();
												
		//Open URL
		driver.get("https://jqueryui.com/datepicker/");
		
		//Switching to iframe on page
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
		
		//Click on calender element to expand calendar popup
		driver.findElement(By.cssSelector("input[id = 'datepicker']")).click();
		
		
		
		//int count = driver.findElements(By.className("ui-state-default")).size();
		
		//System.out.println("Number of Days "+ count);
		
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		String year = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		System.out.println(month + year);
		
		Map<String, Integer> months = new HashMap<>();
		months.put("January", 1);
		
		System.out.println(months.get("January"));
				
				
		for(int i = 0;;i++)
		{
			driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span")).click();
			if(driver.findElement(By.className("ui-datepicker-month")).getText().contains("December") && driver.findElement(By.className("ui-datepicker-year")).getText().contains("2019")   )
			{
				int count = driver.findElements(By.className("ui-state-default")).size();
				System.out.println(count);
				for(int j = 0;j<count;j++)
				{
					if(driver.findElements(By.className("ui-state-default")).get(j).getText().contains("30"))
					{
						driver.findElements(By.className("ui-state-default")).get(j).click();
						break;
					}
				}
				break;	
			}
			
		}
		
		
		
		
		
		
		

	}

}
