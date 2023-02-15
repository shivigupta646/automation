package com.eva.vtiger.genericcode;

public class CodeRunner {

	public static void main(String[] args) {
		
		
		driver=gen.launchBrowserAndHitURL("http://localhost:8888/");
		gen.inputValue("//input[@name='user_name']", "admin");
		gen.inputValue("//input[@name='user_password']", "admin");
		gen.click( "//input[@name='Login']");
		gen.mouseHover( "//a[text()='Marketing']");
		gen.click( "//div[@id='Marketing_sub']//a[text()='Leads']");
		gen.click( "//img[@alt='Create Lead...']");
		gen.inputValue( "//input[@name='lastname']", "GoldiHo");
		gen.inputValue( "//input[@name='company']", "Goldi420Ho partner");
		gen.selectByViisbleText( "//select[@name='leadsource']", "Partner");
		gen.selectByViisbleText("//select[@name='leadstatus']", "Cold");
		gen.click("//textarea[@name='description']//parent::td//parent::tr//following-sibling::tr//input[@title='Save [Alt+S]']");
		
		
	}

}
