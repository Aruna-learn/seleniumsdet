package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverReferenceVariable {

	public static void main(String[] args) {
		
		String browser="chrome";// we can change here as per browse required

		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
		
			driver=new EdgeDriver();
		}
			else if(browser.equalsIgnoreCase("Firefox")) {
				
				driver=new FirefoxDriver();
		
			}
		
				else if(browser.equalsIgnoreCase("ie")) {
					
					driver=new InternetExplorerDriver();
				}
		
			driver.get("https://www.letskodeit.com/practice");
		
		
		
		
	}

}
