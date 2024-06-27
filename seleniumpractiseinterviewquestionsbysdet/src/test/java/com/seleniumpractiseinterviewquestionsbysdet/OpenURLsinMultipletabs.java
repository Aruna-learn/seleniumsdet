package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



//how to open url's in multiple tabs /windows

public class OpenURLsinMultipletabs {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	//if we write like this 1st flipkart will open then in the same tab after flipkart opencart will open
//	driver.get("https://www.flipkart.com");
//	driver.get("https://www.opencart.com");
		
		
		
		//1st flipkart will open then in the new tab opencart will open
//		driver.get("https://www.flipkart.com");
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.opencart.com");
			
		
		
		//1st flipkart  opne then in the new browser window opencart will open
		
         driver.get("https://www.flipkart.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.opencart.com");
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
