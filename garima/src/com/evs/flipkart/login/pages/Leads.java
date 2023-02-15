package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888/");     /////  1
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	
   	   driver.findElement(By.linkText("Marketing")).click();
       driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//td[contains(@class,'SelTab')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
