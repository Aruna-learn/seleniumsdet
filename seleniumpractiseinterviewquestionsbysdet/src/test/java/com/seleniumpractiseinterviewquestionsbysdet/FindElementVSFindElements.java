package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVSFindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		// Find element
		// one element use find element

//		WebElement element=driver.findElement(By.name("q"));
//		element.sendKeys("Ammu");

		// multiple elements use find element returns 1st element only

//		WebElement element1=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
//		System.out.println(element1.getText());

		// no such element exception in find element
		// driver.findElements(By.id("register-button"));//no error
		// driver.findElement(By.id("regist-button"));//no such element exception in
		// find element

		// find elements

		// multiple elements use find elements in list
		List<WebElement> element1 = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("NO o captured is:" + element1.size());

		for (WebElement webElement : element1) {// iterate each element
			System.out.println(webElement.getText());

		}

//find elements get the single element also
		List<WebElement> element2 = driver.findElements(By.name("q"));
		System.out.println(element2.size());

		// if element not found in find elements it retuns zero no exception will get

		List<WebElement> element3 = driver.findElements(By.id("regist-button"));
		System.out.println(element3.size());
	}

}
