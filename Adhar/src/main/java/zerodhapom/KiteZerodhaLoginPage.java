package zerodhapom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class KiteZerodhaLoginPage
{ WebDriver driver;
  WebDriverWait wait;

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@label='PIN']")
	private WebElement pin;
	
	@FindBy(xpath = "//button[text()='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	 private WebElement continueButton;
	
	public KiteZerodhaLoginPage(WebDriver driver)
	{
		wait=new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	public void sendKiteLoginPageUsername() 
	{
		userName.sendKeys("PI6815");
	}
	
	public void sendKiteLoginPagePassword() 
	{
		password.sendKeys("Bhushan@18");
	}
	
	public void clickKiteLoginPageLogin() 
	{
		loginButton.click();
	}
	
	public void sendKiteLoginPagePin() 
	{wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@label='PIN']")));
		pin.sendKeys("181019");
	}
	
	public void clickKiteLoginPageContinue() {
		continueButton.click();
    }
	public void Handle() throws InterruptedException 
	{ Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	
	
	
	
	
	
	
	
	
}