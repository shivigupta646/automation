package Inheritancepractice;

public class WebAutomation {

	public void openURL(String url) {
		
		System.out.println("open url "+url);
	}

	public void getPageTitle() {
		System.out.println("fetching page title");
	}

	public void getURL() {
		System.out.println("fetching page url");
	}

	public void searchElement(String Xpath) {
		System.out.println("searching elements by Xpath-" +Xpath);
		 
	}
}
