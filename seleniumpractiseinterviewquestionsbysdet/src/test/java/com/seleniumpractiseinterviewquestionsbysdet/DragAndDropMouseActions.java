package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement img1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement target=driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(img1, target).perform();
		Thread.sleep(5000);
		act.dragAndDrop(img2, target).perform();
		
		
		
		
		
		
		
		
	}

}
