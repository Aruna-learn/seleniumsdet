package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkinNewTab {
//how to open link in new tab
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://the-internet.herokuapp.com/");
		
	String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);//using multiple keys and store in tab as string
		
	driver.findElement(By.linkText("Disappearing Elements")).sendKeys(tab);//using keys disappearing elements will open in the new tab
		
		
		

	}

}
