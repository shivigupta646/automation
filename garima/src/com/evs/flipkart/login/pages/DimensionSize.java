package com.evs.flipkart.login.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionSize {

	

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		// CHROME DRIVER
	 ChromeDriver var = new ChromeDriver();
     var.get("http://localhost:8888/"); 
     // var.get("http://flifkart.com");
		WebElement we =var.findElement(By.xpath("//input[@name='user_name']"));
		
		Dimension d=we.getSize();
		int heigth = d.getHeight();
		int width =d.getWidth();
		
		System.out.println("Height is="+heigth+"   Width is"+width);
		Point po= we.getLocation();
		int x =po.getX();
		int Y = po.getY();
		System.out.println("Location X is="+x+"   Location Y is="+Y);
		
		
		

	}

}
