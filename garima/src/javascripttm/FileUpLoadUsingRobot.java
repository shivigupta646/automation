package javascripttm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FileUpLoadUsingRobot {

	public static void main(String[] args) throws AWTException {
    
	Robot robott= new Robot();
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\newDriver\\chromedriver.exe");
    ChromeDriver driver = new  ChromeDriver();
	Actions act = new Actions(driver);
    driver.get("http://localhost:8888/");
		 
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin",Keys.ENTER);	
	
	act.moveToElement(driver.findElement(By.xpath("//a[text()='Marketing']"))).build().perform();
		
	  driver.findElement(By.xpath("//div[@id='Marketing_sub']//a[text()='Documents']")).click();
	  
	driver.findElement(By.xpath("//img[@alt='Create Document...']")).click();
	 
	WebElement we= driver.findElement(By.xpath("//select[@name='filelocationtype']"));
		Select sel= new Select(we);
		sel.selectByVisibleText("Internal");
		
		driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\photo\\nicePhoto");
	
	WebElement wefile1 = driver.findElement(By.xpath("//input[@name='filename']"));
    act.moveToElement(wefile1).click().build().perform();
	  
    try {
    	Thread.sleep(2000);
    	 }
    catch(InterruptedException e) {
    	e.printStackTrace();
    	 }
    
    StringSelection selecttion = new StringSelection("");
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selecttion, null);
    
    robott.keyPress(KeyEvent.VK_CONTROL);
    robott.keyPress(KeyEvent.VK_V);
    
    robott.keyRelease(KeyEvent.VK_CONTROL);
    robott.keyRelease(KeyEvent.VK_V);
    
    robott.delay(2000);
    
    robott.keyPress(KeyEvent.VK_ENTER);
    robott.keyRelease(KeyEvent.VK_ENTER);
    
    
    
}}
