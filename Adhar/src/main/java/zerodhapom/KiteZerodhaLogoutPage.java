package zerodhapom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class KiteZerodhaLogoutPage 
{
	WebDriver driver;
	@FindBy(xpath="//a[text()='Change user']")
	private WebElement chnageUser;
	
	public KiteZerodhaLogoutPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickKiteChangeUser() 
	{
		chnageUser.click();
	}
}
