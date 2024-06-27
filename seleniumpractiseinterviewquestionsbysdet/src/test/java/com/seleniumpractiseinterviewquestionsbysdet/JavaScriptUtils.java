package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {

	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='10px dotted red'", element);
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String title= js.executeScript("return Document.title;").toString();
		return title;
	}
	
	public static void clickelementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	
	
	public static void refreshbrowserByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrollPageUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	
	public static void zoomPageByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='30%'");
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String bgcolor=element.getCssValue("backgroundcolor");
		for(int i=0;i<100;i++) {
			changecolor("#000000", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}
	
	
	
	public static void changecolor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundcolor='"+color+"'", element);
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
	
	}
	
	}
}
