package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.com/");
		
		//initializing dates
		String date="22";
		String month="August";
		String yearr="2025";
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();//click on the date button
		
		while (true) {
			String monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-sc-1tlckkc-2 eTppvw']")).getText();
			System.out.println(monthyear);
			
			String mon=monthyear.toString();
			String year=monthyear.toString();
			
			if(mon.equals(month)&& year.equals(yearr))
					break;
			else
				driver.findElement(By.xpath("//div[@id='next']")).click();
			
		}
			
		//date Selection	
			
	List<WebElement>dates=driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-14em0t0-0 eUrtce']/span"));
			for (WebElement dt : dates) {
				
				
				String dd=dt.getText();
				if(dd.equals(date))
				{
					dt.click();
					break;
				}
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
