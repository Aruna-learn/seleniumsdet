package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAFOXExceptions {//qa fox is utube channel for interview selenium questions

	public static void main(String[] args) {
		
            WebDriver driver=new ChromeDriver();
		
		//driver.get("www.google.com");if we didn't use http r https in the url we will get invalid agument excepton
		
		driver.get("https://www.opencart.com");
		
		//No SuchElement Exception(if element finding not correct or need time find the element in page so provide wait exception will solve)
		//driver.findElement(By.linkText("Login")).click();//correctone
		//driver.findElement(By.linkText("Loginx")).click();//error received
		
		
		//we have timeout and pageload timeout exceptions there
		//staleelement exception 
		
		
		
		//No Such window Exception
//driver.switchTo().window("abcd");
		
		
		//No Such alert present Exception
//driver.switchTo().alert();
		
		//No such frame Exception
//driver.switchTo().frame("aruna");
		
		
		
		
		//invalid selector exception(location elemting path wrong here using /// instead of //)

   //driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']")).click();//correct one
   //driver.findElement(By.xpath("///a[@class='btn btn-link navbar-btn']")).click();//correct one



		//No Suchsession Exception(quit the driver  then try to perform action on page)
//driver.quit();

//driver.findElement(By.linkText("Login")).click();

		
		//Elementnot clickable(selenium didn'find the hidden elemnets so get error  wecan use jsexecutor to solve)
		driver.findElement(By.linkText("Register")).click();//correctone
	//	ElementClickNotInteractableException.java
		
		
	}

}
