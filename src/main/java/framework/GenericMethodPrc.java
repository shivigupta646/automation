        package framework;

        import java.io.File;
        import java.io.IOException;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;

        import org.openqa.selenium.By;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import com.aventstack.extentreports.ExtentReports;
        import com.aventstack.extentreports.ExtentTest;
        import com.aventstack.extentreports.Status;
        import com.aventstack.extentreports.model.Test;
        import com.aventstack.extentreports.reporter.ExtentSparkReporter;
        import com.github.dockerjava.api.model.Driver;
        import com.google.common.io.Files;

        import io.github.bonigarcia.wdm.WebDriverManager;

        public class GenericMethodPrc {

     	private static WebDriver driver = null;
	    public static void main(String[] args) throws IOException { 
	 
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
		String timestamp = df.format(new Date());
		
		
		File fobj = new File("");
		ExtentSparkReporter spark = new ExtentSparkReporter("Report"  + timestamp + ".html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Os Name",System.getProperty("Os Name"));
		report.setSystemInfo ("User Name",System.getProperty("User Name"));
		report.setSystemInfo("Server Name",System.getProperty("QA Server"));
		
		ExtentTest test = report.createTest("TC001");
		
		GenericMethodPrc  gnm = new GenericMethodPrc();

	    driver=	gnm.openBroswer("chrome", test);
		gnm.navigateUrl("http://localhost:8888", test);
		
		
		gnm.inputTestValue("admin","//input[@name='user_name']", "admin", test);
		gnm.inputTestValue("admin","//input[@name='user_password']","user password", test); 
		gnm.click("inpot[@name='login']", "Login", test);
		report.flush();
		
	
	    }

	    private String elements_name;
	
	    public void inputTestValue(String string, String locator, String string3, ExtentTest test) throws IOException  {
		  try {
	    	   
	    	   WebElement we = driver.findElement(By.name(locator));
	    	   if(we.isDisplayed()==true) {
	    		   test.log(Status.INFO, elements_name+"box is visible ");
	    		   if(we.isEnabled()==true) {
	    			   test.log(Status.INFO, elements_name + " box is Enabled ");
	    			   we.clear();
	    			   we.sendKeys(string);
	    			   test.log(Status.INFO, "enterd " + elements_name + "in box Successfully ");
	    		   }
	    		   else {
	    			   test.log(Status.INFO, " box is Disabled ");
	    		   }
	    	   }else {
	    		   test.log(Status.INFO, " box is not visible ");
	    	   }
	       }catch(Exception e) {
	    	   TakesScreenshot tss = (TakesScreenshot)driver;
	    	   File from= tss.getScreenshotAs(OutputType.FILE);
	    	   File to = new File("target//ScreenShot.png");
	    	   Files.copy(from, to);
	    	     
	    		   }}
		
	

	      public WebDriver openBroswer(String browser, ExtentTest test) {
		  if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			test.log(Status.INFO,"Browser launch successfully");
		  }else if(browser.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		 driver = new ChromeDriver();
		 test.log(Status.INFO,"Browser launch successfully");
		
	     }else if(browser.equalsIgnoreCase("edge")) {
	     WebDriverManager.edgedriver().setup();
	     driver = new ChromeDriver();
	     test.log(Status.INFO,"Browser launch successfully");
	
}
		return driver;
		
		
	}

	    public void navigateUrl(String url ,ExtentTest test) {
		WebDriver driver = null;
		driver.get(url);
		test.log(Status.INFO,"URL Navigate successfully");
		
	}
          public void click(String Locator, String Elements_name, ExtentTest test) throws IOException  {
    	 WebElement we = ((WebElement) driver).findElement(By.name("locator"));
    	 try {
  	     if(we.isDisplayed()==true) {
  		   test.log(Status.INFO, Elements_name+"button is visible ");
  		   if(we.isEnabled()==true) {
  			   test.log(Status.INFO, " "+ Elements_name+ " button is Enabled ");
  			   we.click();
  			   test.log(Status.INFO,"click"+ "is Successfully ");
  		   }
  		   else {
  			   test.log(Status.INFO, " button is Disabled ");
  		   }
  	   }else {
  		   test.log(Status.INFO, " button is not visible ");
  	   }
        }catch(Exception e) {
  	     TakesScreenshot tss = (TakesScreenshot)driver;
  	     File from= tss.getScreenshotAs(OutputType.FILE);
  	     File to = new File("target//ScreenShot.png");
  	     Files.copy(from, to);
  	     
        }
         } 
     
       
    
         }
  	
    	   


 