package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashbord 
{
WebDriver driver;	
	
	@FindBy(xpath="//b[text()='Dashboard']")
	 private WebElement dash;

	@FindBy(xpath="//b[text()='Leave']")
	private WebElement leav;

	@FindBy(xpath ="//b[text()='Time']" )
	private WebElement time;
	
    @FindBy(xpath="//b[text()='Recruitment']")
	private WebElement requi;
     
    
	
	
	public Dashbord(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public void desh() {
		dash.click();
	}

	public void lea() {
		leav.click();
	}
	public void tim() {
		time.click();
	}
    public void requre() {
    	requi.click();
    }


	}

