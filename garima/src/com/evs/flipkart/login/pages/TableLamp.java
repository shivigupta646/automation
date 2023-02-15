package com.evs.flipkart.login.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableLamp {////div[@class='_30jeq3']

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		 driver.get("http://localhost:8888/"); 
		 
			
			driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
			
			
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	
		List<WebElement> subtab=driver.findElements(By.xpath("td[contains(@class,'Selected')]//a"));
		
		for (int i = 0; i < subtab.size(); i++) {
			subtab=driver.findElements(By.xpath("//td[contains(@class,'Selected)]//a"));
		//	System.out.println(i+1+"======"+tabLinkText);
			WebElement tabLink=subtab.get(i);
			String tabLinkText=tabLink.getText();
		tabLink.click();
		Thread.sleep(2000);
		List<WebElement> insubTab=driver.findElements(By.xpath("//table[@class='level2bg']//tr//a'"));
		for (int j = 0; j < insubTab.size(); j++) {
			
		insubTab=driver.findElements(By.xpath("//table[@class='level2bg']//tr//td//a"))	;
		
		WebElement subTabLink=insubTab.get(i);
		
		String subTabLinkText=subTabLink.getText();
		//System.out.println(j+1+"="+subTabLinkText);
		subTabLink.click();
	
		Thread.sleep(2000);
		String ExpectedText=tabLinkText+">"+subTabLinkText;
		
		String actualText=driver.findElement(By.xpath("''td[@class='moduleName']")).getText();
		 if(actualText.equalsIgnoreCase(ExpectedText)) {
			 System.out.println("Passed.Where actual-"+actualText+"&&expected-"+ExpectedText);
		 } 
			 else {
				 System.out.println("Failed.Where actual-"+actualText+"&&expected-"+ExpectedText);
				     
				 
			 }
			 
			 
		 }
			
		}
		
		}
	}


