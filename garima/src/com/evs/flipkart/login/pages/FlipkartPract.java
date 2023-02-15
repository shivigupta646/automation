package com.evs.flipkart.login.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		//driver.get("http://localhost:8888/");     /////  1
		
		
		/*
		 * driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		 * 
		 * driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(
		 * "admin",Keys.ENTER);
		 */
	driver.get("https://www.flipkart.com");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	/*
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]"
	 * )); driver.findElement(By.xpath(
	 * "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/a[2]/div[1]/div[1]"
	 * )) ;
	 */
		// //div[@class='_30jeq3']
			////div[@class='_2WkVRV']
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("watches", Keys.ENTER);
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
