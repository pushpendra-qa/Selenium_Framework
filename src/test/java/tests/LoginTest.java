package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.LoginPage;

public class LoginTest extends Baselibrary
{
	//LoginPage obj = new LoginPage();    again have to attach with annotation
	//to resolve make it (obj) global variable and attach object created for 
	//loginPage class with annotation as given below 
	LoginPage obj = null;
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj = new LoginPage();
	}
	
	@Test    //by using this method becomes like main method of java
	public void clickonclose() 
	{
		//LoginPage obj = new LoginPage();
		obj.clickonclose();
		//without main method this will not get executed
		//therefore we will use annotation
	}
	
	@Test
	public void gettitle() 
	{
		//LoginPage obj = new LoginPage();
		obj.gettitle();
		 //String title=driver.getTitle();
		 //System.out.println(title);
	}
	
	@AfterTest
	public void finish() 
	{
		driver.quit();
	}

}

