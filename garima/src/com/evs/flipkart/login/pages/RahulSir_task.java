package com.evs.flipkart.login.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulSir_task {

	public static void main(String[] args) {
	
		/*
		 * List<WebElement>productName=driver.findElements(By.xpath(
		 * "//div[@class='_2WkVRV']\")); for (int i = 0; i < productName.size(); i++) {
		 * WebElement productNameFound=productName.get(i);
		 * System.out.println(productNameFound.getText()); }
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		 driver.get("https://www.flipkart.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("watches");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		List<WebElement> ListofRupees= driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		System.out.println( ListofRupees.size());
		List<WebElement> ListofName=driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
		System.out.println(ListofName.size());
		for (int i = 0; i <ListofName.size() ; i++) {
			
			WebElement name=ListofName.get(i);
			WebElement price=ListofRupees.get(i);
			
			System.out.print(name.getText()+"      ");
			System.out.print(price.getText());
			System.out.println();
			
		
		  
		
		
	}

	}}
