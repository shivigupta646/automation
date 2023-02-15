package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarketingAccount {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\vikshi\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\shivii\\\\\\\\garima\\\\\\\\deiver\\\\\\\\newDriver\\\\\\\\chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888/");     /////  1
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	  
	  driver.findElement(By.linkText("Marketing")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_1']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_2']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_3']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_4']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_5']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_6']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_7']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_8']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_9']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_10']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_11']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_12']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_13']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_14']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_15']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_16']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_17']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_18']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_19']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_20']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_21']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_22']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_23']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_24']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_25']")).click();
	  driver.findElement(By.xpath("//td[@id='alpha_26']")).click();
	  
	  driver.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
	  
	   driver.findElement(By.linkText("Accounts")).click();
	//driver.findElement(By.xpath("//select[@id='qccombo']")).click();
	 //  driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
	 //  driver.findElement(By.xpath("//input[@name='selectall']")).click();
	  driver.findElement(By.xpath("//input[@id='2']")).click();
	  driver.findElement(By.xpath("//input[@id='4']")).click();
	  driver.findElement(By.xpath("//input[@id='6']")).click();
	  driver.findElement(By.xpath("//input[@id='8']")).click();
	  driver.findElement(By.xpath("//input[@id='10']")).click();
	  driver.findElement(By.xpath("//input[@id='12']")).click();
	  driver.findElement(By.xpath("//input[@id='14']")).click();
	  driver.findElement(By.xpath("//input[@id='16']")).click();
	  driver.findElement(By.xpath("//input[@id='18']")).click();
	  driver.findElement(By.xpath("//input[@id='20']")).click();
	  driver.findElement(By.xpath("//input[@id='128']")).click();
	
	
	 //  driver.findElement(By.xpath("//form[@method='POST']")).click();
	  driver.findElement(By.xpath("//form[@method='POST']")).click();
	  driver.findElement(By.xpath("//form[@id='massdelete']")).click();
	 
	  driver.findElement(By.xpath("//img[@title='Open Calendar...']")).click();
	 
			 // driver.findElement(By.xpath(null));
	}
}
	  
//ANCESTOR ---to find an element on the basis of the parent element we can use ancestor Attribute of Xpath.
//
	  