package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws Exception {
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		  //Locate the search text box
		  WebElement ele = driver.findElement(By.name("q"));
		  //Refresh the web page
		  driver.navigate().refresh();
		  //Pass string using sendkeys to the web element
		  ele.sendKeys("Testing String");//stale element exception
		 // driver.quit();
		
		
		  try {
			  ele.sendKeys("Testing String");
		  }
		catch(StaleElementReferenceException e)
		  {
			 WebElement elem = driver.findElement(By.name("q"));
			 elem.sendKeys("Testing String");
			 String str = elem.getAttribute("value");
			  System.out.println("The string entered from catch block is - " +str);
			
		  }
		
		
		
		
		
	}

}
