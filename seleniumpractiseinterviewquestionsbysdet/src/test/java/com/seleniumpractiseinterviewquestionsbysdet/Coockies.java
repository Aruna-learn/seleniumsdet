package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coockies {

	// https://www.selenium.dev/documentation/webdriver/interactions/cookies/

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().addCookie(new Cookie("test1", "cookie1"));// add coockie
		// driver.manage().addCookie(new Cookie("test2", "cookie2"));

		Cookie cookie1 = driver.manage().getCookieNamed("test1");// get specific cookie
		System.out.println(cookie1);

		Set<Cookie> cokie = driver.manage().getCookies();// get all coockie

		System.out.println(cokie);

		driver.manage().deleteAllCookies();// delete all coockie

//// delete a cookie with name 'test1'
//driver.manage().deleteCookieNamed("test1");//delete specific coockie

		/*
		 * Selenium Java bindings also provides a way to delete cookie by passing cookie
		 * object of current browsing context
		 */
//driver.manage().deleteCookie(cookie1);
	}

}
