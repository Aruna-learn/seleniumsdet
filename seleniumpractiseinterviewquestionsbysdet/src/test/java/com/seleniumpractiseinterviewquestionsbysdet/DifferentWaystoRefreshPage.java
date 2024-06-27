package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentWaystoRefreshPage {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.letskodeit.com/practice");
         
		//ways to refresh the webpage
		
		Thread.sleep(3000);
		//driver.navigate().refresh();
		
		
		//driver.navigate().to(driver.getCurrentUrl());
		
		
		
		//driver.get(driver.getCurrentUrl());
		
		
		
//		Actions act=new Actions(driver);
//		act.sendKeys(Keys.F5);
//		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.location.reload();" );
		
		
		
		

	}

}
