package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardandSoftAssertions {
	@Test
	public static void main(String[] args) {
		          
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		SoftAssert soft = new SoftAssert();
		
		//hard assertions
		Assert.assertTrue(driver.getTitle().equals("xyz"));//it stops the execution if it fails and not execute the next steps
		
		
		
		//soft assertion(even the current line executes fails it continues to excute the next tests not stops)
		//soft.assertTrue(driver.getTitle().equals("xyz"));
		
		driver.findElement(By.linkText("Desktops")).click();
		
		driver.findElement(By.linkText("PC (0)")).click();
		
		
		
		
		
		

	}

}
