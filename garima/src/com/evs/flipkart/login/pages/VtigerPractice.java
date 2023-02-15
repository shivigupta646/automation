package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerPractice {

	
	
		
		
	/*
	 * public static String ab(int b) {
	 * 
	 * VtigerPractice vp =new VtigerPractice();
	 * 
	 * return "shivi"; }
	 */
	public static void main(String[] args)
			throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		 ChromeDriver driver = new  ChromeDriver();
		driver.get("http://localhost:8888/");     /////  1
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	
		By myMarketingLink = By.linkText("Marketing");
		WebElement weMarketing = driver.findElement(myMarketingLink);
		
		weMarketing.click();
		
		 
	////	//tagName[@attributeName='attributeValue']
	////	//img[@title='Create Campaign...']-------xpath
		driver.findElement(By.xpath("//input[@id='125']")).click();
		driver.findElement(By.xpath("//input[@id='124']")).click();
		driver.findElement(By.xpath("//input[@id='123']")).click();
		driver.findElement(By.xpath("//input[@id='122']")).click();
		driver.findElement(By.xpath("//input[@id='129']")).click();
		driver.findElement(By.xpath("//input[@id='130']")).click();
		
		
		driver.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
		
		////     //tagName[text()='innertextvalue']
		///      //input[@class=\"detailedViewTextBox\"]
		
		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[1]")).sendKeys("garima");
		
		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[2]")).sendKeys("5000000");
		
		
		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[3]")).sendKeys("7664376");
			
		
		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[4]")).sendKeys("8303044479");
		
		
		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[5]")).sendKeys("7658763");
				

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[6]")).sendKeys("9876567");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[7]")).sendKeys("700000");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[8]")).sendKeys("76123");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[9]")).sendKeys("7000");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[10]")).sendKeys("76500");
	

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[11]")).sendKeys("658763");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[12]")).sendKeys("87463");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[13]")).sendKeys("8763");

		driver.findElement(By.xpath("(//input[@class=\"detailedViewTextBox\"])[14]")).sendKeys("2345");
		
	
		//a     anchor tag ,   hyperlink,    link;;;
		
		///pointing had  -    attribute-   href
		///starting tag--- have attribute and value`
		
		///text between starting and ending point is called inner tag
		
		///ending tag ----
		/*
		 * ChromeDriver driver1 = new ChromeDriver();
		 * 
		 * driver.get("http://flipkart.com/"); ////// 2
		 */
		
		
		///1) you have to get object of By class
		/// 2) after that use object of chromedriver class and call find element..
		// 3) in findelement method pass object of By class as arguments
		///4 ) after that you will get object of webelement as a return
		/// 5) after that you will call sendkeys method of webelement class through object of webElement.
		
	}

}
       ///