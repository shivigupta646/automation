package Inheritancepractice;

public class FireFoxAutomation {

	public FireFoxAutomation() {
		
		System.out.println("launch the browser");
	}

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
	 public void takefirefoxpagephoto() {
		 System.out.println("take photo on forefox browser page");
	 }
}
