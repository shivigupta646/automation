package framework;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
static WebDriver driver=null;
	public static void main(String[] args) {
		driver=launchBrowserAndHitURL("http://localhost:8888/");
	inputValue(driver, "//input[@name='user_name']","admin");
	inputValue(driver, "//input[@name='user_password']","admin");
		click(driver, "//input[@name='Login']");
	}

	
	
public static void inputValue(WebDriver driver , String locator ,String valueOfTextBox) {
	try {
	WebElement we = driver.findElement(By.xpath(locator));	
	if(we.isDisplayed()==true) {
		System.out.println( "webelement  is displayed");
if(we.isEnabled()==true) {
	System.out.println(" element is enabled");
	we.clear();
	we.sendKeys(valueOfTextBox);
} else {
 	System.out.println("Txt Box is not enabled");
}
	}else {
		System.out.println("WEbelement is not displayed ");
	}
	}catch (Exception e) {
	e.printStackTrace();
	}
}
	
	public static void click(WebDriver driver , String locator) {
		try {
		WebElement we = driver.findElement(By.xpath(locator));	
		if(we.isDisplayed()==true) {
			System.out.println( "webelement  is displayed");
	if(we.isEnabled()==true) {
		System.out.println(" element is enabled");
		we.click();
	} else {
		System.out.println("Txt Box is not enabled");
	}
		}else {
			System.out.println("WEbelement is not displayed ");
		}
		}catch (Exception e) {
	
		}
	}	

public static WebDriver launchBrowserAndHitURL(String URL) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(URL);
	return driver;
	
}
	

	
}
	
	
	
	
	
	
