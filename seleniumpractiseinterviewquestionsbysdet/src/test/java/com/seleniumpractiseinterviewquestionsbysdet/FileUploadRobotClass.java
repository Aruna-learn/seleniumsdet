package com.seleniumpractiseinterviewquestionsbysdet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobotClass {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://primeng.org/fileupload");
//		
//		WebElement robot=driver.findElement(By.xpath("//span[@class='p-button-label']"));
//		//WebElement robot=driver.findElement(By.xpath("//span[@class='p-button-label']"));)
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();",robot);//click action on the button
//		
//		
//		Robot rb=new Robot();//robot class
//		rb.delay(3000);
//		
//		
//		
//		//stringselection class used to put path to file to clipboard(ctrl+c)
//		StringSelection ss=new StringSelection("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\Homepage.png");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
//		
//		
//		
//		
//		//ctrl+v
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		rb.delay(3000);
//		
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//		rb.delay(3000);
//		
//		//enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		
//		System.out.println("file uploaded successfully");
//		
//		
		
driver.get("https://the-internet.herokuapp.com/upload");//https://easyupload.io/
		Thread.sleep(4000);
		WebElement robot=driver.findElement(By.id("file-upload"));////button[@class='dz-button']
		//WebElement robot=driver.findElement(By.xpath("//span[@class='p-button-label']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",robot);//click action on the button we can use normal clck also
		
		
		Robot rb=new Robot();//robot class
		rb.delay(6000);
		
		
		
		//stringselection class used to put path to file to clipboard(ctrl+c)
		StringSelection ss=new StringSelection("C:\\JAVA_PRACTISE\\Git_Practise\\seleniumpractiseinterviewquestionsbysdet\\CaptureScreenshotbySDET\\Homepage.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		
		rb.delay(8000);
		
		//ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(3000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(3000);
		
		//enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		WebElement successmessage=driver.findElement(By.id("//h3"));
		System.out.println("successfully uploaded");
		System.out.println(successmessage.getText());
		
		
		
		System.out.println("file uploaded successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
