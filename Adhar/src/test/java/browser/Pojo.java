package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pojo 
{
	public  WebDriver openChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
//	public static WebDriver openFirefoxBrowser() 
//	{
//		System.setProperty("webdriver.gecko.driver","src" + File.separator + "test" + File.separator + "resources" + File.separator + "browsers" + File.separator + "geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		return driver;
//	}
}
