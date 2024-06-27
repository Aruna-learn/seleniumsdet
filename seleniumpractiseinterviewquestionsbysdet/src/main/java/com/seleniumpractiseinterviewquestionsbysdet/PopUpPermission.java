package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpPermission {

	public static void main(String[] args) throws InterruptedException {
		
		
		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		Thread.sleep(6000);
		//contentSettings.put("notifications", 1);//ask default
//		contentSettings.put("notifications", 2);//block
			contentSettings.put("notifications", 1);//allow
		
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in");

	}

}
