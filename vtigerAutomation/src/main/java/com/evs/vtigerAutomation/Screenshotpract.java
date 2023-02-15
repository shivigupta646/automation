    package com.evs.vtigerAutomation;

    import java.io.File;
    import java.io.IOException;
    import java.sql.Date;

    import org.openqa.selenium.By;
    import org.openqa.selenium.OutputType;
    import org.openqa.selenium.TakesScreenshot;
    import org.openqa.selenium.WindowType;
    import org.openqa.selenium.chrome.ChromeDriver;

    import com.google.common.io.Files;

    import io.github.bonigarcia.wdm.WebDriverManager;

    public class Screenshotpract {
	public static void main(String[] args) throws IOException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888");

	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	
	TakesScreenshot tstScreenshot = (TakesScreenshot) driver;
	File from=tstScreenshot.getScreenshotAs(OutputType.FILE);
		
	File to = new File("C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\vtigerAutomation\\target\\picture\\b   abc.png");
	Files.copy(from, to);
    
     
      
	}

    }

    


















