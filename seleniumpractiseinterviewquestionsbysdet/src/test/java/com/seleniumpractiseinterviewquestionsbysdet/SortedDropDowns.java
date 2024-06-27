package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropDowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement ele= driver.findElement(By.name("category_id"));
	Select drop =new Select(ele);
		
	List<WebElement>option=drop.getOptions();//capture all options
	
	
		ArrayList orignallist=new ArrayList();//store the text values of options in arraylist
		ArrayList templist=new ArrayList();
		
		for (WebElement list : option) {
			
			orignallist.add(list.getText());//add/store text to original list
			templist.add(list.getText());//add /store text to temp list
		}
		
		
		System.out.println("original list is:"+orignallist);
		System.out.println("temp list is:"+templist);
		
		
		
		Collections.sort(templist);//sorting templist
		
		System.out.println("original list is:"+orignallist);
		System.out.println("temp list is:"+templist);
		
		
		if(orignallist.equals(templist))//comparing original list with sorted list
		{
			System.out.println("sorted..");
		}
		else
			System.out.println("unsorted");
		
		
		
	}

}
