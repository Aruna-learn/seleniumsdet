package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//page factory extension of pom
public class SwagLoginPage1 implements SearchContext {
	
	WebDriver driver;
	
	//findby is page factory annotation
	@FindBy(how=How.ID, using="user-name")//identification and find element in same statement and no need to use find element method, HOW is class and how is variable
	WebElement username;
	
	@FindBy(how=How.ID, using="password")//using how class and how variable finding element by findby method using element password(in httml code)
	WebElement password;//i hae to find the password element(user giving name)
	
	@FindBy(how=How.ID, using="login-button")
	WebElement login;
	
	//another way of writing the above
	
//	@FindBy(name="user-name")
//	WebElement username;
//
//	@FindBy(name="password")
//	WebElement password;
//	
//
//	@FindBy(name="login-button")
//	WebElement login;

	
	SwagLoginPage1(WebDriver d){//calling default constructor//iniialize driver object
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void setloginname(String name) {
		username.sendKeys(name);//find element and not using find element method
		
		}
		
		public void setloginpass(String passwod) {
			password.sendKeys(passwod);
			
			}
		
		public void linklogin() {
			login.click();

		}

		public List<WebElement> findElements(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		public WebElement findElement(By by) {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
