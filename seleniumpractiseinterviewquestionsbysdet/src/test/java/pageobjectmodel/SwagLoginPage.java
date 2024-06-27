package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLoginPage {
//1 way of page object model
	WebDriver driver;

	By username=By.id("user-name");//identification of element
	By password=By.id("password");
	
	By login=By.id("login-button");
	
	
	
	SwagLoginPage(WebDriver d){//calling default constructor//iniialize driver object
		driver=d;
	}
	
	public void setloginname(String name) {
	driver.findElement(username).sendKeys(name);//find element
	
	}
	
	public void setloginpass(String passwod) {
		driver.findElement(password).sendKeys(passwod);
		
		}
	
	public void linklogin() {
		driver.findElement(login).click();

	}
	
	
	
	
	
		
	
}
