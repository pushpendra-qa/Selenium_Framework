package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.ModalPage;

public class ModalTest extends Baselibrary
{
	ModalPage obj=null;
	@BeforeTest
	public void launchurl()
	{
		launchUrl();
		obj = new ModalPage();
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
	public void clickonmodal() 
	{
		obj.clickonmodal();
	}
	
	@Test(priority=5)
	public void clickonsmallmodal() 
	{
		obj.clickonsmallmodal();
	}
	
	@Test(priority=6)
	public void clickonsmallclose() 
	{
		obj.clickonsmallclose();
	}


}
