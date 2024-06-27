package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
//how to capture tooltip of webelement
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/tooltip/");
//		
//		driver.switchTo().frame(0);
//		
//	WebElement tooltip=	driver.findElement(By.id("age"));
//		
//		String text=tooltip.getAttribute("title");//tooltip assigned to only title attribute
//		
//		System.out.println(text);//get the text of tooltip or text
//		
//		driver.close();
//		
		
//    driver.get("https://formstone.it/components/tooltip/");
//		
//		//driver.switchTo().frame(0);
//		
//	//WebElement tooltip=	driver.findElement(By.xpath("//button[@class='mat-mdc-tooltip-trigger mdc-button mdc-button--raised mat-mdc-raised-button mat-unthemed mat-mdc-button-base']/span[2]"));
//		
//	WebElement tooltip=driver.findElement(By.xpath("//div[@data-title='Left Tooltip']"));
//		String text=tooltip.getAttribute("data-title");//tooltip assigned to only title attribute
//		
//		System.out.println(text);//get the text of tooltip or text
//		
//		driver.close();
		
driver.get("https://ant.design/components/tooltip");
		
		//driver.switchTo().frame(0);
		
	//WebElement tooltip=	driver.findElement(By.xpath("//button[@class='mat-mdc-tooltip-trigger mdc-button mdc-button--raised mat-mdc-raised-button mat-unthemed mat-mdc-button-base']/span[2]"));
		Thread.sleep(3000);
	WebElement tooltip=driver.findElement(By.xpath("//div[@class='ant-tooltip-inner']"));
		String text=tooltip.getAttribute("role");//tooltip assigned to only  attribute
		
		System.out.println(text);//get the text of tooltip or text
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
