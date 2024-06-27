package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteAPIDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twoplugs.com/");//open webpage twoplugs
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();//click on live posting
		
		
		WebElement searchbox=driver.findElement(By.id("autocomplete"));//find element for autocomplete
		searchbox.clear();//clear the text inseach box
		Thread.sleep(3000);
		
		searchbox.sendKeys("Canada");//search canada
		Thread.sleep(3000);
		String text;//store text in string
		
		do {
			
			searchbox.sendKeys(Keys.ARROW_DOWN);//we can't inspect in autocomplte so use the keyboard keys arro_down, up, left, right
			text=searchbox.getAttribute("value");
			if(text.equals("Canada Water, London, UK"))
			{
				
				Thread.sleep(3000);
				searchbox.sendKeys(Keys.ENTER);//if the text equal click on enter
				break;
			}
			Thread.sleep(3000);
		} while (!text.isEmpty());//if text is not empty write login in do 
		
	}

}
