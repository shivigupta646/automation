package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaketingLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\newDriver");
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888/");     /////  1
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	
    	   driver.findElement(By.linkText("Marketing")).click();
        driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//input[@id='32']")).click();
		driver.findElement(By.xpath("//input[@id='33']")).click();
		driver.findElement(By.xpath("//input[@id='39']")).click();
		driver.findElement(By.xpath("//input[@id='34']")).click();
		driver.findElement(By.xpath("//input[@id='40']")).click();
		driver.findElement(By.xpath("//input[@id='35']")).click();
		driver.findElement(By.xpath("//input[@id='37']")).click();
		driver.findElement(By.xpath("//input[@id='38']")).click();
		driver.findElement(By.xpath("//input[@id='36']")).click();
		driver.findElement(By.xpath("//input[@id='41']")).click();
		driver.findElement(By.xpath("//input[@id='126']")).click();
		driver.findElement(By.xpath("//input[@id='127']")).click(); 
		driver.findElement(By.xpath("//img[@title=\"Create Lead...\"]")).click();
		//driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		driver.findElement(By.xpath("(//select[@id='qccombo'])[1]")).click();
        //driver.findElement(By.xpath("(//select[@id='qccombo'])[2]")).click();
		//driver.findElement(By.xpath("(//select[@id='qccombo'])[3]")).click();
		    
		   
	}}
