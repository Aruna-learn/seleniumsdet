package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.id("dob")).click();
		
		Select monthdrop=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthdrop.selectByVisibleText("Aug");
		
		Select yeardrop=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yeardrop.selectByVisibleText("1999");
		
		String date="22";
	List<WebElement>datesel=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for (WebElement dt : datesel) {
			
			String dd=dt.getText();
			if(dd.equals(datesel))
			{
				dt.click();
			}
				
		}
		

	}

}
