package com.evs.flipkart.login.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shivi {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='Login']")).click();

		Actions act = new Actions(driver);
		WebElement marketing = driver.findElement(By.xpath("//a[text()='Marketing']"));

		act.moveToElement(marketing).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leads")).click();
		
		List<WebElement> tableText = driver.findElements(By.xpath("//table[@class='lvt small']//tr"));
		
		for (int i = 0; i < tableText.size(); i++) {
			 
			tableText = driver.findElements(By.xpath( "//table[@class='lvt small']//tr"));
			WebElement weobj = tableText.get(i);
			
			String getTextvalueOfTable = weobj.getText();
			System.out.println(getTextvalueOfTable );
			Thread.sleep(1000);
			    
			if(getTextvalueOfTable.contains("LEA12") ) {
		  	driver.findElement(By.id("127")).click();
		  	driver.findElement(By.xpath("(//input[@value='Mass Edit'])[1]")).click();
		  	Thread.sleep(1000);
	        driver.findElement(By.name("firstname")).sendKeys("shivi");
		    driver.findElement(By.id("mobile")).sendKeys("7532723878");
		  	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		  	System.out.println("Edit Testing is passed...");
			}
			else {
				System.out.println("This Lead is no Edit...");
	}
		}
	}}
