package framework;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First2 {
	
	private WebDriver driver;  	
	private ExtentTest test;
   
	// generic method, wrapper method, application independent, util methods.
	

	 
///WE CREATE GENERIC METHOD OF INPUT VALUE ()CALL THE METHOD OF GETWEBELEMENT()CALL THE METHOD OF SENDKEYS
	
	public  void inputValue( String locatortype,String locatorValue, String inputValue) {
		
		WebElement we =getwebElement(locatortype , locatorValue);
		if (we.isDisplayed() == true) {
			System.out.println(" webelement  is displayed ");  
			test.log(Status.INFO, " webelement  is displayed ");
			if (we.isEnabled() == true) {
				we.clear();
				we.sendKeys(inputValue);
				System.out.println(" element is enabled ");
				test.log(Status.INFO, " element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WEbelement is not displayed ");
			test.log(Status.INFO, " WEbelement is not displayed ");
		}
			
	
			
		
	}
    //WE CREATE GENERIC METHOD OF GETWEELEMNT FIND THE ELEMENTS BY LOCATOR RETURN WEBELEMENT.......
	public  WebElement getwebElement( String locatortype, String locatorValue) {
		WebElement we =null;
		if(locatortype.equalsIgnoreCase(" xpath ")) {
			we=driver.findElement(By.xpath(locatorValue)); 
		}else if(locatortype.equalsIgnoreCase(" id ")) {
			we=driver.findElement(By.id(locatorValue));
		}else if(locatortype.equalsIgnoreCase(" className ")) {
		we=driver.findElement(By.className(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" name ")) {
	    we=driver.findElement(By.name(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" tagName ")) {
		    we=driver.findElement(By.tagName(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" cssSelector ")) {
		    we=driver.findElement(By.cssSelector(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" linkText ")) {
		    we=driver.findElement(By.linkText(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" partialLinkTest ")) {
		    we=driver.findElement(By.partialLinkText(locatorValue));
	    }else {
	    	test.log(Status.FAIL,locatortype+ " locator type is wrong. please check ");		    
	    	}
		return we;
	}
	 
	
	/*we create generic method og getList<WebElement>find the element by locator
	 * return List <WebElement>
	 * */
	public  List<WebElement> getList( String locatortype, String locatorValue) {
		List<WebElement> listWe = null;
		
		if(locatortype.equalsIgnoreCase(" xpath ")) {
			listWe = driver.findElements(By.xpath(locatorValue)); 
		}else if(locatortype.equalsIgnoreCase(" id ")) {
			listWe=driver.findElements(By.id(locatorValue));
		}else if(locatortype.equalsIgnoreCase(" className ")) {
			listWe=driver.findElements(By.className(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" name ")) {
	    	listWe=driver.findElements(By.name(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" tagName ")) {
	    	listWe=driver.findElements(By.tagName(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" cssSelector ")) {
	    	listWe=driver.findElements(By.cssSelector(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" linkText ")) {
	    	listWe=driver.findElements(By.linkText(locatorValue));
	    }else if(locatortype.equalsIgnoreCase(" partialLinkTest ")) {
	    	listWe=driver.findElements(By.partialLinkText(locatorValue));
	    }else {
	    	test.log(Status.FAIL,locatortype+ " locator type is wrong. please check ");		    
	    	}
		return listWe;
	}
	
	/*we create the generic method of click call the method of getWebElement() call the method click of 
	 *WebElement
	 * */
		public  void click(String locatortype, String locatorValue) {
			
			WebElement we =getwebElement(locatortype , locatorValue);
			if (we.isDisplayed() == true) {
				System.out.println(" WebElement  is Displayed ");  
				test.log(Status.INFO, " webelement  is Displayed ");
				if (we.isEnabled() == true) {
					
					we.click();
					System.out.println(" element is enabled ");
					test.log(Status.INFO, " element is enabled ");
				} else { 
					System.out.println(" Txt Box is not enabled ");
					test.log(Status.INFO, " Txt Box is not enabled ");
				}
			} else {
				System.out.println(" WebElement is not displayed ");
				test.log(Status.INFO, " WebElement is not displayed ");
			}
				
		}

		
public  void clickMultipleElements(String locatortype, String locatorValue) {
			
			List<WebElement> listWe =getList(locatortype , locatorValue);
			for(int i = 0; i < listWe.size(); i++) {
				WebElement we1 = listWe.get(i);
				we1.getText();
			
				if (we1.isDisplayed() == true) {
				System.out.println(" Element is displayed to click successfull ");  
				test.log(Status.INFO, " Element is displayed to click successfully ");
				if (we1.isEnabled() == true) {
					
					we1.click();
					System.out.println(" Element is enable to click successfully ");
					test.log(Status.INFO, " Element is enable to click successfully ");
				} else { 
					System.out.println(" Element is not enable to click ");
					test.log(Status.INFO, " element is not enable to click ");
				}
			} else {
				System.out.println(" element is not clickable ");
				test.log(Status.INFO, " element is not clickable ");
			}
}
			}
		
///GET INNER TEXT METHOD RETURN STRING.........
	public  String getInnerText( String locatortype,String locatorValue ) {
		String innertext=null;
		WebElement we =getwebElement(locatortype , locatorValue);
		if (we.isDisplayed() == true) {
			System.out.println(" webelement  is displayed ");  
			test.log(Status.INFO, " webelement  is displayed ");
			if (we.isEnabled() == true) {
				innertext = we.getText();
				
				System.out.println(" element is enabled ");
				test.log(Status.INFO, " element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled  ");
				test.log(Status.INFO, " Txt Box is not enabled "); 
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
		
		return innertext;
		}
	
	
	///GET  INNER TEXT MULTIPLE ELEMENTS METHOD RETURN STRING.........
		public  String getInnerTextMultipleElements( String locatortype,String locatorValue ) {
			String innertext=null;
			
			List<WebElement> listWe =getList(locatortype , locatorValue);
			for(int i = 0; i < listWe.size(); i++) {
				WebElement we1 = listWe.get(i);
				
			if (we1.isDisplayed() == true) {
				System.out.println(" webelement  is displayed ");  
				test.log(Status.INFO, " webelement  is displayed ");
				if (we1.isEnabled() == true) {
					innertext = we1.getText();
					
					System.out.println(" element is enabled ");
					test.log(Status.INFO, " element is enabled ");
				} else { 
					System.out.println(" Txt Box is not enabled ");
					test.log(Status.INFO, " Txt Box is not enabled ");
				}
			} else {
				System.out.println(" WebElement is not displayed ");
				test.log(Status.INFO, " WebElement is not displayed ");
			}
			}
			return innertext;
		
		}
	
		//We creating a meethod for open browser.......and return WEBDRIVER
	public  WebDriver openBroswer(String browser) {
		if(browser.equalsIgnoreCase(" chrome ")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			test.log(Status.INFO," Browser launch successfully ");
		}else if(browser.equalsIgnoreCase(" firefox ")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		test.log(Status.INFO," Browser launch successfully ");
		
	}else if(browser.equalsIgnoreCase(" edge ")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	test.log(Status.INFO," Browser launch successfully ");
	
}else {
	test.log(Status.INFO," Browser not launched Browser name is not valid .please ");
}
		return driver;
		
		
	}
	////=-------------METHODS OF ACTIONS CLASS....-------------------///
	
////METHOD OF DRAG AND DROP.  OF ACTIONS CLASSS..........
	public  void actionDragAndDrop ( String locatortype1, String locatorValue1,String locatortype2, String locatorValue2) {
		WebElement we1 =getwebElement(locatortype1 , locatorValue1);
		WebElement we2 =getwebElement(locatortype2 , locatorValue2);
		if (we1.isDisplayed() == true) {
			System.out.println(" WebElement  is displayed ");  
			test.log(Status.INFO, " WebElement  is displayed ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.dragAndDrop(we1, we2).build().perform();
				System.out.println(" Element is enabled ");
				test.log(Status.INFO, " Element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
			
	}
	
	///ANOTHER WAY TO FIND DRAG AND DROP METHOD.  OF ACTIONS CLASSS..................
	public  void actionDragAndDrop2 ( String locatortype1, String locatorValue1,String locatortype2, String locatorValue2) {
		WebElement we1 =getwebElement(locatortype1 , locatorValue1);
		WebElement we2 =getwebElement(locatortype2 , locatorValue2);
		if (we1.isDisplayed() == true) {
			System.out.println(" WebElement  is displayed ");  
			test.log(Status.INFO, " WebElement  is displayed ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.clickAndHold(we1).moveToElement(we2).release().build().perform();
				
				System.out.println(" Element is enabled ");
				test.log(Status.INFO, " Element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
			
	}
	
	///METHOD OF ACTIONS CLASS THAT IS DRAG AND DROP WITHOUT USING WEBELEMENT .........
	 public Actions actionDragAndDrop(WebElement drag, WebElement drop ) {
			
	        Actions act = null;
			
			act= new Actions(driver);
			act.dragAndDrop(drag, drop).build().perform();
			
			test.log(Status.INFO, " Drag and Drop Successfully ");
			
			
			return act;
		}
	
	
	
	////METHOD OF MAUSEOVER. OF ACTINS CLASSS................
	public  void actionMouseHover( String locatortype, String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" WebElement  is displayed ");  
			test.log(Status.INFO, " WebElement  is displayed ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.moveToElement(we1).build().perform();
				System.out.println(" element is enabled ");
				test.log(Status.INFO, " element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
		}
	
	///METHOD OF ACTIONS CLASS THAT IS MOUSEoVER WITHOUT USING WEBELEMENT .........
		 public Actions actionMouseOver(  ) {
				
		        Actions act = null;
				
				act= new Actions(driver);
				act.moveToElement(null).build().perform();
				
				test.log(Status.INFO, " Move to Element Successfully ");
				
				
				return act;
			}
		
	
	
	
	///METHOD OF DOUBLE CLICK OF ACTIONS CLASS................
	public  void actionDoubleClick( String locatortype, String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" WebElement  is displayed ");  
			test.log(Status.INFO, " WebElement  is displayed ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.doubleClick(we1).build().perform();
				System.out.println(" Element is enabled ");
				test.log(Status.INFO, " Element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
	}
	
	
	///METHOD OF CLICK AND HOLD OF ACCTION CLASSS..............
	public  void actionClickAndHold( String locatortype, String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" WebElement  is displayed ");  
			test.log(Status.INFO, " WebElement  is displayed ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.clickAndHold(we1).build().perform();
				System.out.println(" Element is enabled ");
				test.log(Status.INFO, " Element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
	}
	
	
	////CLICK METHOD OF ACTION CLASS WITH WEBELEMENT...............
	public  void actionClick( String locatortype, String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" webelement  is displayed ");  
			test.log(Status.INFO, " webelement  is displayed ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.click(we1).build().perform();
				System.out.println(" element is enabled ");
				test.log(Status.INFO, " element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
	}
	
	
	////ACTIONS CLASS OF CLICK METHED WITHOUT WEBELMENT .............
	 public Actions actionClick() {
			
	        Actions act = null;
			
			act= new Actions(driver);
			act.click().build().perform();
			
			test.log(Status.INFO, " Click Successfully ");
			
			
			return act;
		}
	
	
	
	
	////ACTIONS SENDKEYS WITH WEBELEMENT METHOD OF ACTIONS CLASS...............
	public  void actionSendkeys( String locatortype, String locatorValue, String inputValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" Element is displayed and click suceessfully ");  
			test.log(Status.INFO, " Element is displayed and click suceessfully ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.sendKeys(we1,inputValue).build().perform();
				System.out.println(" Element is enabled and click suceessfully ");
				test.log(Status.INFO, " Element is enabled and click suceessfully ");
			} else { 
				System.out.println(" Element is not enabled and not click suceessfully ");
				test.log(Status.INFO, " Element is not enabled and not click suceessfully ");
			}
		} else {
			System.out.println("  Element is not displayed and not click suceessfully ");
			test.log(Status.INFO, " Element is not displayed and not click suceessfully ");
		}
	}
	
	////ACTIONS SENDKEYS WITHOUT WEBELEMENT.......
	public  Actions actionSendkeys( String inputValue) {
		Actions act = null;
		
		act= new Actions(driver);
		act.sendKeys(inputValue).build().perform();
		
		test.log(Status.INFO, " Click Successfully ");
		
		
		return act;
	}
	
	
	///ACTIONS CLASS RIGHT CLICK WITH WEBELEMENT ..........
	public  void actionRightclick( String locatortype, String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" Element is displayed and right click suceessfully ");  
			test.log(Status.INFO, " Element is displayed and right click suceessfully ");
			if (we1.isEnabled() == true) {
				Actions act= new Actions(driver);
				act.contextClick(we1).build().perform();
				System.out.println(" Element is enabled and right click suceessfully ");
				test.log(Status.INFO, " Element is enabled and right click suceessfully ");
			} else { 
				System.out.println(" Element is not enabled and not right click suceessfully ");
				test.log(Status.INFO, " Element is not enabled and not right click suceessfully ");
			}
		} else {
			System.out.println(" Element is not displayed and not right click suceessfully ");
			test.log(Status.INFO, " Element is not displayed and not right click suceessfully ");
	}
	}
	
	
	////ACTIONS CLASS OF RIGHT CLICK WITHOUT WEBELEMENT............
	  public Actions actionRightclick() {
		
        Actions act = null;
		
		act= new Actions(driver);
		act.contextClick().build().perform();
		
		test.log(Status.INFO, " Right Click Successfully ");
		
		
		return act;
	}
		
	
	//////------------HOW TO HANDLE DROPDOWN....SELECT CLASS........------------///////
	
	////SELECT BY VISIBLE TEST IS A METHOD OF SELECT CLASS .......
	public  void selectByViisbleText( String locatortype,String locatorValue, String visibleTxt) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO," ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY " );
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.selectByVisibleText(visibleTxt);
				System.out.println(" ELEMENT ELABLE SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT ENABLE IN SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			} else { 
				System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
  				test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
			test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
		}
	}
	
	
	////SELCECT BY VALUE    METHOD OF SELECT CLASSS
	public  void selectByvalue( String locatortype,String locatorValue, String value) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {    
			System.out.println(" ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO, " ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY  ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.selectByValue(value);
				System.out.println(" ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			} else { 
				System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN   ");
				test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
			test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
		}
}
	
	
	////SELECT BY INDEX AND METHOD OF SLECT CLSDD........
	public  void selectByindex( String locatortype,String locatorValue, int index) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO, " ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.selectByIndex(index);
				System.out.println(" ELEMENT IS   SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT IS   SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			} else { 
				System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT DISPLAYED VALUE IN DROPDOWN SUCCESSFULLY ");
			test.log(Status.INFO, " ELEMENT IS NOT DISPLAYED VALUE IN DROPDOWN SUCCESSFULLY ");
		}
		}
	
	
////DISELECT BY VISIBLE TEST IS A METHOD OF SELECT CLASS .......
	public  void selectDiselectByViisbleText( String locatortype,String locatorValue, String visibleTxt) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println( " ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO, " ELEMENT  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.deselectByVisibleText(visibleTxt);
				System.out.println(" ");
				test.log(Status.INFO, "");
			} else { 
				System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
				test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN  ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT  DISPLAYED VALUE IN DROPDOWN  ");
			test.log(Status.INFO, " ELEMENT IS NOT  DISPLAYED VALUE IN DROPDOWN  ");
		}
	}
	
	
     ////DESELECT BY value IS A METHOD OF SELECT CLASS .......
	public  void deselectByValue( String locatortype,String locatorValue, String Value) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println("  ELEMENT IS  SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO, " ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.deselectByValue(Value);
				System.out.println(" ELEMENT IS   SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT IS   SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			} else { 
				System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN ");
				test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT  SELECT VALUE IN DROPDOWN ");
			test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN ");
		}
	}
	
	
        ////DESELECT BY INDEX AND METHOD OF SLECT CLSDD........
	public  void SelectdeSelectByindex( String locatortype,String locatorValue, int index) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO, " ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.deselectByIndex(index);
				System.out.println(" ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			} else { 
				System.out.println(" ELEMENT IS NOT SELECT VALUE IN DROPDOWN ");
				test.log(Status.INFO, " ELEMENT IS NOT SELECT VALUE IN DROPDOWN ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT SELECT VALUE IN DROPDOWN  ");
			test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN ");
		}
		}
	
          ////DESELECT BY INDEX AND METHOD OF SLECT CLSDD........when ever multile options
	public  void selectDeSelectAll( String locatortype,String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");  
			test.log(Status.INFO, " ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				sel.deselectAll();
				System.out.println(" ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
				test.log(Status.INFO, " ELEMENT IS SELECT VALUE IN DROPDOWN SUCCESSFULLY ");
			} else { 
				System.out.println(" ELEMENT IS NOT SELECT VALUE IN DROPDOWN ");
				test.log(Status.INFO, " ELEMENT IS NOT SELECT VALUE IN DROPDOWN ");
			}
		} else {
			System.out.println(" ELEMENT IS NOT SELECT VALUE IN DROPDOWN  ");
			test.log(Status.INFO, " ELEMENT IS NOT  SELECT VALUE IN DROPDOWN ");
		}
		}
	
                ////getFirstSelectedOption.....
	public  void SelectGetFirstSelectedOptions( String locatortype,String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" Element is displayed and get 1st selectoptions value in dropdown "  );  
			test.log(Status.INFO, " Element is displayed and get 1st selectoptions value in dropdown ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				String getFSO = sel.getFirstSelectedOption().getText();
				
				System.out.println(" Element is enabled and get 1st selectoptions value in dropdown ");
				test.log(Status.INFO, " Element is enabled and get 1st selectoptions value in dropdown ");
			} else { 
				System.out.println(" Element is not enabled and not get 1st selectoptions value in dropdown ");
				test.log(Status.INFO, " Element is not enabled and not get 1st selectoptions value in dropdown ");
			}
		} else {
			System.out.println(" Element is not displayed and not get 1st selectoptions value in dropdown ");
			test.log(Status.INFO, " Element is not displayed and not get 1st selectoption value in dropdown ");
		}
		}
	
	
	////---get All selected options........
	public  void SelectGetAllSelectedOptions( String locatortype,String locatorValue) {

		WebElement we1= getwebElement(locatortype,locatorValue );
		
		if (we1.isDisplayed() == true) {
			System.out.println(" Element is Displayed and getAllSelectedOptions Value in Dropdown Successfully ");  
			test.log(Status.INFO, "  Element is Displayed and getAllSelectedOptions Value in Dropdown Successfully ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				List<WebElement> listWe =getList(locatortype , locatorValue);
				for(int i = 0; i < listWe.size(); i++) {
					String getOptions = listWe.get(i).getText();
				i++;
				test.log(Status.INFO, " get one by one all selected options= " + i + " : " + getOptions);
				}
				
				System.out.println(" Element is enabled and getAllSelectedOptions Value in Dropdown Successfully ");
				test.log(Status.INFO, " Element is enabled and getAllSelectedOptions Value in Dropdown Successfully ");
			} else { 
				System.out.println(" Element is not enabled and getAllSelectedOptions Value in Dropdown ");
				test.log(Status.INFO, " Element is not enabled and getAllSelectedOptions Value in Dropdown ");
			}
		} else {
			System.out.println(" Element is not displayed and getAllSelectedOptions Value in Dropdown  ");
			test.log(Status.INFO, " Element is not displayed and getAllSelectedOptions Value in Dropdown ");
		}
		}
		
	////---getOptions......wthat's present in dropdown................
	public  void SelectGetOptions( String locatortype,String locatorValue) {

		WebElement we1= getwebElement(locatortype,locatorValue );
		
		if (we1.isDisplayed() == true) {
			System.out.println(" Element is Displayed and getAllOptions Value in Dropdown Successfully ");  
			test.log(Status.INFO, " Element is Displayed and getAllOptions Value in Dropdown Successfully ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				List<WebElement> listWe = sel.getOptions();
				for(int i = 0; i < listWe.size(); i++) {
					String getOptions = listWe.get(i).getText();
				i++;
				test.log(Status.INFO, " get one by one all options in dropdown= " + i + " : " + getOptions);
				}
				
				System.out.println(" Element is enabled and getAllOptions Value in Dropdown Successfully ");
				test.log(Status.INFO, " Element is enabled and getAllOptions Value in Dropdown Successfully ");
			} else { 
				System.out.println(" Element is not enabled and Not getFirstSelect Value in Dropdown ");
				test.log(Status.INFO, " Element is not enabled and Not getFirstSelect Value in Dropdown ");
			}
		} else {
			System.out.println(" Element is not displayed and Not getFirstSelect Value in Dropdown  ");
			test.log(Status.INFO, " Element is not displayed and Not getFirstSelect Value in Dropdown ");
		}
		}
	
	
		///count dropdown items.......
	public  void SelectGetDropdownItems( String locatortype,String locatorValue) {
		WebElement we1 =getwebElement(locatortype , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" Element is displayed and count items that's present in Dropdown ");  
			test.log(Status.INFO, " Element is displayed and count items that's present in Dropdown ");
			if (we1.isEnabled() == true) {
				Select sel= new Select(we1);
				int NoItems = sel.getOptions().size();
				System.out.println(" Element is enabled and count items that's present in Dropdown ");
				test.log(Status.INFO, " Element is enabled and count items that's present in Dropdown ");
			} else { 
			System.out.println(" Element is not enabled and Not count items that's present in Dropdown ");
			test.log(Status.INFO," Element is not enabled and Not count items that's present in Dropdown ");
			}
		} else {
			System.out.println(" Element is not displayed and Not count items that's present in Dropdown  ");
			test.log(Status.INFO, " Element is not displayed and Not count items that's present in Dropdown ");
		}
		}
	
	///GET ATTRIBUTE VALUE METHOD RETRUN STRING........
	public  String getAttributeValue( String locatortype,String locatorValue, String attributeValue) {
		String attributeValueText=null;
		WebElement we =getwebElement(locatortype , locatorValue);
		if (we.isDisplayed() == true) {
			System.out.println(" WebElement  is displayed ");  
			test.log(Status.INFO, " WebElement  is displayed ");
			if (we.isEnabled() == true) {
				attributeValueText = we.getAttribute(attributeValue);
				
				System.out.println(" Element is enabled ");
				test.log(Status.INFO, " Element is enabled ");
			} else { 
				System.out.println(" Txt Box is not enabled ");
				test.log(Status.INFO, " Txt Box is not enabled ");
			}
		} else {
			System.out.println(" WebElement is not displayed ");
			test.log(Status.INFO, " WebElement is not displayed ");
		}
		return attributeValueText; 
	
	
	}
	
	///GET PAGE TITLE METHOD RETRUN STRING.......
    public  String getPageTitle(  ) {
		String gettitle=null;
		
				gettitle = driver.getTitle();
				
				System.out.println(" Title fetch successfully ");
				test.log(Status.INFO, " Title fetch successfully ");
			
		return gettitle;
}

    ///getHeight..........
    public int getHeight(WebElement we1) {
    	int hig = 0;
    	if(we1.isDisplayed()&we1.getSize().getHeight()>0&we1.getSize().getWidth()>0) {
    	if(we1.isEnabled())	{
    		hig = we1.getSize().getHeight();
    		System.out.println( " Element height is : " + hig);
    		test.log(Status.INFO," Element height is : " + hig );
    	} else 
    		test.log(Status.INFO, " Element is not visible ");
    		System.out.println(" Element is not visible ");
    		
    	} else 
    		test.log(Status.INFO, " Element is not displayed ");
    		System.out.println(" Element is not displayed ");
    		
    		return hig;
    	}
    	
    
    /////getWidth......
    public int getWidth(WebElement we1) {
    	int wid = 0;
    	if(we1.isDisplayed()&we1.getSize().getHeight()>0&we1.getSize().getWidth()>0) {
    	if(we1.isEnabled())	{
    		wid = we1.getSize().getWidth();
    		System.out.println( " Element height is : " + wid);
    		test.log(Status.INFO," Element height is : " + wid);
    	} else 
    		test.log(Status.INFO, " Element is not visible ");
    		System.out.println(" Element is not visible ");
    		
    	} else 
    		test.log(Status.INFO, " Element is not displayed ");
    		System.out.println(" Element is not displayed ");
    		
    		return wid;
    	} 
    
    
    /// method get X location................
    public int getXLocation(WebElement we1) {
    	int x = 0;
    	if(we1.isEnabled()) {
    	if(we1.isDisplayed()& we1.getSize().getHeight()>0 & we1.getSize().getWidth()>0){
    		x = we1.getLocation().getY();
    		System.out.println( " Element location of X : " + x);
    		test.log(Status.INFO," Element location of X : " + x);
    	} else 
    		test.log(Status.INFO, " Element is not displayed ");
    		System.out.println(" Element is not displayed ");
    		
    	} else 
    		test.log(Status.INFO, " Element is not showing on Enabled ");
    		System.out.println(" Element is not showing on Enable ");
    		
    		return x;
    		
    	} 
    
    
    
    /// method get Y location................
    public int getYLocation(WebElement we1) {
    	int y = 0;
    	if(we1.isEnabled()) {
    	if(we1.isDisplayed()& we1.getSize().getHeight()>0 & we1.getSize().getWidth()>0){
    		y = we1.getLocation().getY();
    		System.out.println( " Element location of Y : " + y);
    		test.log(Status.INFO," Element location of Y : " + y);
    	} else 
    		test.log(Status.INFO, " Element is not displayed ");
    		System.out.println(" Element is not displayed ");
    		
    	} else 
    		test.log(Status.INFO, " Element is not showing on Enabled ");
    		System.out.println(" Element is not showing on Enable ");
    		
    		return y;
    		
    	} 
    
    
     ///WE CREATE A METHOD FOR CLOSE BRAWSER/////
   	public  void closeBrowser( ) {
	     driver.close();                       
	             driver.quit();  
	             test.log(Status.INFO, " Browser close and quit successfully ");
   	}                     
   	
   	///MAXIMIZE METHOD
	public  void maximize( ) {
	     driver.manage().window().maximize();                      
	     test.log(Status.INFO, " Browser maximize successfully ");
  	}   
	
	
	///MINIMIZE METHOD......
	public  void minimize( ) {
	     driver.manage().window().minimize();                      
	     test.log(Status.INFO, " Browser minimize successfully ");  
 	}   
	
	
	///WE CREATE GENERIC METHOD OF OPEN URL.......
    public  void OpenURL(String URL) {
		
		driver.get(URL);
		test.info(" Browser has been lanuched  the URl is " + URL);
		
   
	}
    ///-------------GET WINDOW HANDLE---------------------.../////
    
    
    ////METHOD OF GET PARENT WINDOW AND RETRUN STRING........
	public String getParentWindow() {
		String parentWindow= driver.getWindowHandle();
		return parentWindow;
		
		}
	
	///METHOD OF SWITCH TO WIINDOW BY TITLE....AND RETURN SET OF STRING......
	public Set<String> switchToWindowByTitle(String title) {
		Set<String>  window=driver.getWindowHandles();
		for(String multipleWindow:window){
			String actualTitle = driver.getTitle();
			if(!actualTitle.equalsIgnoreCase(title)) {
			System.out.println(" please Enter valid title ");
			}
			driver.switchTo().window(multipleWindow);
		}
		return window;
	}
	
	////METHOD OF SWITCH TO WINDOW BY URL AND RETURN SET OF STRING.......
	public Set<String> switchToWindowByURL(String URL) {
		Set<String>  window=driver.getWindowHandles();
		for(String multipleWindow:window){
			String actualTitle = driver.getCurrentUrl();
			if(!actualTitle.equalsIgnoreCase(URL)) {
			System.out.println(" please Enter valid title ");
			}
			driver.switchTo().window(multipleWindow);
		}
		return window;
	}
	
	//// METHOD OF SWITCH TO PARENT WINDOW STRING TYPE OF PARAMETER IN THIS METHOD WE HAVE TO PASS
	public void switchToParentWindow(String parentWindow) {
		driver.switchTo().window(parentWindow);
		
	}
	
	//METHPD OF GET CURRENT URL..........AND REURN STRING
	public String getCurrentURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}
	
	
	/////--------------HANDLING POPUP METHOD........-----------///////
	
	//METHOD OF POPUPACCEPT.....AND IN THIS METHOD WE HAVE TO PASS STRING TYPE OF PARAMETER//////
	public void popupAccept(String expectedPopupText) {
		
		String actualText = popupGetText();
		if(actualText.contains(expectedPopupText)) {
		driver.switchTo().alert().accept();
		}else {
			System.out.println(" Please enter The Valid Popup text ");
		}
			
		}

	///METHOD OF POPUP DISMISS   AND IN THIS METHOD WE HAVE TO PASS STRING TYPE OF PARAMETER/////
    public void popupDismiss(String expectedPopupText) {
		
		String actualText = popupGetText();
		if(actualText.contains(expectedPopupText)) {
		driver.switchTo().alert().dismiss();
		}else {
			System.out.println(" Please enter The Valid Popup text ");
		}
			
		}
	

     ///METHOD OF POPUP GET TEXT   AND RETURN TYPE IS STRING......
	public String popupGetText() {
		String poptext = driver.switchTo().alert().getText();
		return poptext;
	}
	 
	///
	///METHOD OF POPUP SENDKEYS   AND IN THIS METHOD WE HAVE TO PASS STRING TYPE OF PARAMETER/////
	public void popupSendkeys(String inputvalue) {
		 driver.switchTo().alert().sendKeys(inputvalue);
		
	}
	
	
	////------------upload file---------------->////
	
	public void uploadFile(String locatortype, String locatorValue, String filePath ) {
		WebElement we =getwebElement(locatortype , locatorValue);
		if (we.isDisplayed() == true) {
			System.out.println(" file is displayed Upload Successfully ");  
			test.log(Status.INFO, " file is displayed Upload Successfully ");
			if (we.isEnabled() == true) {
				we.clear();
				we.sendKeys(filePath);
				System.out.println(" file is Enabled Upload Successfully ");
				test.log(Status.INFO, " file is Enabled Upload Successfully ");
			} else { 
				System.out.println(" file is not enaabled Upload Successfully ");
				test.log(Status.INFO, " file is not enabled Upload Successfully ");
			}
		} else {
			System.out.println(" file is not displayed Upload Successfully ");
			test.log(Status.INFO, " file is not displayed Upload Successfully ");
		}	}
	
		
		///////---------switch to frame=----------------//////
		
		///method switchToFrameByIndex method......
		public WebDriver switchToFrameByIndex(int frameNumber) {
			WebDriver cd = driver.switchTo().frame(frameNumber);
			test.log(Status.INFO, " switch to frame successfully ");
			return  cd;
		}
		
		////method of switch to frame by string/...................
       public WebDriver switchToFrameByIdOrName(String IdOrNameValue) {
			WebDriver as = driver.switchTo().frame(IdOrNameValue);
			test.log(Status.INFO, " switch to frame successfully ");
			return as;
			
		}
       
       
       ////method of switch to frame by webelement..............
       public WebDriver switchToFrameByWebElement(WebElement we ) {
			WebDriver ss =driver.switchTo().frame(we);
			test.log(Status.INFO, " switch to frame successfully ");
			return ss;
		}
       
       /////method of switch to parent frame..........
       public WebDriver switchToParentFrame( ) {
			WebDriver we = driver.switchTo().parentFrame();
			test.log(Status.INFO, " switch to frame successfully ");
			return we;
		}

		
       /////method of switch to main frame..........
       public WebDriver switchToMainFrame( ) {
			WebDriver we = driver.switchTo().defaultContent();
			test.log(Status.INFO, " switch to frame successfully  ");
			return we;
		}
 
       //////---------------Wait---------------------//////
       
       ///method implicitlyWait.....
       //*it is wait for all object...
       public void implicityWait(long time) {
    	  
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
       }
		
       
       /////THREAD.SLEEP IS A METHOD OF STATIC WAIT.....................
       public void staticWait(int timeInSecond) {
    	   int second = timeInSecond * 1000;
    	   try {
    		   
    		   Thread.sleep(second);
    		   
    		   test.log(Status.INFO, "Static wait is puted ");
    		   System.out.println(" Static wait is puted ");
    		   
    	   }catch(InterruptedException e) {
    		   
    		   e.printStackTrace();
    		   
    	   }
       }
       
       
     	////method of exciplicitly wait visibility......
       ///*it is wait for specific Element and specific condition of visibility
       public void exciplicitlyWaitVisibility(long time, WebElement we) {
     	  
    	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
    	   wait.until(ExpectedConditions.visibilityOf(we));
       }
       
       
       //////////enabled Title Wait...........
       public void enabledTitleWait(String expTitle, Duration timeInSecond) {
    	   WebDriverWait explicitly= new WebDriverWait(driver, timeInSecond);
    		   explicitly.until(ExpectedConditions.titleContains(expTitle));
       
       }
       
       
        /////selected Element Wait............................
       public void selectedElementWait(WebElement we, Duration timeInSecond) {
    	   WebDriverWait explicitly= new WebDriverWait(driver, timeInSecond);
    	   if(we.equals(we.isSelected())) {
    		   explicitly.until(ExpectedConditions.elementToBeClickable(we));
    	   }else {
    		   test.log(Status.INFO, " Element is not selected ");
    		   System.out.println(" Element is not selected ");
    	   }
    	   
       }
       
       
       //////enabled Element Wait.........
       public void enabledElementWait(WebElement we1, Duration timeInSecond) {
    	   if(we1.equals(we1.isSelected())) {
    	   WebDriverWait explicitly= new WebDriverWait(driver, timeInSecond);
    		   explicitly.until(ExpectedConditions.elementToBeClickable(we1));
    	   }else {
    		   test.log(Status.INFO, " Element is not Enabled ");
    		   System.out.println(" Element is not Enabled ");
    	   }
    	   
       }
       
       
       //////visible Element Wait.....................
       public void visibleElementWait(WebElement we1, Duration timeInSecond) {
    	   WebDriverWait explicitly= new WebDriverWait(driver, timeInSecond);
    	   if(we1.equals(we1.isDisplayed())) {
    		   explicitly.until(ExpectedConditions.visibilityOfAllElements(we1));
    	   }else {
    		   test.log(Status.INFO, " Element is not Visible ");
    		   System.out.println(" Element is not Visible ");
    	   }
    	   
       }
       
       	////method of exciplicitly wait invisibility......
       ///*it is wait for specific Element and specific condition of invisibility
       public void exciplicitlyWaitInVisibility(long time, WebElement we) {
     	  
    	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
    	   wait.until(ExpectedConditions.invisibilityOf(we));
       }
		
     ///method of exciplicitly wait Element To Be Clickable.......
       //*it is wait for specific Element and specific condition of element to be clickable................
       ///*we
       public void exciplicitlyWaitElementToBeClickable(long time, WebElement we) {
       	  
    	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
    	   wait.until(ExpectedConditions.elementToBeClickable(we));
    	   
       }
		
		
		///method of exciplicitly wait Element To Be Clickable.......
       //*it is wait for specific Element and specific condition of element to be clickable................
       //*locatorValue......
       public void exciplicitlyWaitElementToBeClickable(long time, String locatorValue) {
      	  
    	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
    	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
       }
		
       
       /////////<-----------------GetTImeStamp---------------->/////
       
   	public  String getTimeStamp() {
		DateFormat df= new SimpleDateFormat(" mm-dd-yyyy HH_MM_SS ") ;
		String x= df.format(new Date());
		return x;
		
				}
        
       //////-----------------TAKE A SCREENSHOT .=-=-0------------>//////
       
       
       
   	//we take a screenshot() method and add the screenshot with Report File......
       public  void getsscreenshot(WebDriver driver)  {

   		TakesScreenshot tstScreenshot = (TakesScreenshot) driver;
   		File from=tstScreenshot.getScreenshotAs(OutputType.FILE);
   			String ts=  getTimeStamp();
      File to = new File(" target//screenShot.png ");
   			
   			try {
   				FileUtils.copyFile(from, to);
   			} catch (IOException e) {
   				e.printStackTrace();
   			} 
   			}
   			
   		/////<-------------ExtentReport------------->//////
   				
   			
       ///ExtentTest class of object...............
       ////*mothod of genarateReports..........
       ////*testCaseId....
   	   	public ExtentReports generateReports(String testCaseId) {
   				DateFormat df = new SimpleDateFormat(" dd-mm-yyyy-hh-mm-ss ");
   				String dateStamp = df.format(new Date());
   				File filePath = new File(" target " + dateStamp + " .html ");
   				
   			ExtentSparkReporter esp = new ExtentSparkReporter(filePath);
   			ExtentReports ext = new ExtentReports();
   			ext.attachReporter(esp);
   			test = ext.createTest(testCaseId);
   			System.out.println(" HelloReports ");
   			return ext;
   			}
   			
   	   	
   	   	      ////-----------FOR FINDING COLOR OF ELEMENTS...................///
   	   	
   	   	/*GET Css value method*/
   	   	public String getCssValue(String locatorType, String locatorValue, String background_color_Ya_color, String colorHasValue) {
   	   		String colorText = null;
   	 	WebElement we1 =getwebElement(locatorType , locatorValue);
		if (we1.isDisplayed() == true) {
			System.out.println(" Element color is displayed  ");  
			test.log(Status.INFO, " Element color is displayed ");
			if (we1.isEnabled() == true) {
			String colorProperty = we1.getCssValue(background_color_Ya_color);
			colorText = Color.fromString(colorProperty).asHex();
			
				System.out.println(" Element color is enabled ");
				test.log(Status.INFO, " Element color is enabled ");
			} else { 
				System.out.println(" Element color is not enabled ");
				test.log(Status.INFO, " Element color is not enabled ");
			}
		} else {
			System.out.println(" Element color is not displayed ");
			test.log(Status.INFO, " Element color is not displayed ");
		}
		
		if(colorText.equalsIgnoreCase(colorHasValue)) {
			test.log(Status.INFO," Element colur is right ");
		}else {
			test.log(Status.FAIL," Element colur is not right " );
			}
		return colorText;
   	   			}
   	   	
   	   	
                    ///////////////////--------------JAVA SCRIPT EXECUTOR--------------//////////////////
   	   	
   	   	////CLICK IS A METHOD OF JAVA SCRIPT.................
   	   	public void jsClick(WebElement we1) {
   	   	JavascriptExecutor jse = (JavascriptExecutor)driver;
   	   	jse.executeScript(" arguments[0].click() ",we1);
   	   	test.log(Status.INFO, " Element is clicked by JavaScript " + we1.toString());
   	   	System.out.println(" Element is clicked by JavaScript ");
   	   	
   	   	}
   	   	
   	   	
   	   	/////SENDKEYS IS METHOD OF JAVA SCRIPT.......................
   	  	public void jsSendkeys(WebElement we1, String inputValue) {
   	   	   	JavascriptExecutor jse = (JavascriptExecutor)driver;
   	   	    	we1.clear();
   	   	   	jse.executeScript(" arguments[0].value= " + " " + inputValue + " ",we1);
   	   	   	test.log(Status.INFO, " Value is inputed by JavaScript " + we1.toString());
   	   	   	System.out.println(" Value is input by JavaScript ");
   	   	   	
   	   	   	}
 	
   	   	
   	  	
   	  	////jsScrollUp is method of java Script.....................
   		public void jsScrollBar(WebElement we1) {
   	   	   	JavascriptExecutor jse = (JavascriptExecutor)driver;
   	   	   	we1.clear();
   	   	   jse.executeScript("window.scrollBy(0, 120)");////Scroll Down (+ve)
   	   	   staticWait(3000);
   	   	   System.out.println("Scrolled Down.........");
   	   	   	
   	   	   jse.executeScript(" window.scrollBy(0,-50)");///Scroll Up (-ve)
   	   	   staticWait(3000);
   	   	   System.out.println(" Scrolled Up...........");
   	   	   	}
   	  	
   		
   		
   	 	////jsScrollUp is method of java Script.....................
   		public void jsScrollDown(WebElement we1) {
   	   	   	JavascriptExecutor jse = (JavascriptExecutor)driver;
   	   	   	we1.clear();
   	   	   	jse.executeScript("  arguments[0].scrollIntoView();   ", we1);
   	   	    	test.log(Status.INFO, " Element is Scroll up by JavaScript " + we1.toString());
   	   	   	System.out.println(" Element is Scroll up by JavaScript ");
   	   	   	
   	   	   	}
   	  	
   		
   		
     	   	/////JSMAUSEOVER IS METHOD OF JAVA SCRIPT.......................
		public void jsMauseOver(WebElement we1) {
   	   		
   	   	String strJs = " var element = argument[0]; " + " var mouseEventObj=document.createEvent('MouseEvents');"
   	   	+ " mouseEventObj.initEvent('mouseOver' , true, true); " + " element.dispatchEvent(mouseEventObj); ";
   	   	
   	   	try {
   	   		String mouseOverScript = " if(document.createEvent){ "
   	   			  	+ " var evObj = document.createEvent('mouseEvents'); "
                    +" evObj.initEvent('mouseOver' ,true, false);arguments[0].dispatchEvent(evobj); "
   	                + "}"
   	   				+" else if(document.createEventObject){ "
   	   				+ " arguments[0].fireEvent('onMouseOver'); "
   	   				+ "}";
   	   		JavascriptExecutor jse = (JavascriptExecutor)driver;
   	   		jse.executeScript(strJs, we1);
   	   	}catch(Exception e) {
   	   		test.log(Status.INFO, " JavaScript MouseOver is not click " + we1.toString());
   	   		System.out.println(" JavaScript MouseOver is not click  ");
   	   	 
   	   	}
   	   	
   	   	
   	   	 
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	}
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
   	   	
  }
		
		
		
		
			

