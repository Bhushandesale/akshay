package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utilityclass 

{WebDriver driver;
public WebDriver openchromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		return driver;

	}
public void capturescreenshot(WebDriver driver) throws IOException
{
	String RS= RandomString.make(4);
 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest =new File("C:\\Users\\admin\\Downloads\\New folder\\b"+RS+ ".jpeg");
FileHandler.copy(source, dest);
//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File dest = new File("C:\\Users\\admin\\Downloads\\New folder\\Test_"+testID+"Date and Time"+".jpg");
//	FileHandler.copy(source, dest);  
}
}


