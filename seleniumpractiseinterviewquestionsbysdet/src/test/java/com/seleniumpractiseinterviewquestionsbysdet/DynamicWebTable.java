package com.seleniumpractiseinterviewquestionsbysdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		//How to handle Dynamic web table//rows and columns not fixed
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demo.opencart.com/admin/");
				
		//login
		WebElement usrname=driver.findElement(By.name("username"));
		usrname.clear();
		Thread.sleep(3000);
		usrname.sendKeys("demo");
		
		WebElement password=driver.findElement(By.name("password"));
		usrname.clear();
		Thread.sleep(3000);
		usrname.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//sales-orders
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		//driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr"));//no of rows
		//driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//thead/tr//td"));//no of coulums
		
		//Table
		//total no of pages in table
	    String text=	driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);
		
		
		//Showing 1 to 10 of 368 (37 Pages) but i need 37 only to get we have to use the indexof methods for (37 Pages) 
		
		text.indexOf("(");
		text.indexOf("Pages");
		//text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1);//using substring we can combine both indexes and +1 used because index start with zero, -1 for space between 37 and pages 
		
	  int pages=Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));//converting string to number using inter.valueof method)
		System.out.println("pages count is:"+pages);
		
		
		//total number of rows exists in each page
		
		for(int p=0;p<=pages;p++)
		{
			
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));//get active pages we we write span[1] it show 1st active only to get all we an use span
			System.out.println("Active page:"+active_page.getText());//print active pages text
			Thread.sleep(9000);
			active_page.click();//click on the active page move forward
			
			//prints rows of active page
			int rows=	driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			System.out.println("number of rows are:"+ rows);//prints rows of active page
			
			Thread.sleep(9000);
			
			//read all rows from each page
			for(int r=1;r<=rows;r++) {
				
				String Orderid=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();//we can't put the r and c in the xpath(variables) so we use the +r+ and +c+ so it will take from the loop
				String store=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				
				
				if(status.equals("Pending")) {
				
				System.out.println(Orderid+" "+store+" "+status);//it print value
				
				}
			}
				//nextpage active
				String pageno=Integer.toString(p+1);
				Thread.sleep(9000);
				driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();//to move to next active page we use the achor tag and passing dynamically to move to next active page
				//active_page.click();//click on the active page move forward
				
				
				
			}
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		


	}

}
