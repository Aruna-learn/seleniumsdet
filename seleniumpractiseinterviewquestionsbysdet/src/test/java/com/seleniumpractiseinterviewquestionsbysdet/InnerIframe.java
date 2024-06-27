package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
      driver.findElement(By.linkText("Iframe with in an Iframe")).click();
     
       WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
      driver.switchTo().frame(outerframe);//frame as webelement



	
	Thread.sleep(3000);
	
	WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aruna");
		
		
	}

}
