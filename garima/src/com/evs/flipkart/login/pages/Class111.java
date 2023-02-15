package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class111 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
	
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		driver.findElement(By.linkText("Sales")).click();
		//driver.findElement(By.linkText(" ")).click();
		
	WebElement	leads=driver.findElement(By.xpath("//td[contains(@class,'lvtCol')]//parent::tr//parent::tbody"));
		String str=leads.getText();
		System.out.println(str);
		
		
		
		
		
	}

}
