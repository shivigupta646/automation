package IFramepr;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
        driver.get("https://www.flipkart.com");
       
     Set <Cookie> Cookies =  driver.manage().getCookies();//capture all the cookies from the browser.
    
   System.out.println("size of cookies:" +Cookies.size());//print size of cookies
  
   for(Cookie cookie:Cookies) {//read and print all the cookies
   	 
 	System.out.println(cookie.getName()+" : "+cookie.getValue());
 	
   	 }
     
  System.out.println(driver.manage().getCookieNamed("_pxvid : ff2dae63-4ead-11ed-9b1f-746174476b65"));
  // prints specific cookie according to the name
    
    Cookie cook = new Cookie("my cookies", "1235478437");
    driver.manage().addCookie(cook);
    
    System.out.println("size of cookies:" +Cookies.size());
	  for(Cookie cookie:Cookies) {//read and print all the cookies
	    	 
	    	System.out.println(cookie.getName()+" : "+cookie.getValue());
	    	
	    	 }
    
	 
	  
	                                                                                                    
	}
	
	}   
    
//string buffer object is mutable
//it  have thread safe.
//
//1. capture all the cookies
//2. get the size of cookies
//3. printed cookies names and their values
//4. print cookie based on name
//5. add cookie to the browser

