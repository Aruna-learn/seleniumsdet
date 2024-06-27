package com.seleniumpractiseinterviewquestionsbysdet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotstypes {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Screenshot of webpage
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File target=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\Homepage.png");
//		//FileUtils.copyfiles(src,target);
//		FileHandler.copy(src, target);
		
		//screenshot of specific section
//		WebElement section=driver.findElement(By.xpath("//div[@class='tLbyDf']"));
//		File src=section.getScreenshotAs(OutputType.FILE);
//		File target=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\section.png");
//		//FileUtils.copyfiles(src,target);
//		FileHandler.copy(src, target);
//		
		
		
		//screenshot of specific webelement
				WebElement element=driver.findElement(By.xpath("//img[@class='_2puWtW _3a3qyb']"));
				File src=element.getScreenshotAs(OutputType.FILE);
				File target=new File("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\element.png");
				//FileUtils.copyfiles(src,target);
				FileHandler.copy(src, target);
		
		
		
		
		
		
		
		
		
		
		
	}

}
