package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagloginTest {
@Test
	public void verifylogin() {
		
		WebDriver driver=new ChromeDriver();
		
		//SwagLoginPage sl=new SwagLoginPage(driver);//1way of pom
		SwagLoginPage1 sl=new SwagLoginPage1(driver);//2nd way of pom
		
		driver.get("https://www.saucedemo.com/");
		
		sl.setloginname("apoololla@gmail.com");		
		sl.setloginpass("Ammu@460");
		sl.linklogin();
		
		//validation
		if(driver.getPageSource().contains("Thanks for login")) {
			System.out.println("successfully login");
		}
		
		else
			System.out.println("login failed");
		
		
		driver.close();
	}
}
