    package framework;

    import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import org.openqa.selenium.WebDriver;
    public class Shivi { 
	static WebDriver driver;
    public static void main(String[] args) {
	General gen=new General();
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

