package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeandLocationofWebElement {

	//how to capture size and location of weblelement
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img"));
		
		//Location-method1
		System.out.println("locations of xand y is:"+logo.getLocation());
		System.out.println("locations of x is:"+logo.getLocation().getX());
		System.out.println("locations of y is:"+logo.getLocation().getY());
		
		
		//Location-method2
				System.out.println("locations of xand y is:"+logo.getRect());
				System.out.println("locations of x is:"+logo.getRect().getX());
				System.out.println("locations of y is:"+logo.getRect().getY());
		
				
			//size-method1
				System.out.println("Size(Width,height):"+logo.getSize());
				System.out.println("Size (Width):"+logo.getSize().getWidth());
				System.out.println("Size (height):"+logo.getSize().getHeight());
				
				
				//size-method2
				System.out.println("Size(Width,height):"+logo.getRect().getDimension());
				System.out.println("Size (Width):"+logo.getRect().getDimension().getWidth());
				System.out.println("Size (height):"+logo.getRect().getDimension().getHeight());	
				
		
		
		
		
		
		driver.close();
	}

}
