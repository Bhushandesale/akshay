package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage
{



	WebDriver driver;
	
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement SubmitButton;

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
public void sendusername()
{
	//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
	username.sendKeys("Admin");
	
	
}
public void sendpassword() 
{
password.sendKeys("admin123");
}

public void  SubmitButton() 
{
	SubmitButton.click();
}
	








}


