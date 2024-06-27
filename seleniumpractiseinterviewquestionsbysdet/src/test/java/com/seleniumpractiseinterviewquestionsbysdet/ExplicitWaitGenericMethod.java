package com.seleniumpractiseinterviewquestionsbysdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitGenericMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);

		By elelocator = By.xpath("//h3[text()='Selenium']");//By is class
		waitforexplicitwait(driver, elelocator, 10).click();//wait for 10sec to find the element

		

	}

	public static WebElement waitforexplicitwait(WebDriver driver, By locator, int timeout) {// by using generic method instaead of writng wait statements for multiple elements we an call this method

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return driver.findElement(locator);

	}

}
