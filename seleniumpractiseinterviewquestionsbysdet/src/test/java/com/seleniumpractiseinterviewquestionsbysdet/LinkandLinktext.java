package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkandLinktext {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//link and link text
		//driver.findElement(By.linkText("Become a Seller")).click();
		//driver.findElement(By.partialLinkText("Seller")).click();
		
		
		//how to capture all the links in a webpage
		List<WebElement> link=driver.findElements(By.tagName("a"));//all links in anchor tag so use the tagname
		System.out.println("Links in flipkart is:"+link.size());
		
		
		//see each link use for each loop
//		for (WebElement atag : link) {
//			System.out.println(atag.getAttribute("href"));
//			System.out.println(atag.getText());
//			
//		}
		
		//see each link use for  loop
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i).getText());
			System.out.println(link.get(i).getAttribute("href"));
			
		}
		
		
		
		
		
	Thread.sleep(3000);
  driver.close();
	}

}
