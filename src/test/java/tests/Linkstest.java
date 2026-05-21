package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Linkspage;

public class Linkstest extends Baselibrary
{
	Linkspage obj;
	@BeforeTest
	public void launchurl() 
	{
		launchUrl();
		obj=new Linkspage();
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
	public void clickonlinks() 
	{
		obj.clickonlinks();
	}
	
	@Test(priority=5)
	public void clickondemo() 
	{
		obj.clickondemo();
	}
	
	@Test(priority=6)
	public void clickonclosenewtab() throws InterruptedException 
	{
		//navigatetonewtab(1);
		obj.clickonclosenewtab();
		//Thread.sleep(2000);
		//navigatetonewtab(0);

	}

}
