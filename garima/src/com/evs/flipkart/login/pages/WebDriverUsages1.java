package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverUsages1 {

	public static void main(String[] args) throws InterruptedException {
		
		String fn="shivi";
		String sn="Gupta";
		String n=fn+"  "+sn;
		for (int i = 0; i <=100; i++) {
			String fun=n+i;
			
			System.out.println(fun);
		}
	
		
	///	int num=16/0;   ///it is a arithmetic exception 
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
			// CHROME DRIVER
		 ChromeDriver var = new ChromeDriver();
	 var.get("http://localhost:8888/");
	 
	
	WebElement weUserName = var.findElement (By.name("user_name")) ;
	weUserName.clear();
	weUserName.sendKeys("admin");
	
	
	WebElement wePassword = var.findElement(By.name("user_password"));
	wePassword.clear();
    wePassword.sendKeys("admin");
    
   String passwordValue = wePassword.getAttribute("value");
   System.out.println(passwordValue );
	 
	  String loginButtonText = var.findElement(By.name("Login")).getText();
	  System.out.println("Login Button test is "+loginButtonText);
	 
    var.findElement(By.name("Login")).click();
    
    
    
	
	  
	/*
	 * String
	 * actualErrorMsgText=var.findElement(By.xpath("//font[@color='Brown']")).
	 * getText(); String
	 * expectedErrorMsgText="you must specify a valid username  and password";
	 * 
	 * if(actualErrorMsgText.equals(expectedErrorMsgText)) {
	 * System.out.println("testing is passed. Error msg is correct"); } else {
	 * System.out.println("testing is failed error msg is incorrect"); }
	 */
    
    
	var.findElement(By.linkText("Marketing")).click();
	 
	 String actualText =  var.findElement(By.xpath("//span[@class='moduleName']")).getText();
	String expectedText="Search";
	if(actualText.equalsIgnoreCase(expectedText)) {
		System.out.println("Search Testing is passed");
	}
	
	else {
		System.out.println("Search testing is failed");
	}
	
	
	    
	String expectedSearchNowText ="Search Now";
	String actualSearchNowText=var.findElement(By.xpath("//input[@class='crmbutton small create']")).getAttribute("value");
	if(actualSearchNowText.equalsIgnoreCase(expectedSearchNowText)==true) {
	System.out.println("search now button testing is passed");
	}
	else {
		System.out.println("search now button testing is failed");
	}
	
	
	
	//int height = var.findElement(By.xpath("//input[@class='crmbutton small create']")).getSize().getHeight();
//	int widht  = var.findElement(By.xpath("//input[@class='crmbutton small create']")).getSize().getWidth();
	
	Dimension dimSearchNowButton =  var.findElement(By.xpath("//input[@class='crmbutton small create']")).getSize();
	int height = dimSearchNowButton.getHeight();   //////height   vertically   /// Horizontally
	int width = dimSearchNowButton.getWidth();
	System.out.println(height+","+width);
	  
	//verification testing validation 
	
	
	Point locationObject = var.findElement(By.xpath("//input[@class='crmbutton small create']")).getLocation();
	int xvalue= locationObject.getX();
	int yvalue= locationObject.getY();
	System.out.println("x-"+xvalue+",y-"+yvalue);
	
	
	
	boolean CreateButtonStatus  = var.findElement(By.xpath("//input[@class='crmbutton small create']")).isDisplayed();
	
	if(CreateButtonStatus==true) {
	System.out.println("create button testing is passed. create button is visible");
	}
	else {
		System.out.println("create button testing is failed. create button is invisible");
	}
	
	
	// if xpath is wrong then it fail in driver. find element
	boolean actualStatus=var.findElement(By.xpath("//input[@class='crmbutton small create']")).isEnabled();
	boolean expectedStatus=true;
	if(actualStatus==true) {
		System.out.println("search now button testing is passed because button is enabled");
	}
	else {
		System.out.println("search now button testing is failed and button is disabled");
	}   
	
	
	
	
	 /// verify campaign's 1st checkBox is unchecked or unselected
	boolean checkboxSelectionStatus = var.findElement(By.xpath("//input[@name='selectall']")).isSelected();
	if(checkboxSelectionStatus==false) {
	System.out.println("campaign 1st checkbox test is passed. it is unchecked");
	}
	else {
	
		System.out.println("campaign 1st checked test is failed. it is checked");
	
	}
                                                                                                           	
	
                                                                                       	
	// gettext retruns the text from single line text feild
	//GETATTRIBUTE-- this method is declared in the webElement interface and iit return webelement value as a string
	//method of web element with the help isnable we can verify it is work or not
	//with the help of selected method checkbox it checked or not is selwctd
	//
	//we can not make object on interface
	//it is a method of chromedriver and we can find only one element known as findelement
	//which element that present in web page is called webelement it is a interface
	//isdisabled return boolean 
	//locator are basically the html attribute of web element.8 types 
	//getSize tell about any element width and height height always vertically and width always horizontally and give object of dimension class and return int  
	
	//chromeDriver make object and call findElement  and then it gave webElement
  	//verify campaign's first checkBox is unchecked
	//HIDDEN ELEMENTS=-----bhut si chize HTML pr hingi but samne n dikhayi dengi 
	
	//   cntrl f // * finding for all thing in open page
	//isDisplayed method depend on webElement it work is finding element.its given girenttee that it having UI or not it give true or false
	//leads-----kahi se kuch hone ki ummid ya gunjaish
	///C RM=---customer relationship management ----inka kam hota h customer p dyan dena .
	///  = equal for assignment
	///  == equals for comparison
	 ///when you call any method
	 // 1) void  -----no return
	 //  2) return
	//dataType have value
	//class have a object
	////UI-- user interface 
	 ///source file
	 //textBoxe, inputBoxe, editBoxe
	// Thread.sleep(60000); 
	// var.close();    //--close browser
	
	 ///source file 
	//   clear ,   Sendkeys,   click,   getText,    getAttribute , isEnabled,  isSelected,   isDisplayed, getSize  , GetLocation  
	//enabled  ,clickAble-  koi chiz use krne layak ho
	//disabled----koi bhi chiz change n ho 
	//stable
	//unique
	//getText takes innerText 
	//getAttribute comes with  attribute value 
	//innerText always saw in UI----user interface
	//img always use for image
	///ROI----return of investment
	//
	}

}
