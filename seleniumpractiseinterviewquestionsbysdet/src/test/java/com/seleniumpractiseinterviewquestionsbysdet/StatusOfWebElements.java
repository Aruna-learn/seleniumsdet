package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElements {

	public static void main(String[] args) throws Exception {
		
		//StatusOfWebElements 3types is enabled, is displayed, is selected
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//is displayed
		WebElement element=driver.findElement(By.name("q"));
		System.out.println(element.isDisplayed());
		Thread.sleep(3000);
		//is enabled
			WebElement element1=driver.findElement(By.name("q"));
				System.out.println(element1.isEnabled());
				Thread.sleep(3000);
		
		//is selected
				Thread.sleep(3000);
		WebElement male=driver.findElement(By.id("gender-male"));//true
		WebElement female=driver.findElement(By.id("gender-female"));//false
		
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//false
		Thread.sleep(3000);
		female.click();
		
		Thread.sleep(3000);
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//true
		
		
		
		
		
		
	}

}
