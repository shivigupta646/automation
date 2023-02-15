package com.evs.vtigerAutomation;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) {

		/*
		 * Set<String> set=new LinkedHashSet(); set.add("Shivi"); set.add("shivanvi");
		 * set.add("vik");
		 * 
		 * for(String string : set) {
		 * 
		 * } System.out.println(set);
		 */ WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");

	 new ChromeDriver().findElement(By.xpath("")).sendKeys("");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://flipkart.com");

		int a = driver.getWindowHandles().size();

		System.out.println(a);

		String vtigerhandlvalue = driver.getWindowHandle();

		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		WebDriver driver1 = driver.switchTo().newWindow(WindowType.TAB);

		driver.get("http://flipkart.com");

		String flipkarthandlValue = driver.getWindowHandle();
		// driver.switchTo().window(flipkarthandlValue);

		Set<String> ss = driver.getWindowHandles();
		for (String handlValue : ss) {

			driver.switchTo().window(handlValue);

			String getTitle = driver.getCurrentUrl();

			if (!getTitle.equalsIgnoreCase("http://flipkart.com/")) {
				driver.close();
  
			}
		}

	}

}





