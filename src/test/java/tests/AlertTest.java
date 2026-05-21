package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.AlertPage;

public class AlertTest extends Baselibrary
{
	AlertPage obj = null;
	
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj = new AlertPage();
	}
	
	@Test(priority =1)
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
	public void clickonalert() 
	{
		obj.clickonalert();
	}
	
	@Test(priority=4)
	public void clickonalerts() 
	{
		obj.clickonalerts();
	}
	
	@Test(priority=5)
	public void clickonsimplealert() 
	{
		obj.clickonsimplealert();
	}
	
	@Test(priority=6)
	public void clickontimealert() 
	{
		obj.clickontimealert();
	}
	
	@Test(priority=7)
	public void clickonconfrmationalert() 
	{
		obj.clickonconfirmationalert();
	}
	
	@Test(priority=8)
	public void clickonpromtalert() 
	{
		obj.clickonpromtalert();
	}
}
