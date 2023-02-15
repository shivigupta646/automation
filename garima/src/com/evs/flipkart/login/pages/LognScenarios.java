package com.evs.flipkart.login.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class LognScenarios {

	public static void main(String[] args) {
//	
//   int x= 100;
//   String str = null;
//   for (int i = 0; i <=20; i++) {
//	str="abcd";
//   
//}
//   str.charAt(6);
//   
  
   
   
		Set<String>listOBJ=new HashSet<String>();
		listOBJ.add("abcd");
		listOBJ.add("xyz");
		listOBJ.add("mnop");
        Set<Integer>stObj= new TreeSet<Integer>();
        stObj.add(40);
        stObj.add(20);
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\newDriver\\chromedriver.exe");
		
		ChromeOptions cp = new ChromeOptions();
		
		
		  WebDriver driver = new ChromeDriver(cp); 
		

		 
		 String handl = driver.getWindowHandle();
		  driver.get("http://localhost:8888/");
		  
			
			  WebElement a = driver.findElement(By.name("user_name")); 
			  //a webelement object
			  
			  a.sendKeys("admin");
			  
			  By byBassword = By.name("user_password");
			  WebElement pwdObj =driver.findElement(byBassword); 
			  pwdObj.sendKeys("admin"); 
			  By byLogin =By.name("Login");
			  WebElement loginButton = driver.findElement(byLogin);
			  loginButton.click();
			  
			  //indexing
			 

	      driver.findElement(By.linkText("Feedback")).click();
			driver.findElement(By.partialLinkText("About Us")).click();
			  driver.findElement(By.linkText("Help")).click();
			
		//driver.findElement(By.name("description")).sendKeys("It is a good application");
		
		Set<String> handleValues = driver.getWindowHandles();
		System.out.println(handleValues);
		
     }
	public void login(WebDriver driver1) {
	  WebElement a = driver1.findElement(By.name("user_name")); 
	  //a WebElement object
	  
	  a.sendKeys("admin");
	  
	  By byBassword = By.name("user_password");
	  WebElement pwdObj =driver1.findElement(byBassword); 
	  pwdObj.sendKeys("admin"); 
	  By byLogin =By.name("Login");
	  WebElement loginButton = driver1.findElement(byLogin);
	  loginButton.click();
	    
	}
	
}







