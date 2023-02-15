    package com.evs.vtigerAutomation;

    import java.io.File;

    import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    import com.aventstack.extentreports.ExtentReports;
    import com.aventstack.extentreports.ExtentTest;
    import com.aventstack.extentreports.Status;
    import com.aventstack.extentreports.reporter.ExtentSparkReporter;
    import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

    import io.github.bonigarcia.wdm.WebDriverManager;

    public class util {

	public static void main(String[] args) {
		
	 File fileObj = new File("C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\vtigerAutomation\\ExtentReport\\"+"Vtiger.hmtl");
	 ExtentSparkReporter htmlextentreport =	new ExtentSparkReporter(fileObj);
	 
	 ExtentReports extentreport = new ExtentReports();
	 extentreport.attachReporter(htmlextentreport);  
	 
	 extentreport.setSystemInfo("OSName", System.getProperty("os.name"));
	 extentreport.setSystemInfo("UserName", System.getProperty("user.name"));
	 
	 extentreport.setSystemInfo("Server Name","QA Server");
	 
	 ExtentTest extenttest = extentreport.createTest("Tx001");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 extenttest.log(Status.INFO, "Chrome Browser launched Successfully");
	 
	 driver.get("http://localhost:8888");
	 extenttest.log(Status.INFO, "Url Navigated https://localhost:8888");
	 
	 driver.findElement(By.name("user_name")).sendKeys("admin");
	 extenttest.log(Status.INFO, "Username(admin)is entered successfully in username box");
	 
	 driver.findElement(By.name("user_password")).sendKeys("admin");
	 extenttest.log(Status.INFO, "Password(admin)is entered successfully in password box");
	 
	 driver.findElement(By.name("Login")).click();
	 extenttest.log(Status.INFO, "Clicked Performed successfully on Login Button");
	 
     boolean checkVisibilityOfMarketing = driver.findElement(By.xpath("//a[text()='Marketing']")).isDisplayed();
      
     if(checkVisibilityOfMarketing==true) {
    	 extenttest.log(Status.PASS, "Marketing button is visible TC001 is Passed");
     }
     else {
    	 extenttest.log(Status.FAIL, "Marketing button is invisible TC001 is Failed");
    	  }
     ExtentTest extenttest1 =extentreport.createTest("tc002");
     extenttest.log(Status.FAIL, "zxcvbnm,./");
    
     extentreport.flush();
          
	}  
           
    }




