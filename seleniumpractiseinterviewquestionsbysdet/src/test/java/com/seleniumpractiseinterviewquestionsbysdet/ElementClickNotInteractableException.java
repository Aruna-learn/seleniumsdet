package com.seleniumpractiseinterviewquestionsbysdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickNotInteractableException {

	
	//selenium doen't provide facility to find hidden elements so we use the jsexecutor
	public static void main(String[] args) {
          
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.letskodeit.com/practice");
         
		driver.findElement(By.id("hide-textbox")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value='Aruna';" );
		
		
		
		
		
		//driver.findElement(By.id("displayed-text")).sendKeys("aruna");//sending data to hidden element so get element click not interactable exception so using jsexector issue solved
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
