package com.seleniumpractiseinterviewquestionsbysdet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
//		driver.get("https://www.google.com");
//		
//		driver.findElement(By.name("q")).sendKeys("java");
//		Thread.sleep(3000);
//		
//	List<WebElement> list=	driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//div[@role='option']//div[1]/span"));
//		
//		System.out.println("size of the list is:"+list.size());
//		
//		
//		for (WebElement option : list) {
//			//String optiontext=option.getText();//for anchor tag we use get text method
//			System.out.println(option.getText());
//			
//			if(option.getText().endsWith("tpoint"))
//			{
//			option.click();
//			break;
//		}
//
//	}
		
		
driver.get("https://www.bing.com/?toWww=1&redig=08BB114749594706864014D918D6E0FF");
		
		driver.findElement(By.name("q")).sendKeys("gmail");
		Thread.sleep(9000);
		
	List<WebElement> list=	driver.findElements(By.xpath("//li[@role='option']//div[@class='sa_tm']/span"));
		
		System.out.println("size of the list is:"+list.size());
		
		
		for (WebElement option : list) {
			//String optiontext=option.getText();//for anchor tag we use get text method
			System.out.println(option.getText());
			
			if(option.getText().contains("inbox"))
			{
			option.click();
			break;
		}

	}
		


		
		
	}

}
