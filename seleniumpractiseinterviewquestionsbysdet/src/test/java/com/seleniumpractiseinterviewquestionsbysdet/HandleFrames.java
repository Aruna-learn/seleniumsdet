package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/iframes/");
		Thread.sleep(3000);

		
		//frame 1
		driver.switchTo().frame("frame2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='Button Button--default Button--icon MenuModal__MenuButton NavBar__Menu--item']")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("frame1");//frame as name
		Thread.sleep(3000);
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}

}
