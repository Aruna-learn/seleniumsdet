package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameBackward {

	public static void main(String[] args) throws InterruptedException {
//get text from inner iframe then switch to parent iframe then print text= reverse order
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");//switch parent frame and usinf frame as name
		driver.switchTo().frame(0);//switch to inner frame
		Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//h1")).getText());//get text of the inner frame
		Thread.sleep(3000);
		driver.switchTo().parentFrame();//switch to parent frame
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width')]"));//get text of parent frame
		System.out.println(text.getText());
		
		
		
		
		
		

	}

}
