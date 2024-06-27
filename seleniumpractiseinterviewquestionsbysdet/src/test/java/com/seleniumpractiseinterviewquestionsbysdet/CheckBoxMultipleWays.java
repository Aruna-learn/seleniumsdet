package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxMultipleWays {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		
		//1 select specific check box
		//driver.findElement(By.id("wednesday")).click();
		
		
		//2 select all check boxes
	List<WebElement> daybox=	driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("no of checkboxes:"+daybox.size());
		
for (WebElement chk : daybox) {//check all boxees using ofr each loop
	
	chk.click();
	Thread.sleep(3000);
	
	
//	String box=chk.getAttribute("id");
//	if(box.equals("monday")||box.equals("saturday")) {
//		 chk.click();// wecan unchck the box again
//	 }
	
}
		/*
		 * for(int i=0;i<=daybox.size();i++) {//using for loop click all checkboxes
		 * daybox.get(i).click();
		 * 
		 * }
		 */
		
		
		//3 select multiple check boxes by choice
		//select moday and saturday
//		for (WebElement chk : daybox) {
//			 String box=chk.getAttribute("id");
//			 if(box.equals("monday")||box.equals("saturday")) {
//				 chk.click();
//			 }
//			
//		}
		
		//4 select last 2 checkboxes
	
		 //int sizeb=daybox.size();
//		for(int i= sizeb-2;i<=sizeb;i++) {
//			daybox.get(i).click();
//		}
//		
		
		//5 select 1st 2 checkboxes
		
//		 for(int i= 0;i<=sizeb;i++) {
//		if(i<2) {
//			daybox.get(i).click();
//			
//		}
//			 
//	}
	}
}
