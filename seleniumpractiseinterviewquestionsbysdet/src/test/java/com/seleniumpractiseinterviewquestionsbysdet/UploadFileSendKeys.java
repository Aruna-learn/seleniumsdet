package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSendKeys {

	//How to upload the files in selenium
	//using sendkeys and robot class
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//sendkeys method(sendkeys will use type=file only
		driver.findElement(By.id("file-upload")).sendKeys("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\element.png");
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		
		WebElement successmessage=driver.findElement(By.id("//h3"));
		System.out.println("successfully uploaded");
		System.out.println(successmessage.getText());
		
		
//         driver.get("https://demo.automationtesting.in/FileUpload.html");
//		
//		//sendkeys method(sendkeys will use type=file only
//		driver.findElement(By.id("input-4")).sendKeys("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\Homepage.png");
//		System.out.println("successfully uploaded");
//		
		
		
		
		
		

	}

}
