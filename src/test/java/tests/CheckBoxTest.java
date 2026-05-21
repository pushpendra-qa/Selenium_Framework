package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.CheckBoxPage;

public class CheckBoxTest extends Baselibrary
{
	CheckBoxPage obj = null;
	
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj = new CheckBoxPage();
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
	public void clickoncheckbox() 
	{
		obj.clickoncheckbox();
	}
	
	@Test(priority=5)
	public void clickonmobilecheckbox() 
	{
		obj.clickonmobilecheckbox();
	}

}
