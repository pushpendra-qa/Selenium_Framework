package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.ModalPage;
import pages.SelectMenuPage;

public class SelectMenuTest extends Baselibrary
{
	SelectMenuPage obj=null;
	@BeforeTest
	public void launchurl()
	{
		launchUrl();
		obj = new SelectMenuPage();
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
	public void clickonwidget() 
	{
		obj.clickonwidget();
	}
	
	@Test(priority=4)
	public void clickonselectmenu() 
	{
		obj.clickonselectmenu();
	}
	
	@Test(priority=5)
	public void clickondropdown() 
	{
		obj.clickondropdown();
	}
	


}
