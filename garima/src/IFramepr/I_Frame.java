package IFramepr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class I_Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
   driver.get("https://automatenow.io/sandbox-automation-testing-practicee-website/iframes/");
   driver.manage().window().maximize();
   System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'IFrames')]")).getText());
   System.out.println(driver.findElement(By.xpath("//p[contains(text(),'I am an iframe.')]")).getText());
   
   driver.switchTo().frame("frame1");
    
  System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers.')]")).getText());
System.out.println(driver.findElement(By.xpath("//p[contains(text(),'What you do with that power is entirely up to you.')]")).getText());
System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Support the Selenium Project')]")).getText()); 
 
    driver.switchTo().defaultContent();//back on main page
   // System.out.println(driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).getText());
   
	}

}
