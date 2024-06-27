package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVSGetAttributevalue {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		
		WebElement input=driver.findElement(By.id("FirstName"));
		input.sendKeys("jkeyeoi");
		Thread.sleep(3000);
		//input.clear();
	System.out.println("get text:"+input.getText());	//get text return the inner text like abc@gmail.com and it returns tthe text
		System.out.println(input.getAttribute("id"));//get attribute gives the attributes value here id attribute has firstname value
		//for type having text attribute value and placeholder having username and passord
		
		
		
		//for login get text and get atribute value
		WebElement ele=driver.findElement(By.id("register-button"));
		System.out.println(ele.getText());
		
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getAttribute("name"));
		
		WebElement ele1=driver.findElement(By.className("button-1"));
		System.out.println(ele1.getText());
		
		
		
		driver.close();
		
	}

}

//get text return inner text of an element
//get attribute fetches the text containded by an attribute in an html document