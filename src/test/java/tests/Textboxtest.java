package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.TextBoxPage;

public class Textboxtest extends Baselibrary
{
	TextBoxPage obj = null;
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj = new TextBoxPage();
	}
	
	@Test(priority=1)
	public void clickonclose() 
	{
		obj.clickonclose();
	}
	
	@Test(priority=2)
	public void clickonpractice() 
	{
		obj.clickonpractice();
	}
	
	@Test(priority=3)
	public void clickonelement() 
	{
		obj.clickonelement();
	}
	
	@Test(priority=4)
	public void clickontextbox() 
	{
		obj.clickontextbox();
	}
	
	@Test(priority=5)
	public void filldetails() 
	{
		obj.filldetails();
	}
	
	@Test(priority=6)
	public void validate() 
	{
		obj.validate();
	}
	
	@AfterTest
	public void closedriver() 
	{
		driver.quit();
	}

}
