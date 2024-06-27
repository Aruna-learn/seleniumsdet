package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsMultipleKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		Thread.sleep(3000);
		input1.sendKeys("Learning selenium");
		
		Actions act=new Actions(driver);
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL);//press the ctrl
		act.sendKeys("a");//press a
		act.keyUp(Keys.CONTROL);//release the ctrl and a
		act.perform();//perform the action
		Thread.sleep(3000);
		
		//Ctrl+c
				act.keyDown(Keys.CONTROL);//press the ctrl
				act.sendKeys("c");//press c
				act.keyUp(Keys.CONTROL);//release the ctrl and c
				act.perform();//perform the action
		
		//tab-shift to input 2 box
		act.sendKeys(Keys.TAB);
		act.perform();
		
		
		//ctrl+v
		act.keyDown(Keys.CONTROL);//press the ctrl
		act.sendKeys("v");//press v
		act.keyUp(Keys.CONTROL);//release the ctrl and v
		act.perform();//perform the action
		
		//compare the text in input1 and input2
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("compared");
		}
			else
			
				System.out.println("not compared the text");
		}
		

	}

