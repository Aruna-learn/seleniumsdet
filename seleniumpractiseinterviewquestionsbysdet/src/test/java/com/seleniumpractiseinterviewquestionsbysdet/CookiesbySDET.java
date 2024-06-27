package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesbySDET {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// ceate driver instance
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");// launch application

		// How to capture coockies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("number of coockies are:" + cookies.size());

		
		// how to print coockies form browser
//		for (Cookie cookie : cookies) {
//
//			System.out.println(cookie.getName() + ":" + cookie.getValue());
//
//		}
		
		
		// how to add cookies o browserr
		Cookie cookieobj = new Cookie("Aruna", "123");
		driver.manage().addCookie(cookieobj);

		cookies = driver.manage().getCookies();
		System.out.println("size of coockies after adding" + cookies.size());//after coockie adding get size

		
		
		
		//delete specific cookie (pass the cookie obj)
		driver.manage().deleteCookie(cookieobj);
		
		cookies = driver.manage().getCookies();
		System.out.println("size of coockies after deleting pass objec" + cookies.size());//after coockie deleting specific get size
		
		
		
		//delete cookies by name
		driver.manage().deleteCookieNamed("Aruna");
		cookies = driver.manage().getCookies();
		System.out.println("size of coockies after deleting specific name" + cookies.size());
		
		
		
		//delete all coockies from browser
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("size of coockies after deleting all cookies" + cookies.size());
		
		
		
		driver.close();
	}

}
