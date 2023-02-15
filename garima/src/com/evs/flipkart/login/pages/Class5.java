package com.evs.flipkart.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Class5 {
	
/*	public static void add(int a, int b ) {
		
		int c=a+b;
	}

	
 public  Class5(String name) { ///--- constructor
	 
	 System.out.println("hello world, i am "+name);
	 
	 }*/
 
	public static void main(String[] args, RemoteWebDriver ver) {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikshi\\OneDrive\\Desktop\\shivii\\garima\\deiver\\chromedriver.exe");
		// CHROME DRIVER
		
		
	
			
			  ChromeDriver var = new ChromeDriver(); 
			  var.get("http://flipkart.com");
			 
		// var.get("http://youtube.com");

		/*
		 * ver.findElement(By.name("user_name")).sendKeys("admin");
		 * ver.findElement(By.name("user_password")).sendKeys("admin");
		 * ver.findElement(By.name("[value='  Login  ']")).click(); //COMPILE CODE J\KO
		 * RKHTE H JAR ME.
		 */ // JB BHI KISI CLASS KA OBJECT BNEGA TO VO SBSE PHLE CONSTRUCTOR ME JAYEGA.
			// CONSTRUCTOR AK CODE H . JO BY DEAFAULT OBJET BNANE SE PHLE CHALTA H.
			// OBJECT BANSNE KE TIME CHALTA H..
			/// AGR KISI JAZ KA SORCE CODE NHI H TO USKE UNDER KYA H LYA NHI H USE NHI DEKH
			// SKTE.
			// GET METHOD BRAOUSER ME URL FIT KR RHA H
			// JO SAMNE DIKHTA H VO UI-- USER INTERFACE
			/// HTML --- HYPER TEXT MARKUP LANGUAGE.

		// WEB ELEMENT
 /////GET IS A METHOD, AND IT IS NON STATIC, CLASS OF CHROME DRIVER, 
		//CREATION OF OBJECT OF CHROME DRIVER. 
		//GET METHOD WORK LAUNCH BROWSER AND OPEN URL
		///SYSTEM.SETPROPERTY----IS STATIC METHOD
		//ARGUMENT TBHI BHEJ SKTE H JB PHLE SE PARAMETER RHEGA   
		  
			/// CROME BRAUSER---CHROME DRIVER.EXE
			/// FIREFOX BROWSER --- GECKODRIVER. EXE
			/// CHROME BRAUSE--- CHRODRIVER.EXE
			/// INTERNET EXPLORER--- IE DRIVERSERER.EXE
			// EDGE BRAUSER--- EDGE DRIVER.EXE

			/// system is class .object can't be create in system class.

			// TEXTBOX , INPUTBOX , EDITBOX

			// .CLASS KO EXTENSION KHTE H.
		  
		  
		//constructor in name match with class name
		  //it cannot be static
		  //neither it return nor void
		  //jb bhi object bnta h to sbse phle constructor ko chalata h
		  //constructor run without calling
		  //constructor me vhi code rhkhte h jo hmesa run kre
		  
		  ///IS CONTRUCTOR ME PARAMETER NHI HOTA VO DEAFLT CONTRUCTOR H
			//IS CONTRUOCTIOR ME PATARAMETER HOTA H TO VO CONSTRUCTOR H  
	}

}
