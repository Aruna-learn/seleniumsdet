package com.seleniumpractiseinterviewquestionsbysdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		//fluent wait declaration
//	Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(4))
//				.ignoring(Exception.class);
//		
//		
//		
//		WebElement search=	driver.findElement(By.name("q"));
//		search.sendKeys("selenium");
//		search.sendKeys(Keys.ENTER);
		
//		//usage of fluent wait
//		WebElement sel=wait.until(new Function<WebDriver,WebElement>(){
//			
//			public WebElement apply(WebDriver driver) {
//			
//			return driver.findElement(By.xpath("//h3[text()='Selenium']"));
//		}
//		
//		});
//		
//		sel.click();
	}

}
