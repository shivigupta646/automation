package com.evs.flipkart.login.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MausePFAx {

	private static Object thread;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\vikshi\\\\OneDrive\\\\Desktop\\\\shivii\\\\garima\\\\deiver\\\\newDriver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

		Actions act=new Actions(driver);
		
		driver.manage().window().maximize();
 
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");

		WebElement  login = driver.findElement(By.xpath("//input[@name='Login']"));
  act.moveToElement(login).click().build().perform();
		
		WebElement marketing = driver.findElement(By.xpath("//a[text()='Marketing']"));
		act.moveToElement(marketing).build().perform();

		 driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Leads']")).click();
		//act.moveToElement(marketingLead).click().build().perform();

		List<WebElement> garima = driver.findElements(By.xpath("//input[@name='selected_id']"));
		for (WebElement web : garima) {
			act.moveToElement(web).click().build().perform();
		}

		WebElement seles = driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[text()='Sales']"));
		act.moveToElement(seles).click().build().perform();

		List<WebElement> shivi = driver.findElements(By.xpath("//input[@name='selected_id']"));
		for (WebElement web1 : shivi) {
			act.moveToElement(web1).click().build().perform();
		}

		act.moveToElement(driver.findElement(By.xpath("//a[text()='Marketing']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Contacts']")).click();
		
		
	}
}
