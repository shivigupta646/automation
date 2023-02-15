package javascripttm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\newDriver\\chromedriver.exe");
	    WebDriver driver = new  ChromeDriver();
		driver.get("http://www.facebook.com");     /////  1
		
		JavascriptExecutor javas = (JavascriptExecutor)driver;
		
		WebElement wb = driver.findElement(By.xpath("//input[@name=\"email\"]"));
	
	    javas.executeScript("arguments[0].value='shivigupta646@gmail.com'", wb );
	
	    WebElement wb1 = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
	    javas.executeScript("arguments[0].value='shivani123'", wb1 );
	
	    WebElement wb2 =driver.findElement(By.name("login"));
	    
	    javas.executeScript("arguments[0].click();", wb2);
	

}
}