package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuphandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vikshi\\\\OneDrive\\\\Desktop\\\\shivii\\\\garima\\\\deiver\\\\newDriver\\\\chromedriver.exe");
		 WebDriver driver = new  ChromeDriver();
		driver.navigate().to("http://localhost:8888/");     /////  1
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	
    	driver.findElement(By.linkText("Marketing")).click(); 
    	driver.findElement(By.xpath(" //input[@id='123']")).click();
    	driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
        driver.switchTo().alert().dismiss();
         
    	            
    
//    	/*driver.switchTo().alert().sendKeys("");
//    	driver.switchTo().alert().getText();
//    	driver.navigate().back();
//    	driver*/.navigate().forward();
//	
        
        
     
    		
   	//how do u handle alert 
    	   //for handling this satuations selenium webdriver provide this methods driver.switch to .
   //target locator and target locator have a method that is alert and also retrn alerts
   //alerts have a method that is except with tha help of this method accept our popup 
   //if we want to denoy then we can call dismiss method
	}
 
}
