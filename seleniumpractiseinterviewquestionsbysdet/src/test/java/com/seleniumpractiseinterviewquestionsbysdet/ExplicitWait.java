package com.seleniumpractiseinterviewquestionsbysdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait(applicable for all elements write only once in driver)
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// wait 5sec to find the element
		
		//Explicitwait(applies to specific element and wait until specific condition matched)
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		
		driver.get("https://www.google.com");
		
	  WebElement search=	driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);
		
		WebElement waiting=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h3[text()='Selenium']"))));
		//driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		waiting.click();
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
