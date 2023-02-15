package com.evs.flipkart.login.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
////tr[@class='headerrow']
public class Rahul {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "deiver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();
List<WebElement> listofMarketingmodule = driver.findElements(By.xpath("//div[normalize-space()='No Data Found']"));
		
		int goldi=listofMarketingmodule.size();
		System.out.println(goldi); 
		
		for(int i=0; i<goldi; i++) {
			WebElement goldiji=listofMarketingmodule.get(i);
		String Garima=goldiji.getText();
		System.out.println(Garima);
		}
		
		

  List<WebElement> lmom = driver.findElements(By.xpath("//tr[@class='headerrow']"));
	
  int a=lmom.size();
  System.out.println(a);
  for (int j = 0; j < a; j++) {
	WebElement ab=lmom.get(j);
	String abc=ab.getText();
	System.out.println(abc);
	
  }
	
	////input[@id='more_14']//parent::div//table//tr//td
	
	 List<WebElement> lmoms = driver.findElements(By.xpath("//input[@id='more_14']//parent::div//table//tr//td"));
		int as=lmoms.size();
		System.out.println(as);
		
		for (int k = 0; k < as; k++) {
			WebElement asd=lmoms.get(k) ;
			String asg=asd.getText();
			System.out.println(asg);
		}
		
 List<WebElement> loms = driver.findElements(By.xpath("//input[@id='more_12']//parent::div/table//tr//td"));	
     
       int an=loms.size();
       System.out.println(an);
		
		for (int v= 0; v < an; v++) {
			WebElement d=loms.get(v);
			String g=d.getText();
			System.out.println(g);
		}
		
		
		////input[@id='more_10']//parent::div/table//tr//td
		List<WebElement> lomws = driver.findElements(By.xpath("//input[@id='more_10']//parent::div/table//tr//td"));	
	     
	       int aw=lomws.size();
		
		System.out.println(aw);
		

		for (int m= 0; m< aw; m++) {
			WebElement p=lomws.get(m);
			String t=p.getText();
			System.out.println(t);
		}
		
		//input[@id='more_1']//parent::div/table//tr//td
		
		List<WebElement> lomw= driver.findElements(By.xpath("//input[@id='more_9']//parent::div/table//tr//td"));	
	     
	       int w=lomw.size();
		
		System.out.println(w);
		
		for (int u= 0; u< w; u++) {
			WebElement pk=lomw.get(u);
			String tl=pk.getText();
			System.out.println(tl);
		}
		

		List<WebElement> omw= driver.findElements(By.xpath("//input[@id='more_1']//parent::div/table//tr//td"));	
	     
	       int wa=omw.size();
		
		System.out.println(wa);
		
		for (int r= 0; r< wa; r++) {
			WebElement yk=omw.get(r);
			String tw=yk.getText();
			System.out.println(tw);
		}
		
		////input[@id='more_5']//parent::div/table//tr//td
	
		List<WebElement> om= driver.findElements(By.xpath("//input[@id='more_1']//parent::div/table//tr//td"));	
	     
	       int wxa=om.size();
		
		System.out.println(wxa);
		
		for (int t= 0; t< wxa; t++) {
			WebElement tr=om.get(t);
			String tg=tr.getText();
			System.out.println(tg);
		}
		
		////td[contains(@class,'SelTab')]
		////td[contains(@class,'lvtCol')]
		
		List<WebElement> ocm= driver.findElements(By.xpath("//td[contains(@class,'SelTab')]"));	
	     
	       int wsa=ocm.size();
		
		System.out.println(wsa);
		
		for (int d= 0; d< wsa; d++) {
			WebElement yr=ocm.get(d);
			String yg=yr.getText();
			System.out.println(yg);
		}
		
		List<WebElement> ocy= driver.findElements(By.xpath("//td[@class='lvtCol']"));	
	     
	       int y=ocy.size();
		
		System.out.println(y);
		
		for (int g= 0; g< y; g++) {
			WebElement ir=ocy.get(g);
			String gg=ir.getText();
			System.out.println(gg);
		}
		
		
			}
}
//	driver.close();	
	////td[@class='lvtCol']


