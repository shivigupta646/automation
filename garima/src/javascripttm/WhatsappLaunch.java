package javascripttm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsappLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\newDriver\\chromedriver.exe");
	    WebDriver driver = new  ChromeDriver();
		driver.get("http://www.whatsapp.com");     /////  1
		
		JavascriptExecutor javas = (JavascriptExecutor)driver;
		
		WebElement ff=driver.findElement(By.name(""));
		
	}

}
