package com.evs.flipkart.login.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","Drivers//newDriver//chromedriver.exe");
		 WebDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888/");     /////  1
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin",Keys.ENTER);	
		//VAdriver.get("https://www.flipkart.com");
driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	 
	List<WebElement>  ard= driver.findElements(By.xpath(""));
	
 	
	
	
	
	
	
	
	
	
	//driver.findElement(By.linkText("Marketing")).click();	 
		 
		 
	/*	 
	 List<WebElement>  alfabate= driver.findElements(By.xpath("//td[@class=\"searchAlph\"]"));
		 
		 for (WebElement e : alfabate) {
			e.click();
			 
		}
		 
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sales")).click();
		
	List<WebElement> checkbox= driver.findElements(By.xpath("//input[@name=\"selected_id\"]"));
		 
		 for (WebElement d : checkbox) {
			d.click();
	*/		
		/*
		 * Thread.sleep(9000); driver.close();
		 * 
		 * 
		 * }
		 */
}}
