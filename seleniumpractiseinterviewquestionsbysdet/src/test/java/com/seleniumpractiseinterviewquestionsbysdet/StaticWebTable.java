package com.seleniumpractiseinterviewquestionsbysdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		//How to handle static web table//rows and columns fixed
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		
		
		//how many rows in a table
	int rows=	driver.findElements(By.xpath("//table[@class='table table-striped mt-3']/tbody//tr")).size();
	System.out.println("number of rows are:"+ rows);
		
		//how many colums in table
	int cols=	driver.findElements(By.xpath("//table[@class='table table-striped mt-3']/thead//tr/th")).size();
	System.out.println("number of columns are:"+ cols);
		
		
	//Retrieve specific row data
	WebElement rd=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr[2]/td[1]"));
	System.out.println("values is:"+rd.getText());
		
	WebElement rd1=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr[2]/td[4]"));
	System.out.println("values is:"+rd1.getText());
		
	//Retrieve specific column data
	WebElement col=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/thead/tr/th[6]"));
	System.out.println("values is:"+col.getText());
	
	
	//Retrieve all the data from table
//	System.out.println("data from the table----------------------------------");
//	
//	for(int r=1; r<=rows;r++) {
//		for(int c=1;c<=cols;c++)
//		{
//			
//			String allrd=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]/td["+c+"]")).getText();//we can't put the r and c in the xpath(variables) so we use the +r+ and +c+ so it will take from the loop
//			System.out.print(allrd+"  ");
//			
//		}
//		System.out.println();
//	}
	
	
	//print department and salary of Kierra
	
	for(int r=1;r<=rows;r++) {
		
		String name=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td[1]")).getText();
		if(name.equals("Cierra"))
		{
			
			String salary=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td[5]")).getText();
			String Compliance=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td[6]")).getText();
            System.out.println(name+" " +salary+" "+Compliance);
			
			
		}
		if(name.equals("Alden"))
		{
			
			String salary=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td[5]")).getText();
			String Compliance=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td[6]")).getText();
            System.out.println(name+" " +salary+" "+Compliance);
			
			
		}
		
	}
	
	
	
	
		
		driver.quit();

	}

}
