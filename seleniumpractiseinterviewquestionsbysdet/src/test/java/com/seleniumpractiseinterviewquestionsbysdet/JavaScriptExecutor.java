package com.seleniumpractiseinterviewquestionsbysdet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//drawborder
//		WebElement web=driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']"));
//		JavaScriptUtils.drawborder(web, driver);
//		
		//Takesceenshot
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\logo.png");
//		FileHandler.copy(src, dest);
		
		
		//get title
//	    String title=JavaScriptUtils.getTitleByJS(driver);
//		System.out.println(title);
        
		Thread.sleep(3000);
		//click actions
//		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
//		JavaScriptUtils.clickelementByJS(reglink, driver);
		
		//generate alert
		//JavaScriptUtils.generateAlert(driver,"This my alert...");
		
		//refreshing the page
	//	JavaScriptUtils.refreshbrowserByJS(driver);
		
		
		
	//scrolling down
		//JavaScriptUtils.scrollPageDown(driver);
	
		//Thread.sleep(3000);
		
		//scrolling up
	  //  JavaScriptUtils.scrollPageUp(driver);

	    //zoom
	   // JavaScriptUtils.zoomPageByJS(driver);
	    
	    
	    
	    //flash
	    WebElement web=driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']"));
	   JavaScriptUtils.flash(web, driver);
	    
	}

}
