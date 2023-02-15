package Inheritancepractice;

public class ToolUseges {

	public static void main(String[] args) {
	
		ChromeAutomation ca =	new ChromeAutomation();
     
		ca.openURL("https://flipkart.com/");
		ca.getURL();
		ca.getPageTitle();
		ca.searchElement("//input[@name='user_name']");
		ca.takeSnapshotOnChromePage();
		
		
		FireFoxAutomation fa =	new FireFoxAutomation();
		fa.openURL("https//:amazoan.com");
		fa.getURL();
		fa.takefirefoxpagephoto();
		
	
	}

}
