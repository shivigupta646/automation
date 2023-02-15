package javascripttm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FileUploading {

	public static void main(String[] args) {

		
 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vikshi\\\\OneDrive\\\\Desktop\\\\shivii\\\\garima\\\\deiver\\\\newDriver\\\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("incognito");
	options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
	 
	options.addArguments("maximized");
	options.setHeadless(false);
	//options.setHeadless(true);
	 
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://localhost:8888/");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin",Keys.ENTER);	
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(" //a[text()='Marketing']")).click();
	driver.findElement(By.xpath("//a[text()='Documents']")).click();
	  
    driver.findElement(By.xpath("//img[@alt='Create Document...']")).click();
		 
    new Select(driver.findElement(By.xpath("//select[@name='filelocationtype']"))).selectByValue("I");
	
	driver.findElement(By.xpath("//input[@id='filename_I__']")).sendKeys("C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\photo");
	
	
	
	}

}
