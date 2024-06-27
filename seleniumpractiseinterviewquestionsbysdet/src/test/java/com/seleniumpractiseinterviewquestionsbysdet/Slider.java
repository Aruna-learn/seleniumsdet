package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act=new Actions(driver);
		WebElement minslider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("location of min slider is:"+minslider.getLocation());//59,250
		System.out.println("size of min slider is:"+minslider.getSize());//21,21
		act.dragAndDropBy(minslider, 90, 0).perform();//left to right move the slider
		System.out.println("location of min slider is:"+minslider.getLocation());//147,250 x axis only there is no y axix to move
		System.out.println("size of min slider is:"+minslider.getSize());//21,21
		
		
		
		
		
		WebElement maxslider=driver.findElement(By.xpath("//span[2]"));
		
		
		System.out.println("location of max slider is:"+minslider.getLocation());//59,250
		System.out.println("size of max slider is:"+minslider.getSize());//21,21
		
		act.dragAndDropBy(maxslider, -30, 0).perform();//right to left move slider
		
        System.out.println("location of max slider is:"+minslider.getLocation());//147,250 x axis only there is no y axix to move
		System.out.println("size of max slider is:"+minslider.getSize());//21,21
		
		//Thread.sleep(3000);
		//driver.close();

	}

}
