 package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class General {
	static ExtentTest test;
	static WebDriver driver;

	public static void inputValue(String locator, String valueOfTextBox) {
		try {
			WebElement we = driver.findElement(By.xpath(locator));
			if (we.isDisplayed() == true) {
				System.out.println("webelement  is displayed");
				if (we.isEnabled() == true) {
					System.out.println(" element is enabled");
					we.clear();
					we.sendKeys(valueOfTextBox);
				} else {
					System.out.println("Txt Box is not enabled");
				}
			} else {
				System.out.println("WEbelement is not displayed ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(String locator) {
		try {
			WebElement we = driver.findElement(By.xpath(locator));
			if (we.isDisplayed() == true) {
				System.out.println("webelement  is displayed");
				if (we.isEnabled() == true) {
					System.out.println(" element is enabled");
					we.click();
				} else {
					System.out.println("Txt Box is not enabled");
				}
			} else {
				System.out.println("WEbelement is not displayed ");
			}
		} catch (Exception e) {

		}
	}

	public static WebDriver launchBrowserAndHitURL(String URL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		return driver;

	}

	public static void mouseHover(String locator) {
		try {
			WebElement we = driver.findElement(By.xpath(locator));
			if (we.isDisplayed() == true) {
				System.out.println("webelement  is displayed");
				if (we.isEnabled() == true) {
					System.out.println(" element is enabled");
					Actions act = new Actions(driver);
					act.moveToElement(we).build().perform();
				} else {
					System.out.println(" Box is not enabled");
				}
			} else {
				System.out.println("WEbelement is not displayed ");
			}
		} catch (Exception e) {

		}
	}

	public static void selectByViisbleText(String locator, String visibleTxt) {
		try {
			WebElement we = driver.findElement(By.xpath(locator));
			if (we.isDisplayed() == true) {
				System.out.println("webelement  is displayed");
				if (we.isEnabled() == true) {
					System.out.println(" element is enabled");
					Select sel = new Select(we);
					sel.selectByVisibleText(visibleTxt);

				} else {
					System.out.println("  is not enabled");
				}
			} else {
				System.out.println("WEbelement is not displayed ");
			}
		} catch (Exception e) {

		}
	}

}
