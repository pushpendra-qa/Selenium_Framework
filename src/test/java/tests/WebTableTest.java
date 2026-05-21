package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.TextBoxPage;
import pages.WebTablePage;

public class WebTableTest extends Baselibrary
{

	WebTablePage obj = null;
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj = new WebTablePage();
	}
	
	@Test(priority=1)
	public void clickonclose() throws InterruptedException 
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
	public void clickonwebtable() 
	{
		obj.clickonwebtable();
	}
	
	@Test(priority=5)
	public void filldetails() 
	{
		obj.filldetails();
	}
	
	@Test(priority=6)
	public void updatedetails() 
	{
		obj.updatedetails();
	}

}
