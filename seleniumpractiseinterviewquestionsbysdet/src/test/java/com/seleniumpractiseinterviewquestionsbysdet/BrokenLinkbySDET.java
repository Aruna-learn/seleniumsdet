package com.seleniumpractiseinterviewquestionsbysdet;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkbySDET {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));//links having tag as a so we used as "a"
		System.out.println(links.size());//prints size of links
		
		for (WebElement br : links) {
		
			//ystem.out.println(br.getText());
			//System.out.println(br.getAttribute("href"));
			String broken=br.getAttribute("href");
			URL url=new URL(broken);//converting href string to URL
			URLConnection urlconnection=url.openConnection();
			HttpURLConnection httpurlconnection=(HttpURLConnection)urlconnection ;
			httpurlconnection.connect();
			

				if(httpurlconnection.getResponseCode()==200)//if 200 it prints all the links and if not prints all the broken links also but here we gt all the links we no need to scroll and get duplicate also the broken link to overcome we use the set and hashset
					System.out.println(broken+ "-"+ httpurlconnection.getResponseMessage());
				else
					System.err.println(broken+ "-"+ httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());
				httpurlconnection.disconnect();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
