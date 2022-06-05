package testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Dashbord;
import pom.Loginpage;
import utility.Utilityclass;


public class TestA extends Utilityclass
{ 
	Loginpage login;
 WebDriver driver;
 Dashbord dash;
 


	@BeforeClass
	public void beforeClass() throws IOException
	{
			driver= openchromebrowser();
			 capturescreenshot(driver);
	} 
		@BeforeMethod
		public void method()
		{
			System.out.println("beforeMethod");
		}
		@Test()
		public void TestA() throws IOException
		{
			
			 login= new Loginpage(driver);
			 login.sendusername();
			 login.sendpassword();
			 login.SubmitButton();
			 capturescreenshot(driver);
		}
	
		@Test()
		public void TestB() throws IOException
		{
			
			dash= new Dashbord(driver);
			dash.desh();
			dash.lea();
			dash.tim();
			dash.requre();
			 capturescreenshot(driver);
		}

		@AfterMethod
		public void afterMethod()
		{
			System.out.println("aftermethod");
		}
		@AfterClass
		public void Afterclass()
		{
			System.out.println("afterclass");
		}
}
