package com.seleniumpractiseinterviewquestionsbysdet;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitGenericMenthod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.google.com");
		 WebElement search=	driver.findElement(By.name("q"));
			search.sendKeys("selenium");
			search.sendKeys(Keys.ENTER);
		
			
			By elelocator = By.xpath("//h3[text()='Selenium']");//By is class
			waitforfluentwait(driver, elelocator).click();
		
	}
public static WebElement waitforfluentwait(WebDriver driver,final By locator) {
	Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(4))
			.ignoring(Exception.class);

			WebElement element=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement applyy(WebDriver driver) {
			return driver.findElement(locator);
			}

			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
				
			}
			});
	return element;

}


}
