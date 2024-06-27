package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));

		Actions act=new Actions(driver);
		//act.moveToElement(women).perform();//perrform internally calls build.perform
		//act.moveToElement(women).build().perform();//build.perform has 2 times calls build then perform because perform has the build.peform
		
		act.moveToElement(women).build();//build is an retun type for action so we created action before complte the action
	Action action=	act.moveToElement(women).build();// created action stores in Action variable then perform
		action.perform();
		
	}

}
